package by.crims.controller;

import by.crims.entity.User;
import by.crims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String reg(Model model){
        model.addAttribute("newUser", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String reg(User user){
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/authorization")
    public String auth(){
        return "authorization";
    }

    @PostMapping("/authorization")
    public String auth(User user, Model model, HttpSession httpSession){
        User byUsername = userService.findByUsername(user.getUsername());
        if (byUsername != null){
            if (byUsername.getPassword().equals(user.getPassword())){
                httpSession.setAttribute("user", byUsername);
                return "redirect:/";
            } else {
                model.addAttribute("message", "Wrong password!");
            }
        } else {
            model.addAttribute("message", "User not found!");
        }
        return "authorization";
    }

}