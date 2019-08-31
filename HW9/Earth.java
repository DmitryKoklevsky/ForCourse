package core;

public class Earth extends Planet{

    protected String animalName;
    protected String raceName;
//Один из классов на выбор должен содержать перегруженные связанные друг с другом конструкторы (используя this) и создаваться с их помощью.

    public Earth(String animalName)
    {
        this.animalName = animalName;
    }
    public Earth(String animalName, String raceName)
    {
        this(animalName);
        this.raceName = raceName;
    }

    public void printOcean()
    {
        System.out.println("In the Earth we have "  + super.getCountOcean() + " oceans");
    }
    public void printIslands()
    {
        System.out.println("In the Earth we have "  + super.getCountOcean() + " islands");
    }


}
