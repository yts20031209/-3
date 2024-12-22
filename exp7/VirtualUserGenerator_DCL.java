public class VirtualUserGenerator_DCL {
    // 双重检查锁定实现
    private volatile static VirtualUserGenerator_DCL instance;
    private int userCount = 0;

    private VirtualUserGenerator_DCL() {
        // 私有构造函数
    }

    public static VirtualUserGenerator_DCL getInstance() {
        if (instance == null) {
            synchronized (VirtualUserGenerator_DCL.class) {
                if (instance == null) {
                    instance = new VirtualUserGenerator_DCL();
                }
            }
        }
        return instance;
    }

    public void generateUser() {
        userCount++;
        System.out.println("DCL Singleton: Generated virtual user #" + userCount);
    }
}
