package core;

public class Main {

    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.setCountIsland(12);
        planet.setCountOcean(13);
        planet.printInfo(); //abstract method
        planet.printInfoAboutAtmosphere(); //abstract method
        Star star = new Star();
        star.setAge(666);
        star.setColor("blue");
        star.printInfo();  //abstract method
        star.printInfoAboutAtmosphere();  //abstract method
        Mars mars = new Mars("Ares");
        System.out.println(mars.toString());

    }
}
