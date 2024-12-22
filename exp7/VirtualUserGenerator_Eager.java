public class VirtualUserGenerator_Eager {
    // 饿汉式单例实现
    private static final VirtualUserGenerator_Eager instance = new VirtualUserGenerator_Eager();
    private int userCount = 0;

    private VirtualUserGenerator_Eager() {
        // 私有构造函数
    }

    public static VirtualUserGenerator_Eager getInstance() {
        return instance;
    }

    public void generateUser() {
        userCount++;
        System.out.println("Eager Singleton: Generated virtual user #" + userCount);
    }
}
