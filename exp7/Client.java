public class Client {
    public static void main(String[] args) {
        // 测试饿汉式单例
        System.out.println("Testing Eager Singleton:");
        VirtualUserGenerator_Eager eager1 = VirtualUserGenerator_Eager.getInstance();
        VirtualUserGenerator_Eager eager2 = VirtualUserGenerator_Eager.getInstance();
        eager1.generateUser();
        eager2.generateUser();
        System.out.println("eager1 == eager2: " + (eager1 == eager2));

        System.out.println("\nTesting Double-Checked Locking Singleton:");
        VirtualUserGenerator_DCL dcl1 = VirtualUserGenerator_DCL.getInstance();
        VirtualUserGenerator_DCL dcl2 = VirtualUserGenerator_DCL.getInstance();
        dcl1.generateUser();
        dcl2.generateUser();
        System.out.println("dcl1 == dcl2: " + (dcl1 == dcl2));

        System.out.println("\nTesting Initialization on Demand Holder Singleton:");
        VirtualUserGenerator_Holder holder1 = VirtualUserGenerator_Holder.getInstance();
        VirtualUserGenerator_Holder holder2 = VirtualUserGenerator_Holder.getInstance();
        holder1.generateUser();
        holder2.generateUser();
        System.out.println("holder1 == holder2: " + (holder1 == holder2));
    }
}
