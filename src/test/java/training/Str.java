package training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Str {
@Test
    public void test1() {
        String concat1 = "simple" + " " + "test";
        Assert.assertEquals(concat1, "simple test");
    }
}
