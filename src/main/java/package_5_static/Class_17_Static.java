package package_5_static;

public class Class_17_Static {
    //ZWYKŁY GETTER I SETTER DLA ZMIENNYCH KLASY
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    //static TO ZMIENNA KLASY DLA KTÓREJ NIC SIĘ NIE ZMIENIA I JEST ZAWSZE TAKA SAMA A WIĘC STATYCZNA DLA PRZYKŁADU ZAWSZE W AUCIE SĄ 4 KOŁA WIĘC SIĘ NIE ZMIENIAJĄ JAK MARKA LUB MODEL
    private static int wheels = 4;

    //METODY TEŻ MUSZĄ BYĆ STATYCZNE JAK I ZMIENNE
    public static int getWheels() {
        return wheels;
    }

    //NIE MOŻNA UŻYWAĆ this ORAZ super DLA STATIC
    public static void setWheels(int wheels) {
        Class_17_Static.wheels = wheels;
    }
}
