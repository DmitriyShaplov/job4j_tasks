package ru.shaplov.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.shaplov.mvc.model.SampleModel;

/**
 * @author shaplov
 * @since 08.08.2019
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @PostMapping("/second")
    public ModelAndView secondPage(@ModelAttribute SampleModel sample) {
        return new ModelAndView("second", "sample", sample);
    }
}
