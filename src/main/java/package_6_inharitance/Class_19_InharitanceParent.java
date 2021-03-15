package package_6_inharitance;

public class Class_19_InharitanceParent {

    int speed;

    public Class_19_InharitanceParent(int startSpeed) {
        speed = startSpeed;
    }

    public void increaseSpeed() {
        speed++;
        System.out.println("ZWIĘKSZANIE PRĘDKOŚCI REUŻYWALNE Z KLASY PARENT");
    }

    public void decreaseSpeed() {
        speed--;
        System.out.println("ZMNIEJSZENIE PRĘDKOŚCI REUŻYWALNE Z KLASY PARENT");
    }
}
