package com.user.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class securitycontroller {
    @RequestMapping(method = RequestMethod.GET)
    public String welcome(Model model, Principal principal){
        model.addAttribute("user", principal.getName());
        return "welcome";
    }
}
