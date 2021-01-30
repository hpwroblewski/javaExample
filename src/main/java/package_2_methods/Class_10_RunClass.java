package package_2_methods;

public class Class_10_RunClass {

    public static void main(String[] args) {

//    TWORZENIE INICJALIZACJI OBIEKTU bmw KLASY Class_9_Class
        Class_9_Class bmw = new Class_9_Class();

//    REFERENCJA TO MOŻLIWOŚĆ ODWOŁANIA SIĘ DO WSZYSTKIEGO CO OZNACZONE JEST W KLASIE Class_9_Class JAKO PUBLIC
        bmw.increaseSpeed();

//    ZA POMOCĄ SETTERS I GETTER ZOSTAŁ DODANA A NASTĘPNIE ODCZYTANA NAZWA MARKI ZAPISANEJ DO ZMIENNEJ KLASY
        bmw.setMake("BMW");
        System.out.println("Zmienna klasy [make] dla obiektu [bmw] to: " + bmw.getMake());

//    TWORZENIE INICJALIZACJI OBIEKTU mercedes KLASY Class_9_Class
        Class_9_Class mercedes = new Class_9_Class();

        mercedes.setMake("Mercedes");
        System.out.println("Zmienna klasy [make] dla obiektu [mercedes] to: " + mercedes.getMake());

        mercedes.setModel("S Class");
        System.out.println("Zmienna klasy [model] dla obiektu [mercedes] to: " + mercedes.getModel());

//    WPROWADZENIE ROKU WIEKSZEGO NIŻ 1900 PONIEWAŻ JEST WALIDACJA NA METODZIE setYear
//    JEŚLI WARTOŚĆ ROKU BEDZIE 1899 WTEDY ZOSTANIE ZWRÓCONY year = O BO JEST TO DEFAULTOWA WARTOŚĆ DLA INT DLA STRING BYŁBY NULL PONIEWAŻ NIECZEGO NIC NIE ZOSTAŁO DODANE SETTEREM JEŚLI ROK JEST MNIEJSZY NIŻ 1900
        mercedes.setYear(2008);
        System.out.println("Zmienna klasy [year] dla obiektu [mercedes] to: " + mercedes.getYear());
    }
}
