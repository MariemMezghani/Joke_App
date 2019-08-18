package com.udacity.gradle.builditbigger.backend;

import com.example.android.jokelib.JokeProvider;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        JokeProvider jokeProvider = new JokeProvider();

        myData=jokeProvider.tellJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}