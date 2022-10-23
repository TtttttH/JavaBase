package Base;

public class AddressBook implements Cloneable{
    private Address address;
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressBook() {};

    public AddressBook(Address address) {
        this.address = address;
    }

    //浅拷贝
//    @Override
//    public AddressBook clone() {
//        try {
//            return (AddressBook) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    //深拷贝
    @Override
    public AddressBook clone() {
        try {
            AddressBook book = (AddressBook) super.clone();
            book.setAddress(book.getAddress().clone());
            return book;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        AddressBook book1 = new AddressBook(new Address("Sheffield"));
        AddressBook book2 = book1.clone();
        System.out.println(book1.getAddress() == book2.getAddress()); //浅拷贝 true, 深拷贝false
    }
}
