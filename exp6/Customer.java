public class Customer implements Cloneable {
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    // 浅克隆
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 深克隆
    public Customer deepClone() throws CloneNotSupportedException {
        Customer cloned = (Customer) super.clone();
        cloned.address = (Address) this.address.clone();
        return cloned;
    }
}
