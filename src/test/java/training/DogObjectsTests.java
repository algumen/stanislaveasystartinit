package training;

import org.testng.annotations.Test;

public class DogObjectsTests {
@Test
    public void Dog(){
    Dog myDog = new Dog();
        System.out.println("myDog.breed = " + myDog.breed);
        System.out.println("myDog.name = " + myDog.name);
        System.out.println("myDog.color = " + myDog.color);

        myDog.breed = "Poodle";
        System.out.println("myDog.breed = " + myDog.breed);

        myDog.name = "Billy";
        System.out.println("myDog.name = " + myDog.name);
            }

}
