import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void share(String content) {
        System.out.println("Group " + name + " sharing content to all members:");
        for (Component component : components) {
            component.share(content);
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }
}
