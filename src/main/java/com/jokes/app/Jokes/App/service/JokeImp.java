package com.jokes.app.Jokes.App.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokeImp implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeImp(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
       return chuckNorrisQuotes.getRandomQuote();
    }
}
