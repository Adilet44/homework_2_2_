public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Apple"), createObject("Samsung"),createObject("Redmi")};
        for (Printable element:printables) {
            element.print();

        }
    }
    public static Printable createObject(String className){
        switch (className){
            case "Apple ":
                Apple apple = new Apple(300,12,3,"wid","appleKarobka",15);
                return apple;
            case "Samsung":
                Samsung samsung = new Samsung(500,17,6,"black","anime","nepord");
                return samsung;
            case "Redmi":
                Redmi redmi = new Redmi(600,16,4,"red",64,"Tiktok");
                return redmi;
        }
        return null;


    }
}