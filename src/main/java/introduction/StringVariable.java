package introduction;

public class StringVariable {

    public static void main(String[] args) {

        //ZMIENNE REFERENCYJNE - ZMIENNE TYPU OBIEKT - STRING

        //ANTI PATTERN - String Object - Heap w Storage
        // Tworzone są dwie referencje(stringReference3, stringReference4), które odwołują się do dwóch oddzielnych obiektów o tej samej nazwie Hello (znajduje się pamięci w jako String Object - Heap w Storage), co negatywnie wpływa na pamięć
        String stringReference3 = new String("Hello");
        String stringReference4 = new String("Hello");

        //BEST PRACTISE - String literal - String Constant Poll w Storage
        // Tworzone są dwie referencje (stringReference1, stringReference2), które odwołują się do jednego obiekt o tej samej nazwie Hello (znajduje się w pamięci jako String literal - String Constant Poll w Storage), co pozytywnie wpływa na pamięć
        String stringReference1 = "Hello";
        String stringReference2 = "Hello";

        //METODY STRING
        String stringReferenceText = "Hello World";

        String stringReferenceTextComapare1 = "Hello World";
        String stringReferenceTextComapare2 = "Hello World";
        String stringReferenceTextComapare3 = "World";
        String stringReferenceTextComapare4 = "";
        String stringReferenceTextComapare5 = " ";
        String stringReferenceTextComapare6 = "     Hello  World  ";

        //.length() - zwraca ilość znaków
        System.out.println("stringReferenceText.length() = " + stringReferenceText.length());

        //.contains(String) - sprawdza czy tekst zawiera w sobie wprowadzone znaki
        System.out.println("stringReferenceText.contains(String) = " + stringReferenceText.contains("o"));

        //.startsWith(String) - sprawdza czy tekst zaczyna się od wprowadzonych znaków
        System.out.println("stringReferenceText.startsWith(String) = " + stringReferenceText.startsWith("Hello"));

        //.endsWith(String) - sprawdza czy tekst kończy się wprowadzonymi znakami
        System.out.println("stringReferenceText.endsWith(String) = " + stringReferenceText.endsWith("World"));

        //.equals(Object) - sprawdza czy tekst w pierwszym obiekcie jest taki sam jak w drugim obiekcie
        System.out.println("Object1.equals(Object2) = " + stringReferenceTextComapare1.equals(stringReferenceTextComapare2));
        System.out.println("Object1.equals(Object3) = " + stringReferenceTextComapare1.equals(stringReferenceTextComapare3));

        //.charAt(int) - zwraca znak o wprowadzonym indeksie
        System.out.println("stringReferenceText.charAt(int) = " + stringReferenceText.charAt(2));

        //.indexOf(String) - zwraca indeks w którym znajduje się wprowadzony znak
        System.out.println("stringReferenceText.indexOf(String) = " + stringReferenceText.indexOf("e"));
        //.indexOf(String) - jeśli nie znajdzie znaku zwraca -1
        System.out.println("stringReferenceText.indexOf(String) = " + stringReferenceText.indexOf("ą"));

        //.isEmpty() - sprawdza czy tekst jest pusty
        System.out.println("stringReferenceTextComapare4.isEmpty() = " + stringReferenceTextComapare4.isEmpty());
        //.isEmpty() - jeśli w środku String'a będzie sama spacja, oznacza to że String nie jest pusty
        System.out.println("stringReferenceTextComapare5.isEmpty() = " + stringReferenceTextComapare5.isEmpty());

        //.trim() - zwraca tekst przed i po który nie zawiera spacji we wprowadzonym tekście, natomiast w środku String'a nic nie zmienia
        System.out.println("stringReferenceTextComapare6.trim() = " + stringReferenceTextComapare6.trim());

        //.concat(String) - dodaje tekst do obiektu String
        System.out.println("stringReferenceText.concat(String) = " + stringReferenceText.concat(" + World"));

        //.replace(String,String) - zmienia wprowadzony tekst na nowy
        System.out.println("stringReferenceText.replace(String,String) = " + stringReferenceText.replace("World", "Replace"));

        //.substring(int) - zwraca tekst od wprowadzonego początkowego indeksu
        System.out.println("stringReferenceText.substring(int) = " + stringReferenceText.substring(3));
        //.substring(int,int) - zwraca tekst od wprowadzonego początkowego do końcowego indeksu
        System.out.println("stringReferenceText.substring(int,int) = " + stringReferenceText.substring(3, 6));

        //.toLowerCase() - zwraca tekst pisany z małych liter
        System.out.println("stringReferenceText.toLowerCase() = " + stringReferenceText.toLowerCase());

        //.toUpperCase() - zwraca tekst pisany z dużych liter
        System.out.println("stringReferenceText.toUpperCase() = " + stringReferenceText.toUpperCase());

        //Pętla zwraca każdy znak z tablicy wraz z jego indeksem
        char[] charArray = stringReferenceText.toCharArray();
        for (int i = 0; i < stringReferenceText.length(); i++) {
            System.out.println("Numer indeksu:" + i + " odpowiada: " + charArray[i]);
        }
    }
}
