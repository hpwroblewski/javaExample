package introduction;

public class Variables {

    public static void main(String[] args){

//    byte
//    Min: -128
//    Max: 127
//    Default: 0

    byte byteVariable = 100;
    System.out.println("byteVariable = " + byteVariable);

//    short
//    Min: -32,768
//    Max: 32,767
//    Default: 0

    short shortVariable = 1000;
    System.out.println("shortVariable = " + shortVariable);

//    int
//    Min: -2,147,483,648
//    Max: 2,147,483,647
//    Default: 0

    int integerVariable = 100000;
    System.out.println("integerVariable = " + integerVariable);

//    long
//    Min: -2^63
//    Max: 2^63 - 1
//    Default: 0

    long longVariable = 100000000L;
    System.out.println("longVariable = " + longVariable);

//    float
//    Default: 0.0f

    float floatVariable = 10.11111111111f;
    System.out.println("floatVariable = " + floatVariable);

//    double
//    Default: 0.0d

    double doubleVariable = 10.11111111111;
    System.out.println("doubleVariable = " + doubleVariable);

//    boolean
//    false and true
//    Default: false

    boolean booleanVariable = true;
    System.out.println("booleanVariable = " + booleanVariable);

//    char
//    Min: 0
//    Max: 65,535

    char charVariable = 100;
    System.out.println("charVariable = " + charVariable);
    }
}