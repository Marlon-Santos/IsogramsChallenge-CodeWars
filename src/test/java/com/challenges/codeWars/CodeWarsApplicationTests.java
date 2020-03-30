package com.challenges.codeWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.challenges.codeWars.CodeWarsApplication.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeWarsApplicationTests {
    @Test
    public void test1() {
        assertEquals(true, isIsogram("Dermatoglyphics"));
        assertEquals(true, isIsogram("isogram"));
        assertEquals(false, isIsogram("moose"));
        assertEquals(false, isIsogram("isIsogram"));
        assertEquals(false, isIsogram("aba"));
        assertEquals(false, isIsogram("moOse"));
        assertEquals(true, isIsogram("thumbscrewjapingly"));
        assertEquals(true, isIsogram(""));
    }

}
