package cart.controller;

import cart.model.Cart;
import cart.model.Product;
import cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id,
                            @ModelAttribute Cart cart,
                            @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("plus")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        if (action.equals("minus")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        if (action.equals("delete")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shoping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }

    @GetMapping("/detail")
    public String detailProduct(@RequestParam("id") Long id, Model model) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        model.addAttribute("product", productOptional.get());
        return "/detail";
    }
}
