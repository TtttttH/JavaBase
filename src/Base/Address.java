package Base;

public class Address implements Cloneable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    private String privateName;

    public Address() {};
    public Address(String name) {
        this.name = name;
    }
    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}