package core;


import java.util.List;

public class Dropdown {
    @Override
    public String toString() {
        return "Dropdown{" +
                "options=" + options +
                ", isSelected=" + isSelected +
                ", name='" + name + '\'' +
                '}';
    }

    List<String> options;
    boolean isSelected;
    String name;

}
