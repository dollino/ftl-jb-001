package animals;

public class Bird extends Animal{
    protected Boolean flyModeActive = false;
     public void takeoff(){
         flyModeActive = true;
     }
      public void landing(){
         flyModeActive = false;
      }
      public void isTheBirdFlying(){
         System.out.println(
                  this.flyModeActive == true ? "Duck: mode flying-yes" : "Duck: mode flying- no"
         );
      }

}
