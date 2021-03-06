package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxGetController {
    @ResponseBody
    @GetMapping("/getUser")
    public User getUserByName(String name, @RequestParam(name = "age", defaultValue = "18") int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
