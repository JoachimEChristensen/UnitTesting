/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import joachim.unittesting.*;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author Joachim
 */
public class calculateYearlyMethodTest {
    
    static boolean Running = false;
     
    public calculateYearlyMethodTest() {
       
    }
    
//    @BeforeClass
//    public static void switchOn() {
//        org.junit.Assume.assumeTrue(Running);
//    }
    
    @Test
    public void one() {
        Account acc = new Account(0);
        assertEquals(0.03, Bank.calculateYearlyInterest(acc), 0);
    }
    
    @Test
    public void two() {
        Account acc = new Account(1000);
        assertEquals(0.05, Bank.calculateYearlyInterest(acc), 0);
    }
    
    @Test
    public void three() {
        Account acc = new Account(3000);
        assertEquals(0.07, Bank.calculateYearlyInterest(acc), 0);
    }
    
    @Test
    public void four() {
        Account acc = new Account(0);
        assertTrue(Bank.calculateYearlyInterest(acc) == 0.03);
    }
    
    @Test
    public void five() {
        Account acc = new Account(0);
        assertFalse(0.05 == Bank.calculateYearlyInterest(acc));
    }
    
    @Test
    public void six() {
        Account acc = new Account(0);
        assertNotNull(Bank.calculateYearlyInterest(acc));
    }
    
    @Test(timeout=5000)
    public void seven() throws InterruptedException {
//        Thread.sleep(8000);
        Account acc = new Account(150);
        assertNotSame(0.05, Bank.calculateYearlyInterest(acc));
    }
    
//    @Disable
    @Test
    public void eight() {
        Account acc = new Account(888888888);
        assertTrue(0.07 == Bank.calculateYearlyInterest(acc));
    }
    
    /*@Test
    public void All() {
        
        assertAll("Memes", 
        () -> assertEquals(0.03, Bank.calculateYearlyInterest(New Account(50)), 0),
        () -> assertEquals(0.05, Bank.calculateYearlyInterest(New Account(150)), 0),
        () -> assertEquals(0.07, Bank.calculateYearlyInterest(New Account(5000)), 0),
        () -> assertTrue(Bank.calculateYearlyInterest(New Account(50)) == 0.03),
        () -> assertFalse(0.05 == Bank.calculateYearlyInterest(New Account(50))),
        () -> assertNotNull(Bank.calculateYearlyInterest(New Account(0))),
        () -> assertNotSame(0.05, Bank.calculateYearlyInterest(New Account(540))),
        () -> assertTrue(0.07 == Bank.calculateYearlyInterest(New Account(88888888)))
        );
    }*/
    
    /*
    @Test
    public void lambda() {
        Runnable r = () -> System.out.println("Hello World!");
        AssertEquals(System.out.println("Hello World!"), r.run());
    }
    */
}
