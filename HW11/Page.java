package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page {

    ArrayList<Button> buttons;
    LinkedList<Field> fields;
    HashSet<Label> labels;
    HashMap<Integer, Dropdown> dropdowns;
    private float id;
    private String title;

    public void addElementArrayList(Button object, ArrayList<Button> buttons)
    {
        buttons.add(object);
    }

    public void addLabelElement(Label object, HashSet<Label> labels)
    {
        labels.add(object);
    }
    public void removeLabelElement(Label object, HashSet<Label> labels)
    {
        labels.remove(object);
    }

}
