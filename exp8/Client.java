public class Client {
    private Encryptor encryptor;
    private DatabaseOperation dbOperation;

    public Client(Encryptor encryptor) {
        this.encryptor = encryptor;
        this.dbOperation = new DatabaseOperation();
    }

    public void saveEncryptedData(String data) {
        String encrypted = encryptor.encrypt(data);
        dbOperation.save(encrypted);
    }

    public static void main(String[] args) {
        // 测试对象适配器
        System.out.println("Testing Object Adapter:");
        Client client1 = new Client(new ObjectAdapter());
        client1.saveEncryptedData("Hello World");

        // 测试类适配器
        System.out.println("\nTesting Class Adapter:");
        Client client2 = new Client(new ClassAdapter());
        client2.saveEncryptedData("Hello World");
    }
}
