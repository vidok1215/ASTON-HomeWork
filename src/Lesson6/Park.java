package Lesson6;

public class Park {
    private static class Attraction {
        private String name;
        private int openingTime;
        private int closingTime;
        private double price;

        public Attraction(String name, int openingTime, int closingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getOpeningTime() {
            return openingTime;
        }

        public int getClosingTime() {
            return closingTime;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Attraction rollerCoaster = new Attraction("Roller Coaster", 10, 18, 25.00);
        Attraction ferrisWheel = new Attraction("Ferris Wheel", 12, 20, 15.00);

        System.out.println("Attraction: " + rollerCoaster.getName());
        System.out.println("Opening Time: " + rollerCoaster.getOpeningTime());
        System.out.println("Closing Time: " + rollerCoaster.getClosingTime());
        System.out.println("Price: $" + rollerCoaster.getPrice());

        System.out.println("\nAttraction: " + ferrisWheel.getName());
        System.out.println("Opening Time: " + ferrisWheel.getOpeningTime());
        System.out.println("Closing Time: " + ferrisWheel.getClosingTime());
        System.out.println("Price: $" + ferrisWheel.getPrice());
    }

}
