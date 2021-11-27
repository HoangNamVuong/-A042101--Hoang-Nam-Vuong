package dictionary.controller;

import dictionary.model.Dictionary;
import dictionary.service.DictionaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DictionaryController {
//    private DictionaryServiceImpl dictionaryService = new DictionaryServiceImpl();
    @Autowired
    DictionaryServiceImpl dictionaryService;

    @GetMapping("/form")
    public String search() {
        return "form";
    }

    @PostMapping("/result")
    public String meaning(@RequestParam String keyword, Model model) {
        List<Dictionary> dictionaryList = this.dictionaryService.findAll();
        for (int i = 0; i < dictionaryList.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaryList.get(i).getEnglish())) {
                model.addAttribute("word",dictionaryList.get(i).getVietnam());
                model.addAttribute("key", keyword);
            }
        }
        return "result";
    }
}
