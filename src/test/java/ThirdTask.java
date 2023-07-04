import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class ThirdTask {

    @DataProvider(name = "DP")
    public Object[][] dpMethod(Method ageCalc){
        return new Object[][]{
                {2023, 7, 4}, // клиенту = 0
                {2004, 7, 4}, // клиенту = 18
                {1989, 8, 15}, // клиенту > 18
                {2006, 11, 23} // клиенту < 18
        };
    }

    @Test(description = "Check that the client is adult", dataProvider = "DP")

    public void testClient(int year, int month, int dayOfMonth){

        Assert.assertTrue(ClAge.ageCalc(year, month, dayOfMonth) >= 18, "The client isn't adult");

    }
}
