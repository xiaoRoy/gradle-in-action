package com.learn.gradleinaction.tasks;

import org.gradle.api.DefaultTask;

import javax.inject.Inject;

public class WhatTask extends DefaultTask {

    final String message;
    final int number;


    @Inject
    public WhatTask(String message, int number) {
        this.message = message;
        this.number = number;
    }
}
