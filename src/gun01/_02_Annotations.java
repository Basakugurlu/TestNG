package gun01;

import org.testng.annotations.*;
import utility.BaseDriver;

public class _02_Annotations extends BaseDriver {
    /*
    @BeforeClass--> Classsin basinda calisacak
    @BeforeMethod-->heer metoddan (test metodlari) once calisacak
    @Test-->testlerin calistigi metodlar
    @Test-->testlerin calistigi metodlar

   @AfterMethod-->her metoddan sonra calisacak
     */
    @BeforeClass
    void beforeClass() {
        System.out.println("her classdan once calisacak");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("her methoddan once calisacak");
    }

    @AfterMethod
    void afterMethod() {

        System.out.println("her metoddan sonra calisacak");

    }

    @AfterClass
    void afterClass() {
        System.out.println("her class dan sonra calisacak");
    }

    @Test
    void Test1() {
        System.out.println("test1 calisti");
    }

    @Test
    void test2() {
        System.out.println("test2 calisti");

    }
}
