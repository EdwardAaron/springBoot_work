package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxPostController {
    @ResponseBody
    @PostMapping("/saveUser")
    public User saveUser(User user) {
        user.setId(1);
        return user;
    }
}
