package operatorsProgram;

public class LogicalOperators {
    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense);

        System.out.println(age >= 18 || hasLicense);

        System.out.println(!hasLicense);
    }
}