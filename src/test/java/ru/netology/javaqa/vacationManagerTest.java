package ru.netology.javaqa;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class vacationManagerTest {

    public int calcBonus(int initialBalance, int monthlyIncome, int monthlyExpense) {
        int months = 0;
        int balance = initialBalance;
        while (balance >= monthlyExpense) {
            balance -= monthlyExpense;
            balance += monthlyIncome;
            months++;
        }
        return months;
    }

    @Test
    public void test() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(10000, 3000, 20000);
        assertEquals(3, months);
    }

    @Test

    public void testMonth2() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(40000, 3000, 20000);
        assertEquals(4, months);
    }

    @Test
    public void testMonth3() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(80000, 3000, 20000);
        assertEquals(5, months);
    }

    @Test
    public void testMonth4() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(120000, 3000, 20000);
        assertEquals(6, months);
    }

    @Test
    public void testMonth5() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(160000, 3000, 20000);
        assertEquals(3, months);
    }

    @Test
    public void testMonth6() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(33333, 3000, 20000);
        assertEquals(4, months);
    }


    @Test
    public void testMonth7() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(73333, 3000, 20000);
        assertEquals(5, months);
    }


    @Test
    public void testMonth8() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(113333, 3000, 20000);
        assertEquals(6, months);
    }


    @Test
    public void testMonth9() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(153333, 3000, 20000);
        assertEquals(3, months);
    }


    @Test
    public void testMonth10() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(31111, 3000, 20000);
        assertEquals(4, months);
    }


    @Test
    public void testMonth11() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(71111, 3000, 20000);
        assertEquals(5, months);
    }


    @Test
    public void testMonth12() {
        vacationManagerTest vacationManager = new vacationManagerTest();
        int months = vacationManager.calcBonus(111111, 3000, 20000);
        assertEquals(6, months);
    }
}
