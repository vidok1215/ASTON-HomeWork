package Lesson6;


    public class Employee {

        private String fullName;
        private String position;
        private String email;
        private String phoneNumber;
        private double salary;
        private int age;

        public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Имя: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phoneNumber);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
        }

        public static void main(String[] args) {

        }
    }


