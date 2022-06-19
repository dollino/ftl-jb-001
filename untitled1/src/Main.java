import L001.HelloWorld;
import animals.Cat;


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
    }

}