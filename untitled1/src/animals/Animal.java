package animals;

import java.util.Random;

public abstract  class Animal {
     public static class WeightException extends RuntimeException{

     }

     public static class AnimalWeight{

         @Override
         public String toString() {
             return "AnimalWeight{" +
                     "value=" + value +
                     ", weighttype=" + weighttype +
                     '}';
         }

         public enum Weighttype{
             KG, GR
         }
         private Integer value;
         private Weighttype weighttype;

         public AnimalWeight(Integer value, Weighttype weighttype) throws WeightException {
             if (value < 0) throw new WeightException();
             this.value = value;
             this.weighttype = weighttype;
         }

         public Integer getValue() {
             return value;
         }

         public void setValue(Integer value) {
             if(value <0) throw new WeightException();
             this.value = value;
         }

         public Weighttype getWeighttype() {
             return weighttype;
         }

         public void setWeighttype(Weighttype weighttype) {
             this.weighttype = weighttype;
         }
     }

    protected String name;
    protected AnimalWeight weight;
    protected Integer currentPosition = 0;
    protected MoveType moveType ;


     public Animal(String name, AnimalWeight weight, MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public AnimalWeight getWeight() {
         return weight;
     }

     public void setWeight(AnimalWeight weight) {
         this.weight = weight;
     }

     public Integer getCurrentPosition() {
         return currentPosition;
     }

     public void setCurrentPosition(Integer currentPosition) {
         this.currentPosition = currentPosition;
     }

     public MoveType getMoveType() {
         return moveType;
     }

     public void setMoveType(MoveType moveType) {
         this.moveType = moveType;
     }

     public Animal(MoveType moveType) {
         this.moveType = moveType;
    }
    
    public abstract void  voice();
    protected void runForvard(Integer length){
        this.currentPosition+= length;
    }


}
