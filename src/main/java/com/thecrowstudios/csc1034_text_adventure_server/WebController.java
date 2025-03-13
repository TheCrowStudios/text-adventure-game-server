package com.thecrowstudios.csc1034_text_adventure_server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String getIndex() {
        return "login.html";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register.html";
    }

    @GetMapping("/game-menu")
    public String getGameMenu() {
        return "game-menu.html";
    }

    @GetMapping("/game")
    public String getGame() {
        return "game.html";
    }
}