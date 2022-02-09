package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/ajax")
    public String ajax(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "ajax";
    }

    @GetMapping("/ajaxGet")
    public String ajaxGet(@RequestParam(name = "name", required = false, defaultValue = "lucia") String name
            , @RequestParam(name = "age", required = false, defaultValue = "18") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "ajaxGet";
    }
    @GetMapping("/ajaxPost")
    public String ajaxPost(@RequestParam(name = "name", required = false, defaultValue = "lucia") String name
            , @RequestParam(name = "age", required = false, defaultValue = "18") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "ajaxPost";
    }
    @GetMapping("/ajaxGetScript")
    public String ajaxGetScript(@RequestParam(name = "name", required = false, defaultValue = "lucia") String name
            , @RequestParam(name = "age", required = false, defaultValue = "18") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "ajaxGetScript";
    }
    @GetMapping("/ajaxLoad")
    public String ajaxLoad(@RequestParam(name = "name", required = false, defaultValue = "lucia") String name
            , @RequestParam(name = "age", required = false, defaultValue = "18") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "ajaxLoad";
    }
}
