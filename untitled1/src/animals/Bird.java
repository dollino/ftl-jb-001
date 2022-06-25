package animals;

public class Bird extends Animal implements Flight{
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY );
    }


      public  void isTheBirdFlying(){
         System.out.println(
                  this.flyModeActive == true ? "Bird: mode flying-yes" : "Duck: mode flying- no"
         );
      }

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }

    @Override
    public void takeOff() {
         this.flyModeActive = true;

    }

    @Override
    public void landing() {
        this.flyModeActive = false;

    }
}
