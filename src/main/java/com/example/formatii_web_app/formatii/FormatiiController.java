package com.example.formatii_web_app.formatii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FormatiiController {
    @Autowired
    private FormatiiService service;

    @GetMapping("/formatii")
    public String showFormatiiList(Model model){
        List<Formatii> formatiiList = service.listAll();
        model.addAttribute("formatiiList", formatiiList);

        return "formatii";
    }

    @GetMapping("/formatii/adaugare")
    public String showNewForm(Model model) {
        model.addAttribute("formatie", new Formatii());

        return "adaugare_formatie";
    }

    @PostMapping("/formatii/save")
    public String saveUser(Formatii formatie) {
        service.save(formatie);

        return "redirect:/formatii";
    }

    @GetMapping("/formatii/editare/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
            Formatii formatie = service.get(id);
            model.addAttribute("formatie",formatie);

            return  "editare_formatie";
    }

    @GetMapping("/formatii/delete/{id}")
    public String deleteFormatii(@PathVariable("id") Integer id){
            service.delete(id);
        return "redirect:/formatii";
    }
}
