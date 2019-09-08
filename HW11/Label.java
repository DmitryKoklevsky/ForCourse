package core;

public class Label {

    public Label(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Label{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
}
