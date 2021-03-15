package package_7_modifires;

public class Class_22_Modifires {

    //    BEZ MODYFIKATORA DOSTĘPU MOŻNA DOSTAĆ SIĘ DO ZMIENNEJ GDY KLASA JEST W TYM SAMYM PACKAGE
    int speed;

    //    MODYFIKATOR PRIVATE UMOŻLIWIA WYKORZYSTANIE ZMIENNEJ TYLKO W TEJ KLASIE
    private int privateSpeed;

    //    MODYFIKATOR PROTECTED UMOŻLIWIA WYKORZYSTANIE ZMIENNEJ W TYM SAMYM PACKAGE LUB W KLASIE PARENT KTÓRE DZIEDZICZY Z KLASY CHILD
    protected int protectedSpeed;

    //    MODYFIKATOR PUBLIC UMOŻLIWIA WYKORZYSTANIE ZMIENNEJ WSZĘDZIE
    public int publicSpeed;

    public Class_22_Modifires(int startSpeed) {
        speed = startSpeed;
    }
}
