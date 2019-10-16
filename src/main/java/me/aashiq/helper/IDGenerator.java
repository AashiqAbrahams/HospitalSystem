package me.aashiq.helper;

import java.util.UUID;

public class IDGenerator {

    public static String generateId(){
        return UUID.randomUUID().toString();
    }

}
