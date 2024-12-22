public interface Component {
    void share(String content);
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
}
