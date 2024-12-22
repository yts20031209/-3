public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原始客户对象
        Address address = new Address("Street 1", "City 1", "Country 1");
        Customer original = new Customer("John", address);
        System.out.println("Original: " + original);

        // 浅克隆测试
        Customer shallowClone = (Customer) original.clone();
        System.out.println("Shallow Clone: " + shallowClone);

        // 修改原始对象的地址
        address.setStreet("Street 2");
        System.out.println("\nAfter changing original address:");
        System.out.println("Original: " + original);
        System.out.println("Shallow Clone: " + shallowClone); // 地址也会改变

        // 深克隆测试
        Customer deepClone = original.deepClone();
        System.out.println("\nDeep Clone: " + deepClone);

        // 再次修改原始对象的地址
        address.setStreet("Street 3");
        System.out.println("\nAfter changing original address again:");
        System.out.println("Original: " + original);
        System.out.println("Deep Clone: " + deepClone); // 地址不会改变
    }
}
