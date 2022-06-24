package animals;

 class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    protected Boolean CanFly = false;
     protected boolean canFly;

     public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }
    
    public void  voice(){
        System.out.println("Voice!!");
    }
    protected void runForvard(Integer length){
        this.currentPosition+= length;
    }


}
