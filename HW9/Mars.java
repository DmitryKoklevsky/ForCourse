package core;

public class Mars extends Planet{

    protected int temperature;
    protected int countMountains;
    protected String alias;
//Третий - перегруженные, но не связанные друг с другом конструкторы и создаваться при помощи одного из них на выбор.
    public Mars(int temperature){

        this.temperature = temperature;
    }
    public Mars(int temperature, int countMountains){

        this.temperature = temperature;
        this.countMountains = countMountains;
    }
    public Mars(String alias){

        this.alias = alias;
    }

    @Override
    public String toString(){
        return "Mars - " + alias;
    }

}
