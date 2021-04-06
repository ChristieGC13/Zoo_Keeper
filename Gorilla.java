public class Gorilla extends Mammal{
    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public void throwSomething(){
        System.out.println("Watch out,Gorilla just threw something!");
        this.energyLevel = energyLevel - 5 ;
    }
    public void eatBananas(){
        System.out.println("Oooh, looks like Gorilla just enjoyed a banana");
        this.energyLevel = energyLevel + 10 ;
    }
    public void climb(){
        
        System.out.println("Gorilla just climbed a tree!");
        this.energyLevel = energyLevel - 10 ;
    }
}