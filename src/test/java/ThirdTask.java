import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class ThirdTask {

    @DataProvider(name = "DP")
    public Object[][] dpMethod(Method ageCalc){
        return new Object[][]{
                {RandomDateGeneratorClass.GeneratorOfRandomYear(), RandomDateGeneratorClass.GeneratorOfRandomMonth(), RandomDateGeneratorClass.GeneratorOfRandomDay()},
                {RandomDateGeneratorClass.GeneratorOfRandomYear(), RandomDateGeneratorClass.GeneratorOfRandomMonth(), RandomDateGeneratorClass.GeneratorOfRandomDay()},
                {RandomDateGeneratorClass.GeneratorOfRandomYear(), RandomDateGeneratorClass.GeneratorOfRandomMonth(), RandomDateGeneratorClass.GeneratorOfRandomDay()}
        };
    }

    @Test(description = "Check that the client is 18 yo", dataProvider = "DP")

    public void testClient(int year, int month, int dayOfMonth){

        Assert.assertTrue(ClAge.ageCalc(year, month, dayOfMonth) == 18, "The client isn't 18 years old");

    }
}
