package package_5_static;

public class Class_18_RunStatic {

    public int addNum = 10;
    public static int addNumStatic = 10;

    public static void main(String[] args) {

        //STANDARDOWE ODWOŁANIE SIĘ REFERENCJĄ DO GETTERÓW I SETTERÓW
        Class_17_Static car = new Class_17_Static();
        car.setMake("bmw");
        System.out.println(car.getMake());

        //NIE TRZEBA TWORZYĆ OBIEKTÓW I REFERENCJI DO GETTERÓW I SETTERÓW TYLKO ODWOŁUJE SIĘ BEZPOŚREDNIO DO KLASY I STATYCZNEJ METODY
        System.out.println(Class_17_Static.getWheels());

        Class_18_RunStatic sameClass = new Class_18_RunStatic();
        int output = sameClass.sum(10);
        int outputStatic = sumStatic(10);

        System.out.println(output);
        System.out.println(outputStatic);
    }

    public int sum(int num) {
        return num + addNum;
    }

    public static int sumStatic(int num) {
        return num + addNumStatic;
    }
}
