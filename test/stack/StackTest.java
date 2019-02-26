/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;


import java.util.EmptyStackException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aladdin
 */
public class StackTest {
    
    public static final String CAP = "cap";
    private Stack s = new Stack(20);
    
    private void assertStackSize(int theSize){
        assertEquals(theSize, s.size());
    }
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testEmptyStack() throws Exception{
        assertStackSize(0);
    }
    
    @Test
    public void stackIsNotEmpty() throws Exception{
        s.push(CAP);
        assertStackSize(1);
    }
    
    @Test
    public void pushAndPop() throws Exception{
        s.push(CAP);
        s.pop();
        assertStackSize(0);
    }
    
    @Test
    public void popEmptyStackException() throws Exception{
        s.pop();
    }
    
    @Test
     void pushFullStackException() throws Exception{
        s = new Stack(0);
        s.push(CAP);
    }
    
    @Test
    public void popReturnPush() throws Exception{
        s.push(CAP);
        String capPopped = s.pop();
        assertEquals(CAP, capPopped);
    }
    
    @Test
    public void returnPush() throws Exception{
        s.push("pushed 1");
        s.push("pushed 2");
        String popped1 = s.pop();
        String popped2 = s.pop();
        assertEquals("pushed 2", popped1);
        assertEquals("pushed 1", popped2);

    }
    
    
}
