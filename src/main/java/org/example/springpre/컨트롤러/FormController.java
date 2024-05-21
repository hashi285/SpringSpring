package org.example.springpre.컨트롤러;


import org.example.springpre.도메인.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("userForm", new UserForm());
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(@RequestParam String username,
                             @RequestParam String password){
        return "result";
    }
}
