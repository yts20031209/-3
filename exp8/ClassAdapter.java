public class ClassAdapter extends ThirdPartyEncryption implements Encryptor {
    @Override
    public String encrypt(String data) {
        // 直接使用父类的方法
        return encode(data);
    }
}
