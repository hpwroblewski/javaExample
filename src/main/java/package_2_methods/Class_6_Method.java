package package_2_methods;

public class Class_6_Method {

    // OOP - OBJECT ORIENTED PROGRAMMING - PROGRAMOWANIE ZORIENTOWANE OBIEKTOWO

    //Przed metodą można tylko zdefiniować lub zadeklarować zmienną/stałą static String stringVariable = "Hello World";
    static String stringVariable = "Hello World";

    //METODA MAIN - Każda klasa potrzebuje metody main aby samodzielnie się wywołać (jak nie będzie metody main nie będzie zrobić run w klasie)
    //String[] args - Jest to zaszłość wykorzystywana tylko gdy metoda main jest odpalana z wiersza poleceń z przekazywanymi argumentami
    public static void main(String[] args) {
        System.out.println("stringVariable = " + stringVariable);
    }

    //Nie powinno się pisać całego kodu w metodzie main każdą akcję powinniśmy wydzielać jako metodę i tym samym kod dzielić na modułu
    public static void firstMethod() {
        System.out.println("stringVariable = " + stringVariable);
    }

////  Jeśli stała/zmienna jest poza metodą musi być określona czy jest zmienną czy stałą static natomiast w środku metody nie piszemy static
//    public static void main(String[] args) {
//        String stringVariable = "Hello World";
//        System.out.println("stringVariable = " + stringVariable);
//    }
//}

////    ERROR - Nie można wywołać akcji poza metodą - java: <identifier> expected, java: illegal start of type
//    static String stringVariable = "Hello World";
//    System.out.println("stringVariable = " + stringVariable);
//
//    public static void main(String[] args){
//
//    }

////  ERROR - Nie można tworzyć metodę w metodzie - java: illegal start of expression
//    static String stringVariable = "Hello World";
//
//    public static void main(String[] args) {
//        System.out.println("stringVariable = " + stringVariable);
//
//        public static void firstMethod() {
//            System.out.println("stringVariable = " + stringVariable);
//        }
//    }

}
