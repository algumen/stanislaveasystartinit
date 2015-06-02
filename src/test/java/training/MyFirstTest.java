package training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {
@Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        Assert.assertEquals(answer, 4, "2+2");
    }
}
