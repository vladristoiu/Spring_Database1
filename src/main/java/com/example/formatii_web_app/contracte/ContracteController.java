package com.example.formatii_web_app.contracte;

import com.example.formatii_web_app.formatii.Formatii;
import com.example.formatii_web_app.formatii.FormatiiService;
import com.example.formatii_web_app.membri.Membri;
import com.example.formatii_web_app.membri.MembriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ContracteController {
    @Autowired
    private ContracteService contractService;

    @Autowired
    private FormatiiService formatieService;

    @Autowired
    private MembriService membruService;

    @GetMapping("/contracts")
    public String showContracteList(Model model){
        List<Contracte> contractsList = contractService.listAll();
        model.addAttribute("contractsList", contractsList);

        return "contracts";
    }

    @GetMapping("/contracts/adaugare")
    public String showNewForm(Model model) {
        List<Formatii> formatieList = formatieService.listAll();
        List<Membri> membruList = membruService.listAll();
        model.addAttribute("contract", new Contracte());
        model.addAttribute("formatieList", formatieList);
        model.addAttribute("membruList", membruList);


        return "adaugare_contract";
    }

    @PostMapping("/contracts/save")
    public String saveUser(Contracte contract) {
        contractService.save(contract);

        return "redirect:/contracts";
    }

    @GetMapping("/contracts/editare/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Contracte contract = contractService.get(id);

        List<Formatii> formatieList = formatieService.listAll();
        List<Membri> membruList = membruService.listAll();
        model.addAttribute("contract", contract);
        model.addAttribute("formatieList", formatieList);
        model.addAttribute("membruList", membruList);

        return "editare_contract";
    }

    @GetMapping("/contracts/delete/{id}")
    public String deleteContracte(@PathVariable("id") Integer id){
        contractService.delete(id);
        return "redirect:/contracts";
    }
}
