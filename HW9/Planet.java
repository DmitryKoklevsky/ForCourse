package core;

public class Planet extends StarSystem {

    protected int countOcean;
    protected int countIsland;

    public int getCountOcean() {
        return countOcean;
    }

    public void setCountOcean(int countOcean) {
        this.countOcean = countOcean;
    }

    public int getCountIsland() {
        return countIsland;
    }

    public void setCountIsland(int countIsland) {
        this.countIsland = countIsland;
    }

    public void printInfo(){
        System.out.println("On the planet we have oceans: " + getCountOcean()  + " And islands: " + getCountOcean());
    }
    public void printInfoAboutAtmosphere()
    {
        System.out.println("This planet have Atmosphere");

    }

}
