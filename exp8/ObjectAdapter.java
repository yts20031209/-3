public class ObjectAdapter implements Encryptor {
    private ThirdPartyEncryption thirdPartyEncryption;

    public ObjectAdapter() {
        this.thirdPartyEncryption = new ThirdPartyEncryption();
    }

    @Override
    public String encrypt(String data) {
        // 适配第三方加密类的方法
        return thirdPartyEncryption.encode(data);
    }
}
