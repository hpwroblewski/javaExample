package package_2_methods;

public class Class_8_ReturnMethod {

    public static void main(String[] args) {

//        grade = findGrade(score); należy nadpisać return jako zmienna
//        nie należy wrzucać stałych do metod tylko powinny być jako nazwy stałych

        String studentName;
        int score;
        int grade;

        studentName = "Hubert";
        score = 70;
        grade = findGrade(score);
        printGrade(studentName, score, grade);

        studentName = "Karolina";
        score = 90;
        grade = findGrade(score);
        printGrade(studentName, score, grade);

    }

    public static int findGrade(int score) {
        int grade;
        if (score >= 90 && score <= 100) {
            grade = 5;
        } else if (score >= 80 && score < 90) {
            grade = 4;
        } else if (score >= 70 && score < 80) {
            grade = 3;
        } else {
            grade = 2;
        }
        return grade;
    }

    public static void printGrade(String studentName, int score, int grade) {
        System.out.println("Uzyskany wynik dla ucznia o imieniu: " + studentName + " to: " + score + "% odpowiada ocenie: " + grade);
    }
}
