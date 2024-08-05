package com.ideas.parametrized;

import java.util.Base64;

public class Encryption {

    public static String encrypt(String text, boolean isEncrypted) {
        if(!isEncrypted){
            return Base64.getEncoder().encodeToString(text.getBytes());
        }
        return text;
    }

}
