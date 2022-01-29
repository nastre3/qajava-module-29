import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {

    @DataProvider(name = "ageDataProvider")
    Object[][] sumDataProvider() {
        return new Object[][] {
                {-1, false},
                {0, false},
                {12, false},
                {13, true},
                {15, true},
                {19, true},
                {20, false},
                {123, false},
        };
    }


    @Test(dataProvider = "ageDataProvider")
    public void testIsTeenager(int a, boolean expectedRes)
    {
        boolean result = Person.isTeenager(a);
        assertEquals(result, expectedRes);
    }

    @Test(dataProvider = "ageDataProvider")
    public void testIsTeenagerCorrected(int a, boolean expectedRes)
    {
        boolean result = PersonCorrected.isTeenager(a);
        assertEquals(result, expectedRes);
    }
}
