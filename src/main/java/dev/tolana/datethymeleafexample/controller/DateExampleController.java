package dev.tolana.datethymeleafexample.controller;


import dev.tolana.datethymeleafexample.model.DateModelExample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.Date;

@Controller
public class DateExampleController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("model", new DateModelExample());
        return "index";
    }

    @GetMapping("/show")
    public String show(Model model) {
        DateModelExample dateModelExample = new DateModelExample();
        dateModelExample.setName("Passing a date to a form.");
        dateModelExample.setDate(LocalDate.parse("2024-05-14"));
        model.addAttribute("model", dateModelExample );
        return "showDate";
    }


    @PostMapping("/save")
    public String save(DateModelExample dateModelExample) {
        System.out.println("Date Mapping " +  dateModelExample.getDate());
        return "redirect:/";
    }

}
