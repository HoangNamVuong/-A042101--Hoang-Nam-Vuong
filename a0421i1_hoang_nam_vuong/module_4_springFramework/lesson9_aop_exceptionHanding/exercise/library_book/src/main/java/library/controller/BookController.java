package library.controller;

import library.exception.NotAvailableException;
import library.model.Book;
import library.service.IBookService;
import library.service.IKeycodeService;
import library.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @Autowired
    IBookService bookService;

    @Autowired
    IKeycodeService keycodeService;

    @Autowired
    IStatusService statusService;

    @GetMapping("/books")
    public String view(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "book/view";
    }

    @GetMapping("book/create")
    public String create(Model model) {
        model.addAttribute("book", new Book());
        return "book/create";
    }

    @PostMapping("create")
    public String createBook(Model model, @ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:books";
    }

    @GetMapping("/borrow")
    public String borrow(Model model, @RequestParam Long id) throws NotAvailableException {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        model.addAttribute("availableKeycode", bookService.getNextAvailableKeycode(book));
        return "book/borrow";
    }

    @PostMapping("/borrow")
    public String borrowBook(@ModelAttribute Book book, @RequestParam Integer usedKeycode) {
        bookService.borrow(book,usedKeycode);
        return "redirect:books";
    }
}
