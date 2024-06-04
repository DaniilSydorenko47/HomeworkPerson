package HW28;

public class CustomerWithId {
    private String name;
    private String surname;
    private int id;

    public CustomerWithId(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }
}
