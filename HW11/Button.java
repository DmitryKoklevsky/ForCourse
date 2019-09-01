package core;

public class Button {

    private String name;
    private String action;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Button{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
