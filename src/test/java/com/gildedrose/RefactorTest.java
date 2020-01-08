package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefactorTest {
    @Test
    public void compare_old_code_with_new() {
        ByteArrayOutputStream oldBaos = new ByteArrayOutputStream();
        PrintStream oldPrint = new PrintStream(oldBaos);
        System.setOut(oldPrint);

        TexttestFixture.beforeRefactorTextTestFixture(new String[] {});
        System.out.flush();

        ByteArrayOutputStream newBaos = new ByteArrayOutputStream();
        PrintStream newPrint = new PrintStream(newBaos);
        System.setOut(newPrint);

        TexttestFixture.afterRefactorTextTestFixture(new String[] {});
        System.out.flush();

        assertEquals(newBaos.toString(), oldBaos.toString());
    }
}
