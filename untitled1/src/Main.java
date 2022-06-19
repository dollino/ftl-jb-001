import L001.HelloWorld;
import animals.Cat;
import animals.Dog;


public class Main {
    public static void main(String[] args) {
//        HelloWorld.run();
//        POJO.run();
//
//
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//
//
//         L004.Cat catL004 = new L004.Cat();
//         catL004.voice();
        Cat cat = new Cat("Barsik", 20 );
         System.out.println(cat.jumpHeight() );

        Dog dog = new Dog();
        dog.goToStick(14 );
        dog.whereTheDog();

        dog.goToStick(20 );
        dog.whereTheDog();

        dog.goToStick(5 );
        dog.whereTheDog();

        Dog homelessDog = Dog.ofHomeless(100);
    }

}