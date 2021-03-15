package package_7_modifires;

public class Class_23_RunModifires extends Class_22_Modifires {

    public Class_23_RunModifires(int startSpeed) {
        super(startSpeed);
    }

    public static void main(String[] args) {

        int startSpeed = 0;

        Class_22_Modifires parent = new Class_22_Modifires(startSpeed);
        parent.speed = 0;
        parent.publicSpeed = 0;
        parent.protectedSpeed = 0;
    }
}
