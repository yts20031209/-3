public class Client {
    public static void main(String[] args) {
        // 创建成员
        Component member1 = new Member("Alice");
        Component member2 = new Member("Bob");
        Component member3 = new Member("Charlie");
        Component member4 = new Member("David");

        // 创建群组
        Group mainGroup = new Group("Main Group");
        Group subGroup = new Group("Sub Group");

        // 构建群组结构
        mainGroup.add(member1);
        mainGroup.add(subGroup);
        subGroup.add(member2);
        subGroup.add(member3);
        mainGroup.add(member4);

        // 测试分享功能
        System.out.println("Sharing to main group:");
        mainGroup.share("Hello everyone!");

        System.out.println("\nSharing to sub group:");
        subGroup.share("Hello sub group members!");

        System.out.println("\nSharing to individual member:");
        member1.share("Direct message");

        // 测试群组管理
        System.out.println("\nRemoving a member from sub group:");
        subGroup.remove(member2);
        subGroup.share("After removing Bob");
    }
}
