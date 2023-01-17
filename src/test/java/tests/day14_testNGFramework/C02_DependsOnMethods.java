package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C02_DependsOnMethods {

    // oncelik siralamasina karismaz, ama sira kendisine geldiginde
    //bagli oldugu methodun calismis ve passed olmus olmasini ister

    @Test()

    public void ilkTest(){
        System.out.println("ilk test calisti");
    }

    @Test (dependsOnMethods = "IlkTest")

    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }

    @Test (dependsOnMethods = "ikinciTest")
    public void ucuncuTest(){
        System.out.println("ucuncu test calisti");
    }

// normalde TestNG harf sirasina gore calistirir
// siralama ikinci-birinci-ucuncu olur
// ancak dependsOn var, ikinci testin calisma kosulu 1. nin calismis olmasi oldugundan
// siralama degismis olur
// ilk-ikinci-ucuncu oldu
// sadece ikinci testi calistirmak istesek, 1 e bagli oldugundan
// once 1 i calistirir sonra 2 calisir
// ama birden fazla bagimliklik varsa ve sadece 1 i calissa hata verir
// sadece 3 u calistirsak hata verir

// ilk test calissa ama failed olsa, hata veriri cunku ikincinin sarti 1. passed olmasi
// bu durumda 1 hata verir, 2 ve 3 ignore edilir





}
