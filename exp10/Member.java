public class Member implements Component {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void share(String content) {
        System.out.println("Member " + name + " received: " + content);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Cannot add to a member");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Cannot remove from a member");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("Cannot get child from a member");
    }
}
