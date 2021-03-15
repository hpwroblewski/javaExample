package package_6_inharitance;

//DZIEDZICZENIE Z KLASY PARENT Class_19_InharitanceParent ZA POMOCĄ extends Class_19_InharitanceParent
public class Class_20_InharitanceChild extends Class_19_InharitanceParent {

    //    NALEŻY UTWORZYĆ DEFAULTOWY KONSTRUKTOR JEŚLI W DZIEDZICZONEJ KLASIE PARENT Class_19_InharitanceParent TEŻ BYŁ UTWORZONY DEFAULTOWY KONSTRUKTOR
//    SUPER ZMIENNĄ startSpeed JEST DZIEDZICZONA Z PARENT KLASY
    public Class_20_InharitanceChild(int startSpeed) {
        super(startSpeed);
    }

    //    AUTOMATYCZNE GENEROWANIE NADPISYWANIA METOD Z KLASY PARENT Class_19_InharitanceParent ZA POMOCĄ GENERATE OVERRIDE
    @Override
    public void increaseSpeed() {
        super.increaseSpeed();
        System.out.println("NADPISANIE METODU DZIEDZICZONEJ Z PARENT KLAS");
    }

    //    UNIKALNA METODA
    public void uniqueMethod() {
        System.out.println("ZWIĘKSZANIE PRĘDKOŚCI UNIKALNE Z KLASY CHILD");
    }
}
