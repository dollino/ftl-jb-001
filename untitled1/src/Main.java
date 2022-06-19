import L001.HelloWorld;
import L002.POJO;
import L003.Cat;

public class Main {
    public static void main(String[] args) {
        HelloWorld.run();
        POJO.run();



        Cat catVar = new Cat();
        catVar.voice();
      


         L004.Cat catL004 = new L004.Cat();
         catL004.voice();
    }

}