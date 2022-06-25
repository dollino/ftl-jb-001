package animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight, MoveType.WALK );
    }

    public Dog() {
        super(MoveType.WALK);
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Sharik", 4));
        dogs.add(Dog.of("Bubble", 1));
        dogs.add(Dog.of("Tuzic", 5));

        return dogs;
   }

    /**
     * Идем до позиции палки.Чтобы дойти до палки, нужно найти разницу между текущей позицией и позицией палки.
     * @param stickPosition-позиция палки
     */
    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition-this.currentPosition;
        this.runForvard(delta);

    }
    public void whereTheDog(){
         System.out.println(currentPosition );
    }

    public static  Dog of(String name, Integer weight){
        return new Dog(name,weight);
    }

    public static Dog ofHomeless(Integer weight){
         Dog dog = new Dog();
         dog.weight=weight;
         return dog;
    }

    @Override
    public void voice() {
        System.out.println("wow! ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
