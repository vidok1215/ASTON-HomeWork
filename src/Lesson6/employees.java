package Lesson6;

public class employees {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("John Doe", "Manager", "johndoe@mail.com", "555-1234", 50000, 35);
        empArray[1] = new Employee("Jane Smith", "Salesperson", "janesmith@mail.com", "555-5678", 40000, 28);
        empArray[2] = new Employee("Michael Johnson", "Accountant", "michaeljohnson@mail.com", "555-9101", 45000, 30);
        empArray[3] = new Employee("Emily Davis", "HR Specialist", "emilydavis@mail.com", "555-1212", 48000, 32);
        empArray[4] = new Employee("Robert Wilson", "IT Technician", "robertwilson@mail.com", "555-3434", 42000, 25);


    }
}
