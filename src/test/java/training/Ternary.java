package training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ternary {
    @Test
    public void ternaryOperatorsExplored(){
        int x;
        x = 4>3 ? 2 : 1;
        Assert.assertEquals(x, 2);
        Assert.assertTrue(5>=4 ? true : false);
    }
}
