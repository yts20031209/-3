public class MD5Encryptor extends Encryptor {
    @Override
    public String encrypt(String data) {
        return "MD5 Encrypted: " + data;
    }

    @Override
    public String decrypt(String data) {
        return data.replace("MD5 Encrypted: ", "");
    }
}
