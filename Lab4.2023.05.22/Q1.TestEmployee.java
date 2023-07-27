/**
 *
 * @author Misuri
 */

public class TestEmployee {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee mrBogdan = new Employee(101, "Mr. Bogdan", "Manager");
        Employee msBird = new Employee(102, "Ms. Bird", "Developer");

        // Set required values using setters
        mrBogdan.setEmpID(101); // This line is not necessary as ID is already set in the constructor.
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Manager");

        msBird.setEmpID(102);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Developer");

        // Print employee details using getters
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println("\nEmployee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}

