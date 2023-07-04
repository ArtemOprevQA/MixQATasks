import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Test
public class MyTestGoogle {

    public void openBrowser(){
        open("https://www.google.com");
        $(By.id("APjFqb")).setValue("libertex group").pressEnter();
        $(By.id("rso")).shouldHave(Condition.text("libertex group"));
    }
}
