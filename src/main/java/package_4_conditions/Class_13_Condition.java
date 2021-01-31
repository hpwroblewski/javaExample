package package_4_conditions;

public class Class_13_Condition {

    public static void main(String[] args) {

        int score = 81;
        String grade;

        if (score > 90) {
            grade = "A";
        } else if (score > 80) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("Uzyskany wynik to: " + score);
        System.out.println("Uzyskana ocena to: " + grade);
    }
}
