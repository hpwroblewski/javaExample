package package_3_class;

public class Class_11_Constructor {

    private String make;
    public int speed;
    public int gear;

    //KONSTRUKTOR JEST SAM W SOBIE WYWOŁYWANY I NAZWYWA SIĘ TAK SAMO JAK KLASA NATOMIAST OBIEKT MUSI MIEĆ REFERENCJĘ DO METODY ABY ZOSTAĆ WYWOŁANY
    //KAŻDA KLASA MA KONSTRUKTOR LECZ MOGĄ BYĆ NIE ZDEFINIOWANE JEGO PARAMETRY
    //W KLASIE MOŻE BYC WIELE KONSTRUKTORÓW KTÓRE MAJĄ RÓZNE PARAMETRY WEJŚCIOWE
    //KONSTRUKTORÓW UŻYWA SIĘ DO INICJALIZACJI DEAFULOWEJ WARTOŚCI ZMIENNYCH KLASY
    public Class_11_Constructor() {
        //W SZCZEGÓLNYCH PRZYPADKACH MOŻNA WYWOŁAĆ KONSTRUKTOR W KONSTRUKTORZE WARTOŚCI SPEED ORAZ GEAR BĘDĄ WYNOSIŁY 0 BO BĘDĄ NADPISANE PRZEZ WARTOŚCI W KONSTRUKTORZE BEZ ARGUMENTÓW
        this(10, 30);
        this.speed = 0;
        this.gear = 0;
        System.out.println("WYWOŁANIE KONSTRUKTORA BEZ ARGUMENTÓW");
    }

    public Class_11_Constructor(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("WYWOŁANIE KONSTRUKTORA Z ARGUMENTAMI");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
