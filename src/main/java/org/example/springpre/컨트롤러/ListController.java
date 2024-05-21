package org.example.springpre.컨트롤러;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ListController {
    @GetMapping("/list")
    public String showList(Model model) {
        List<String> items = Arrays.asList("Item1","Item2", "Item3", "Item4");
        model.addAttribute("items", items);
        return "list";
    }
}
