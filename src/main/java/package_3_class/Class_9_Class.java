package package_3_class;

public class Class_9_Class {
    //KLASA TO SZABLON KTÓRY WYKORZYSTUJE SIĘ TO TWORZENIA OBIEKTÓW
    //OBIEKT SKŁADA SIĘ ZE STANÓW / ATRYBUTÓW I ZACHOWAŃ
    //PRZYKŁADOWA KLASA Class_9_Class MOŻE NAZYWAĆ SIĘ CAR

    //STAN / ATRYBUT OBIEKTU CAR
    //STAN JEST REPREZENTUJOWANY PRZEZ OBIEKTY PRZECHOWYJĄCE DANE W ZMIENNYCH KLASY / POLACH
    //TWORZONA JEST ENKAPSULACJA KTÓRA POLEGA NA DODANIU PRIVATE DO ZMIENNYCH KLASY CO POWODUJE ŻE MOŻNA SIĘ DO NICH DOSTAĆ TYLKO PRZEZ METODY GETTER I SETTER CO POZWALA NA WIĘCEJ FUNKCJONALNOŚCI JAK WALIDACJA KODU ORAZ UKRYCIE ZMIENNYCH KLASY

    //KOLOR
    private String color;

    //PRODUCENT
    private String make;

    //MODEL
    private String model;

    //ROK PROUKCJI
    private int year;

    //ZACHOWANIE
    //ZACHOWANIE JEST REPREZENTOWANE PRZEZ METODY
    //ODPALENIE SILNIKA
    //ZATRZYMANIE SILNIKA
    //ZWIĘKSZENIE PRĘDKOŚCI
    //ZMNIEJSZENIE PRĘDKOŚCI
    public void increaseSpeed() {
        System.out.println("**********");
        System.out.println("Wywołanie metody increaseSpeed: Zwiększenie prędkości...");
        System.out.println("**********");
    }

    //SETTER DODAJE WARTOŚCI DO ZMIENNEJ KLASY
    //this ODWOŁUJE SIĘ DO ZMIENNEJ KLASY KTÓREJ JEST PRZYPISANA WARTOŚĆ Z METODY SETTERS ORAZ POTRAFI ROZPOZNAĆ INSTANCJE DO KTÓREJ JEST PRZYPISANA DANA ZMIENNA CZY DO OBIEKTU BMW CZY MERCEDES
    public void setMake(String make) {
        this.make = make;
    }

    //GETTER POBIERA WARTOŚCI ZE ZMIENNEJ KLASY
    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    //METODY GETTER I SETTER POZWALAJĄ NA WIĘCEJ FUNKCJONALNOŚCI JAK WALIDACJA
    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        } else {
            System.out.println("**********");
            System.out.println("This year is not valid. Set year higher than 1900");
            System.out.println("**********");
        }
    }
}
