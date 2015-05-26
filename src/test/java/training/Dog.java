package training;

import org.testng.annotations.Test;

public class Dog {

    public String name = "Chuppie";
    public String breed = "Husky";
    public String color = "White";

    @Test
    public void Dog(){
        Dog myDog = new Dog();
        System.out.println("myDog.breed = " + myDog.breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
