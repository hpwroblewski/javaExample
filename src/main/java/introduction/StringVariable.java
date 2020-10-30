package introduction;

public class StringVariable {

    public static void main(String[] args) {

        //ZMIENNE REFERENCYJNE - ZMIENNE TYPU OBIEKT - STRING

        //BEST PRACTISE - String literal - String Constant Poll w Storage
        // Tworzone są dwie referencje (stringReference1, stringReference2), które odwołują się do jednego obiekt o tej samej nazwie Hello (znajduje się w pamięci w jako String literal - String Constant Poll w Storage), co pozytywnie wpływa na pamięć
        String stringReference1 = "Hello";
        String stringReference2 = "Hello";

        //ANTI PATTERN - String Object - Heap w Storage
        // Tworzone są dwie referencje(stringReference3, stringReference4), które odwołują się do dwóch oddzielnych obiektów o tej samej nazwie Hello (znajduje się w pamięci w jako String Object - Heap w Storage), co negatywnie wpływa na pamięć
        String stringReference3 = new String("Hello");
        String stringReference4 = new String("Hello");

    }
}
