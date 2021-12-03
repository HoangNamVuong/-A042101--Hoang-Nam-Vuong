package email.controller;


import email.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/email")
public class EmailController {
    private List<Email> emailList = new ArrayList<>();

    @GetMapping("/create")
    public String displayForm(Model model) {
        List<String> listLanguages = new ArrayList<>();
        List<String> listPageSizes = new ArrayList<>();
        List<String> listSpamFilters = new ArrayList<>();
        listLanguages.add("English");
        listLanguages.add("VietNamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
        listPageSizes.add("5");
        listPageSizes.add("10");
        listPageSizes.add("15");
        listPageSizes.add("25");
        listSpamFilters.add("Enable spams filter");
        model.addAttribute("email", new Email());
        model.addAttribute("listLanguages", listLanguages);
        model.addAttribute("listPageSizes", listPageSizes);
        model.addAttribute("listSpamFilters", listSpamFilters);
        return "email/create";
    }
}
