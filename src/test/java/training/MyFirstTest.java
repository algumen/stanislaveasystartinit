package training;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MyFirstTest {
    public void canAddTwoPlusTwo(){
        int answer = 2 + 2;
        Assert.assertEquals(answer, 4, "2+2");
    }
}
