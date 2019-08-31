package core;

public class Sun extends Star{

    protected int gravity;
    protected int coreTemperature;

    //Другой - систему сеттеров и геттеров и инициализироваться при помощи их.
    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public int getCoreTemperature() {
        return coreTemperature;
    }

    public void setCoreTemperature(int coreTemperature) {
        this.coreTemperature = coreTemperature;
    }

}
