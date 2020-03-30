package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    public static boolean isIsogram(String str) {
        String letterX;
        String letterY;
        for (int i = 0; i < str.length() - 1; i++) {
            letterX = String.valueOf(str.charAt(i)).trim().toLowerCase();
            for (int j = i + 1; j < str.length(); j++) {
                letterY = String.valueOf(str.charAt(j)).trim().toLowerCase();
                if (letterY.equals(letterX)) {
                    return false;
                }
            }
        }
        return true;
    }

}
