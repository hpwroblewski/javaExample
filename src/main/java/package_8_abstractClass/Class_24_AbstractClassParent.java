package package_8_abstractClass;

//DODANIE abstract JAKO KLASY ABSTRAKCYNEJ KTÓRA JEST KLASĄ Z REUŻYWALNYMI KOMPONENTAMI I JEST EXTENDOWANA MIĘDZY KLASAMI
public abstract class Class_24_AbstractClassParent {

    private int privateSpeed;

    public int getPrivateSpeed() {
        return privateSpeed;
    }

    public void setPrivateSpeed(int privateSpeed) {
        this.privateSpeed = privateSpeed;
        System.out.println("PRĘDKOŚĆ PARENT");
    }

    //    JEŚLI JEDNA Z METOD JEST ABSTRAKCYJNA CAŁA KLASA JEST ABSTRAKCYJNA
//    METODY ABSTRAKCYJNE NIE MOGĘ MIEĆ NIC W BODY {}
    public abstract void startEngine(String keyType, int numOfCyl);
}
