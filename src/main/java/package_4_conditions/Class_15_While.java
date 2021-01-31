package package_4_conditions;

public class Class_15_While {

    public static void main(String[] args) {

        int i = 10;

        while (i < 20) {
            i++;
//            continue WYKLUCZA WARTOŚĆ Z PĘTLI
            if (i == 16) {
                System.out.println("continue dla: " + i);
                continue;
            }
//            break ZATRZYMUJE PĘTLĘ
            if (i == 19) {
                System.out.println("break dla: " + i);
                break;
            }
            System.out.println(i);
        }

        //DO WHILE ZAWSZE WYKONA PIERWSZY RAZ PĘTLĘ PRZED SPRAWDZENIEM WARUNKU
        do {
            i++;
            System.out.println("do while dla i < 11: " + i);
        }
        while (i < 11);
    }
}
