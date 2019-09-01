package core;

public class Field {
    public Field(int id, String value) {
        this.id = id;
        this.value = value;
    }

    private int id;

    @Override
    public String toString() {
        return "Field{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }

    private String value;
}
