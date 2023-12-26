package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.TestOzgurMain;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOzgur {
    TestOzgurMain test1;
    @BeforeAll
    public static void start(){
        System.out.println("Test started");

    }
    @BeforeEach
    public void testCaseStarter(){
       test1=new TestOzgurMain();
        System.out.println("Test case started");
    }
    @AfterEach
    public void testCaseFinisher(){
        test1=null;
        System.out.println("Test case finished");
    }
    @AfterAll
    public static void finish(){
        System.out.println("Test finished");
    }
    @Test
    public void TestGs(){
       TestOzgurMain.Ozgur ozgur1= test1.changeState(TestOzgurMain.Ozgur.GS);
        assertEquals(ozgur1, TestOzgurMain.Ozgur.denver,"hello gardas");
    }


}
