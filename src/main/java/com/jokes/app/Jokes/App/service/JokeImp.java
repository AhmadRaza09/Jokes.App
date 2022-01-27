package com.jokes.app.Jokes.App.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokeImp extends ChuckNorrisQuotes implements JokeService {
    @Override
    public String getJoke() {
       return getRandomQuote();
    }
}
