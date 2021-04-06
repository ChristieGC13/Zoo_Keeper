class BatTest {
    public static void main(String[] args) {
        Bat b = new Bat(300);
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.displayEnergy();
        b.eatHumans();
        b.eatHumans();
        b.displayEnergy();
        b.fly();
        b.fly();
        b.displayEnergy();
    }
}