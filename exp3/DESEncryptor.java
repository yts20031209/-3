public class DESEncryptor extends Encryptor {
    @Override
    public String encrypt(String data) {
        return "DES Encrypted: " + data;
    }

    @Override
    public String decrypt(String data) {
        return data.replace("DES Encrypted: ", "");
    }
}
