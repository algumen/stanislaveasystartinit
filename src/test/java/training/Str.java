package training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Str {
    @Test
    public void test1() {
        String concat1 = "simple" + " " + "test";
        Assert.assertEquals(concat1, "simple test");
    }

    @Test
    public void test2() {
        String concat2 = 2 + "3" + "5";
        Assert.assertEquals(concat2, "235");
    }

    @Test
    public void test3() {
        String concat3 = 2 + 3 + "5";
        Assert.assertEquals(concat3, "55");
    }

}
