package introduction;

import java.util.Arrays;

public class ArrayVariable {

    public static void main(String[] args) {

        //ANTI PATTERN
        //1.Stworzenie referencji
        int[] intArrayBasic;
        //2.Rezerwacja pamięć za pomocą new, a dokładnie pamięci określonej jako 10 int (new int[10])
        intArrayBasic = new int[10];
        //3.Przypisanie wartości do indeksu tabeli
        intArrayBasic[0] = 1;
        intArrayBasic[1] = 2;
        intArrayBasic[2] = 3;
        //4.Wyświetlenie rekordów z tablicy
        System.out.println("intArrayBasic indeks 0 = " + intArrayBasic[0]);
        System.out.println("intArrayBasic indeks 1 = " + intArrayBasic[1]);
        System.out.println("intArrayBasic indeks 2 = " + intArrayBasic[2]);

        //BEST PRACTISE
        //1.Jednolinijkowe zdefiniowanie tablicy, w której nie trzeba podawać ile pamięci chcemy zająć
        String[] stringArray = {"a", "b"};
        int[] intArray = {1, 2, 3};
        //2.Wyświetlenie rekordów z tablicy
        System.out.println("intArray indeks 0 = " + intArray[0]);
        System.out.println("intArray indeks 1 = " + intArray[1]);
        System.out.println("intArray indeks 2 = " + intArray[2]);

        //ERROR - Nie ma takiego indeksu - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        //System.out.println("intArray indeks 2 = " + intArray[2]);

        //array.lenght - sprawdzenie długości tablicy
        int intArrayLength = intArray.length;
        int stringArrayLength = stringArray.length;

        System.out.println("intArrayLength = " + intArrayLength);
        System.out.println("stringArrayLength = " + stringArrayLength);

        //Pętla wyświetlająca rekordy z tablicy
        for (int i = 0; i < intArrayLength; i++) {
            System.out.println("intArray indeks " + i + " = " + intArray[i]);
        }

        for (int i = 0; i < stringArrayLength; i++) {
            System.out.println("stringArray indeks " + i + " = " + stringArray[i]);
        }

        //Arrays.sort(array) - sortowanie rekordów w tablicy
        for (int i = 0; i < intArrayLength; i++) {
            System.out.println("Przed sortowaniem: intArray indeks " + i + " = " + intArray[i]);
        }

        Arrays.sort(intArray);

        for (int i = 0; i < intArrayLength; i++) {
            System.out.println("Po sortowaniu: intArray indeks " + i + " = " + intArray[i]);
        }
    }
}
