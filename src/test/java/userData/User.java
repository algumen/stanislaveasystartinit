package userData;

import org.testng.Assert;
import org.testng.annotations.Test;

public class User {
    public String username = "TestUsername";
    public String password = "TestPassword";

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Test
    public void User(){
        User myUser = new User();
        this.username = "TestUsername";
        Assert.assertEquals(username, "TestUsername");
    }
@Test
        public void User(String username, String password){
        this.username = username;
        this.password = password;
        Assert.assertEquals(username, "TestUsername");
        Assert.assertEquals(password, "TestPassword");
    }

}
