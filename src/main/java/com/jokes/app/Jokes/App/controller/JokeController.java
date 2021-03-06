package com.jokes.app.Jokes.App.controller;


import com.jokes.app.Jokes.App.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokeController {


    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String retrieveJoke(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
