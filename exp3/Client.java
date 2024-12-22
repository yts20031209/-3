public class Client {
    public static void main(String[] args) {
        // 使用DES加密
        Encryptor encryptor = EncryptorFactory.getEncryptor("des");
        String encrypted = encryptor.encrypt("Hello World");
        System.out.println(encrypted);
        System.out.println(encryptor.decrypt(encrypted));

        // 使用3DES加密
        encryptor = EncryptorFactory.getEncryptor("desede");
        encrypted = encryptor.encrypt("Hello World");
        System.out.println(encrypted);
        System.out.println(encryptor.decrypt(encrypted));

        // 使用MD5加密
        encryptor = EncryptorFactory.getEncryptor("md5");
        encrypted = encryptor.encrypt("Hello World");
        System.out.println(encrypted);
        System.out.println(encryptor.decrypt(encrypted));
    }
}
