package core;

public class Star extends StarSystem {

    protected int age;
    protected String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void printInfo() {
        System.out.println("This star have colot " +getColor() + " and her age " + getAge());

    }
    public void printInfoAboutAtmosphere()
    {
        System.out.println("This object doesn't have Atmosphere");

    }

}
