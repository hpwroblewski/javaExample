package package_2_methods;

public class Class_7_AddMethod {

    public static void main(String[] args) {
        findGrade("Hubert", 70);
        findGrade("Karolina", 90);
    }

    public static void findGrade(String studentName, int score) {
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
        System.out.println("Uzyskany wynik dla ucznia o imieniu: " + studentName + " to: " + score + "% odpowiada ocenie: " + grade);
    }
}

////    ERROR - Zduplikowana definicja zmiennej w metodzie - java: variable studentName is already defined in method findGrade(java.lang.String,int)
//
////    Before run (InteliJ)
////    Parameter 'studentName' is never used
////    Parameter 'score' is never used
////    Variable 'studentName' is already defined in the scope
////    Variable 'score' is already defined in the scope
////    Variable 'score' might not have been initialized
//
////    Run (Console)
////    java: variable studentName is already defined in method findGrade(java.lang.String,int)
////    java: variable score is already defined in method findGrade(java.lang.String,int)
//
//    public static void main(String[] args){
//        findGrade("Hubert",70);
//    }
//
//    public static void findGrade(String studentName, int score){
//        String studentName;
//        int score;
//        int grade;
//        if (score >= 90 && score <= 100){
//            grade = 5;
//        }
//        else if (score >= 80 && score < 90){
//            grade = 4;
//        }
//        else if (score >= 70 && score < 80){
//            grade = 3;
//        }
//        else{
//            grade = 2;
//        }
//        System.out.println("Uzyskany wynik dla ucznia o imieniu: " + studentName + " to: " + score + "% odpowiada ocenie: " + grade);
//    }
//}

////    ERROR - Nie zostały przekazane parametry w metodzie - java: method findGrade in class package_2_methods.Class_7_AddMethod cannot be applied to given types;
//
////    Before run (InteliJ)
////    Expected 2 arguments but found 0
//
////    Run (Console)
////    java: method findGrade in class package_2_methods.Class_7_AddMethod cannot be applied to given types;
////    required: java.lang.String,int
////    found: no arguments
////    reason: actual and formal argument lists differ in length
//
//    public static void main(String[] args){
//        findGrade();
//    }
//
//    public static void findGrade(String studentName, int score){
//
//        int grade;
//        if (score >= 90 && score <= 100){
//            grade = 5;
//        }
//        else if (score >= 80 && score < 90){
//            grade = 4;
//        }
//        else if (score >= 70 && score < 80){
//            grade = 3;
//        }
//        else{
//            grade = 2;
//        }
//        System.out.println("Uzyskany wynik dla ucznia o imieniu: " + studentName + " to: " + score + "% odpowiada ocenie: " + grade);
//    }
//}