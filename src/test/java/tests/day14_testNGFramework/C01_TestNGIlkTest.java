package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    // TestNG test metodlarini isim sirasina gore calistirir
    // kendimiz oncelik vermek istersek, @Test yanina () ac
    // prioroty yaz ve deger ver (numara)
    // priority degeri verilen methodlar, priority degeri
    // kucukten buyuge dogru calisir
    // esit olan  priority degeri verilmisse bunlarda alfabetik siraya gore calistirir)
    // priorty degeri yazilmazsa 0 kabul eder ve en once calisir
    // - deger de verilebilir, matematiksel -9,, 7, 0 olsa once -9 sonra 0 calisir

    @Test (priority = 6)

    public void ilkTest(){
        System.out.println("ilk test calisti");
    }

    @Test (priority = 9)
    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }

    @Test (priority = 44)
        public void ucuncuTest(){
        System.out.println("ucuncu test calisti");
    }
}
