package exam.controller;

import exam.model.Film;
import exam.model.Product;
import exam.model.ProductType;
import exam.model.ShowTime;
import exam.service.IFilmService;
import exam.service.IProductService;
import exam.service.IProductTypeService;
import exam.service.IShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductTypeService productTypeService;

    @Autowired
    IProductService productService;

    @ModelAttribute("productTypeList")
    public Iterable<ProductType> productTypeList(Model model) {
        return productTypeService.findAll();
    }

    @GetMapping
    public String showProductList(@PageableDefault(size = 5) Pageable pageable, Model model) {
        Page<Product> productPage = productService.findAll(pageable);
        model.addAttribute("productPage", productPage);
        return "product/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("productTypeList", productTypeService.findAll());
        return "product/create";
    }

    @PostMapping("/create")
    public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult,
                                 Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "product/create";
        } else {
            if (productService.existsById(product.getId())) {
                model.addAttribute("msg", "duplicated name");
                return "product/create";
            } else {
                productService.save(product);
                redirectAttributes.addFlashAttribute("message", "Create successfully!");
                return "redirect:/product";
            }
        }
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable String id, Model model) {
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()) {
            model.addAttribute("product", product.get());
            return "product/edit";
        } else {
            return "error.404";
        }
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("product") Product product,
                               Model model, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "Edit successfully");
        return "redirect:/product";
    }
//
    @GetMapping("/delete/{id}")
    public String showDeleteShow(@PathVariable String id, Model model) {
        Optional<Product> product = productService.findById(id);
        model.addAttribute("product", product.get());
        return "product/delete";
    }
//
    @PostMapping("/delete")
    public String deleteShow(@RequestParam String id, Model model) {
        productService.remove(id);
        return "redirect:/product";
    }
//
    @PostMapping("search")
    public String search(@RequestParam @PageableDefault(size = 5) String name,
                         Model model, Pageable pageable) {
        Page<Product> productPage = productService.searchByName(name, pageable);
        model.addAttribute("productPage", productPage);
        return "product/list";
    }
}
