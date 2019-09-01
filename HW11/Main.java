package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Button> buttons = new ArrayList<Button>();
        LinkedList<Field> fields = new LinkedList<Field>();
        HashSet<Label> labels = new HashSet<Label>();
        HashMap<Integer, Dropdown> dropdowns = new HashMap<Integer, Dropdown>();
        Button esc = new Button("esc");
        Button ctrl = new Button("ctrl");
        Button alt = new Button("alt");
        buttons.add(esc);
        buttons.add(ctrl);
        buttons.add(alt);
        buttons.set(0, alt);
        buttons.remove(0);
        for (Button button : buttons) {
            System.out.println(button);
        }
        Field amount = new Field(1, "amount");
        Field addres = new Field(2, "addres");
        Field inn = new Field(3, "inn");
        fields.add(amount);
        fields.add(addres);
        fields.add(inn);
        fields.set(1, inn);
        fields.remove(2);
        for (Field field : fields) {
            System.out.println(fields);
        }
        Label firstName = new Label("first name");
        Label lastName = new Label("last name");
        labels.add(firstName);
        labels.add(lastName);
        

    }
}
