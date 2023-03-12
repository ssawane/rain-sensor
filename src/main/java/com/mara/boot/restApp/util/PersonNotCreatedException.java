package com.mara.boot.restApp.util;

public class PersonNotCreatedException extends RuntimeException {

    public PersonNotCreatedException(String msg) {
        super(msg);
    }
}
