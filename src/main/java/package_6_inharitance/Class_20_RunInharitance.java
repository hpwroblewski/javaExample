package package_6_inharitance;

public class Class_20_RunInharitance {

    public static void main(String[] args) {

        int startSpeed = 0;

        Class_19_InharitanceParent parent = new Class_19_InharitanceParent(startSpeed);
        parent.increaseSpeed();

        Class_20_InharitanceChild child = new Class_20_InharitanceChild(startSpeed);
        child.increaseSpeed();
        child.uniqueMethod();
    }
}
