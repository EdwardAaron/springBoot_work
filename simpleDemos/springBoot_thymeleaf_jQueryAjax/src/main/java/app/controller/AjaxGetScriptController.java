package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxGetScriptController {
    @ResponseBody
    @GetMapping("/getScript")
    public String getUserByName(String name, @RequestParam(name = "age", defaultValue = "18") int age) {
        return "console.log('hello world')";
    }
}
