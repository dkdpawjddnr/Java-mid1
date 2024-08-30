package enumeration.test;


public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();

        authGradePrint(grades);

    }


    public static void authGradePrint(AuthGrade[] grades) {
        for (AuthGrade grade : grades) {
            System.out.println("grade = " + grade.name()
                    + ", level =  " + grade.getLevel() + " 설명 = " + grade.getDescription());
        }
    }
}
