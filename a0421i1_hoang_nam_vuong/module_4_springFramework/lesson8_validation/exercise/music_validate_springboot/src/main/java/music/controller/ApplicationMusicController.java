package music.controller;

import music.entity.ApplicationMusic;
import music.service.IApplicationMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ApplicationMusicController {

    @Autowired
    IApplicationMusicService applicationMusicService;

    @GetMapping("/create-app")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/application/create");
        modelAndView.addObject("application", new ApplicationMusic());
        return modelAndView;
    }

    @PostMapping("/create-app")
    public ModelAndView create(@Validated @ModelAttribute("application") ApplicationMusic applicationMusic, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("/application/create");
            return modelAndView;
        }
        applicationMusicService.save(applicationMusic);
        ModelAndView modelAndView = new ModelAndView("/application/create");
        modelAndView.addObject("application", applicationMusic);
        modelAndView.addObject("message", "application created successfully");
        return modelAndView;
    }

    @GetMapping("/application")
    public ModelAndView showList() {
        List<ApplicationMusic> applicationMusics = applicationMusicService.findAll();

        ModelAndView modelAndView = new ModelAndView("/application/index");
        modelAndView.addObject("application", applicationMusics);
        return modelAndView;
    }

    @GetMapping("/edit-application/{id}")
    public ModelAndView showUpdateForm(@PathVariable Long id) {
        ApplicationMusic applicationMusic = applicationMusicService.findById(id);
        if (applicationMusic != null) {
            ModelAndView modelAndView = new ModelAndView("/application/edit");
            modelAndView.addObject("application", applicationMusic);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-application")
    public ModelAndView update(@ModelAttribute("blog") ApplicationMusic applicationMusic) {
        applicationMusicService.save(applicationMusic);

        ModelAndView modelAndView = new ModelAndView("/application/edit");
        modelAndView.addObject("application", applicationMusic);
        modelAndView.addObject("message", "Updated application successfully");
        return modelAndView;
    }

    @GetMapping("/delete-application/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        ApplicationMusic applicationMusic = applicationMusicService.findById(id);

        if (applicationMusic != null) {
            ModelAndView modelAndView = new ModelAndView("/application/delete");
            modelAndView.addObject("application", applicationMusic);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-application")
    public String delete(@ModelAttribute("application") ApplicationMusic applicationMusic) {
        applicationMusicService.remove(applicationMusic.getId());
        return "redirect:/application";
    }

    @GetMapping("/view-application/{id}")
    public ModelAndView view(@PathVariable Long id) {
        ApplicationMusic applicationMusic = applicationMusicService.findById(id);

        if (applicationMusic != null) {
            ModelAndView modelAndView = new ModelAndView("/application/view");
            modelAndView.addObject("application", applicationMusic);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
}
