package gun01;

import org.testng.annotations.Test;
import org.testng.junit.JUnit3TestClass;

public class _01_giris {
//    public static void main(String[] args) {
//
//        webSitesiniAc();
//        loginIsleminiYap();
//        driverKapat();
//
//        @Test JUnit
//                public void Test1(){
//            webSitesiniAc();
//            loginIsleminiYap();
//            driverKapat();
//
//
//        }
// eger herhangi bir sira verilmezse alfabetik calisilir.

  @Test(priority = 1)
  void   weSitesiniAc(){
      System.out.println("driver tanimlandi ve web sitesi acildi.");
  }

  @Test(priority = 2)
    void loginIsleminiYap(){
      System.out.println("login Islemi Yapildi");
  }

  @Test(priority = 3)
    void driveriKapat(){
      System.out.println("driver kapatildi ve cikildi.");
  }
    }

