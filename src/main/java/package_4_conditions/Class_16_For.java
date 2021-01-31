package package_4_conditions;

public class Class_16_For {
//    UŻYWA SIĘ DO LIST I ARRAYS DO ODCZYTU ITEM'ÓW
//    for(INICJALIZACJA; WARUNEK BOOLEAN; ZMIANA WARTOŚCI INICJALIZOWANEJ ZMIENNEJ)

    public static void main(String[] args) {

//        ZWYKŁA PĘTLA FOR
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        PĘTLA FOR PRZESZUKUJĄCA TABLICĘ INT
        int[] array = {10, 20, 30};
        for (int j : array) {
            System.out.println(j);
        }

//        PĘTLA FOR EACH PRZESZUKUJĄCA TABLICĘ INT ZMIENNA K MUSI BYĆ TEGO SAMEGO TYPU CO TABLICA CZYLI INT
        for (int k : array) {
            System.out.println(k);
        }

//        PĘTLA FOR EACH PRZESZUKUJĄCA TABLICĘ STRING ZMIENNA CARS MUSI BYĆ TEGO SAMEGO TYPU CO TABLICA CZYLI STRING
        String[] cars = {"bmw", "mercedes", "audi"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
