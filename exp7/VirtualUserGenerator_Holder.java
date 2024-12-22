public class VirtualUserGenerator_Holder {
    // IoDH实现
    private int userCount = 0;

    private VirtualUserGenerator_Holder() {
        // 私有构造函数
    }

    private static class Holder {
        private static final VirtualUserGenerator_Holder INSTANCE = new VirtualUserGenerator_Holder();
    }

    public static VirtualUserGenerator_Holder getInstance() {
        return Holder.INSTANCE;
    }

    public void generateUser() {
        userCount++;
        System.out.println("IoDH Singleton: Generated virtual user #" + userCount);
    }
}
