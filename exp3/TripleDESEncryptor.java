public class TripleDESEncryptor extends Encryptor {
    @Override
    public String encrypt(String data) {
        return "Triple DES Encrypted: " + data;
    }

    @Override
    public String decrypt(String data) {
        return data.replace("Triple DES Encrypted: ", "");
    }
}
