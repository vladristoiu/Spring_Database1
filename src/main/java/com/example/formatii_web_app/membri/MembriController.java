package com.example.formatii_web_app.membri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MembriController {
    @Autowired
    private MembriService service;

    @GetMapping("/membri")
    public String showMembriList(Model model){
        List<Membri> membriList = service.listAll();
        model.addAttribute("membriList", membriList);

        return "membri";
    }

    @GetMapping("/membri/adaugare")
    public String showNewForm(Model model) {
        model.addAttribute("membru", new Membri());

        return "adaugare_membru";
    }

    @PostMapping("/membri/save")
    public String saveUser(Membri membru) {
        service.save(membru);

        return "redirect:/membri";
    }

    @GetMapping("/membri/editare/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
            Membri membru = service.get(id);
            model.addAttribute("membru",membru);

            return  "editare_membru";
    }

    @GetMapping("/membri/delete/{id}")
    public String deleteMembri(@PathVariable("id") Integer id){
        service.delete(id);
        return "redirect:/membri";
    }
}
