package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void whatever() {
        final int[] actual = Difficulty.boardrules(4);
        final int[] expected = new int[]{3,3,2};
        Assertions.assertEquals(expected,actual,"whadda hell");
    }
}
