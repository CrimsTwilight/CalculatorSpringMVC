package by.crims.controller;

import by.crims.entity.Operation;
import by.crims.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculation")
public class CalcController {

    @Autowired
    private CalcService calcService;

    @GetMapping
    public String calc() {
        return "calculation";
    }

    @PostMapping
    public String calc(Operation operation, Model model) {
        model.addAttribute("result", calcService.getResult(operation));
        return "calculation";
    }

}