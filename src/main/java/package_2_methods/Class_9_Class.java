package package_2_methods;

public class Class_9_Class {
    //KLASA TO SZABLON KTÓRY WYKORZYSTUJE SIĘ TO TWORZENIA OBIEKTÓW
    //OBIEKT SKŁADA SIĘ ZE STANÓW / ATRYBUTÓW I ZACHOWAŃ
    //PRZYKŁADOWA KLASA Class_9_Class MOŻE NAZYWAĆ SIĘ CAR

    //STAN / ATRYBUT OBIEKTU CAR
    //STAN JEST REPREZENTUJOWANY PRZEZ OBIEKTY PRZECHOWYJĄCE DANE W ZMIENNYCH KLASY / POLACH
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
    //ZWIĘKSZENIE SZYBKOŚCI
    //ZMNIEJSZENIE SZYBKOŚCI

    public void increaseSpeed() {
        System.out.println("Increasing the speed...");
    }
}
