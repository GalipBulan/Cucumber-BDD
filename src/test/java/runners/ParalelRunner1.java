package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // Paralel Ranner calistirmak istiyorsak paralel calistiracagimiz ranner isimleinde
        // ortak ifadelerin olmasi gerekir. Ornegin ParalelRunner1, ParalelRunner2  icin ParalelRunner ortaktir

        // Bunun icin pomm exm le Plugin eklerken  dependencies disinda projeckt icinde kaliriz

        plugin={"html:target/cucumber-reports-p1.html",
                // Farkli ranner de calistigi icin raporlara hangi
                // rannerde calistigini anlamk icin ranner ismini hatirlatici ifadeler eklemeliyiz
                "json:target/json-reports/cucumberp1.json",
                "junit:target/xml-report/cucumberp1.xml"
        },
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags= "@p1",
        dryRun = false
)

public class ParalelRunner1 {
    /*
        Cucumber'da Runner class'i bos bir class'tir
        Runner class'ini diger class'lardan farkli kilan
        ve TestNG'deki xml dosyalari gibi calismasini saglayan
        2 adet notasyon mevcuttur
        @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebibidir
        bu sayede runner class'larimiz cucumber ile calisir
        @CucumberOptions notasyonu ile istedigimiz ozellikleri Runner class'ina ekleyebiliriz
        Raporlama gibi ekstra option'lari da ileride ekleyecegiz
        Ancak
        oncelikli gorevi features dosyalari ile stepdefinitions'da bulunan
        Java method'larini ilisiklendirmektir
        tags : features classoru icerisinde yazilan tag(lari) aratip
        buldugu tum feature veya scenario'lari calistirir
        dryRun : iki deger alabilir
        true : secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
                eksik stepdefinitions'lari bulup
                ilgili method'lari olusturur
                Hic bir sekilde testimizi calistirmaz
                eksik adim yoksa test passed olarak isaretler
        false : secilirse, verilen tag ile isaretlenen
                Feature veya Scenario'lari calistirir
     */
}
