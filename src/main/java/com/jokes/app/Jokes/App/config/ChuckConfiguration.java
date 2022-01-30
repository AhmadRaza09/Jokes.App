package com.jokes.app.Jokes.App.config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();
    }
}
