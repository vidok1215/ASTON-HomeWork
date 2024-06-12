import Lesson6.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@gmail.com", "+1234567890", 50000, 30);
        Employee employee2 = new Employee("Петров Петр Петрович", "Разработчик", "petrov@gmail.com", "+987654321", 70000, 25);

        employee1.displayInfo();
        System.out.println("-------------------");
        employee2.displayInfo();
        }



    }
