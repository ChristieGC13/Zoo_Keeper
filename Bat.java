public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(300);
    }
    public void fly(){
        System.out.println("*flutters*");
        this.energyLevel = energyLevel - 50 ;
    }
    public void eatHumans(){
        this.energyLevel = energyLevel + 25 ;
    }
    public void attackTown(){
        System.out.println("People screaming in background as flames engulf the town!");
        this.energyLevel = energyLevel - 100 ;
    }
}