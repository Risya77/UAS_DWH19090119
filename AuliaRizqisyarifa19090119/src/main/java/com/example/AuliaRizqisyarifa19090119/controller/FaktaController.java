package com.example.AuliaRizqisyarifa19090119.controller;

import com.example.AuliaRizqisyarifa19090119.domain.Fakta;
import com.example.AuliaRizqisyarifa19090119.service.FaktaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FaktaController {
    @Autowired
    private FaktaService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Fakta> listfakta = service.listAll();
        model.addAttribute("listfakta", listfakta);
        System.out.print("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("fakta", new Fakta());
        return "new";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveFakta(@ModelAttribute("fakta") Fakta fkt) {
        service.save(fkt);
        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditFaktaPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Fakta fkt= service.get(id);
        mav.addObject("fakta", fkt);
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String deleteFaktaPage(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }

}
