package package_8_abstractClass;

public class Class_25_AbstractClassChild extends Class_24_AbstractClassParent {

    //    USTAWIENIE PRĘDKOŚCI DZIEDZICZONEJ Z Class_24_AbstractClassParent
    public void setPrivateSpeed(int privateSpeed) {
        super.setPrivateSpeed(privateSpeed);
        System.out.println("PRĘDKOŚĆ DZIEDZICZONA CHILD");
    }

    //    JEŚLI DZIEDZICZYMY KLASĘ ABSTRAKCYJNĄ KTÓRA ZAWIERA METODY MUSZĄ BYĆ NADPISANE W CHILD KLASIE
    @Override
    public void startEngine(String keyType, int numOfCyl) {

    }

//    ERROR - NIE MOŻNA TWORZYĆ OBIEKTU DLA KLASY ABSTRAKCYJNEJ
//    Class_24_AbstractClass abstractClass = new Class_24_AbstractClass();

}
