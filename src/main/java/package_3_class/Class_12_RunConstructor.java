package package_3_class;

public class Class_12_RunConstructor {

    public static void main(String[] args) {

        //WYWOŁANIE KONSTRUKTORA BEZ ARGUMENTÓW
        Class_11_Constructor bmw = new Class_11_Constructor();
        bmw.setMake("BMW");
        System.out.println(bmw.getMake());
        System.out.println(bmw.speed);
        System.out.println(bmw.gear);

        System.out.println("**********");

        //WYWOŁANIE KONSTRUKTORA Z ARGUMENTAMI
        Class_11_Constructor mercedes = new Class_11_Constructor(10, 20);
        System.out.println(mercedes.speed);
        System.out.println(mercedes.gear);

    }
}
