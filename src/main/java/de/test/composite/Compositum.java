package de.test.composite;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compositum
  implements Component {

  private List<Component> components = new ArrayList<Component>();

  private String name;

  private static final Logger LOG = LoggerFactory.getLogger(Compositum.class);

  public Compositum(String name) {
    this.name = name;
  }

  public void add(Component component) {
    components.add(component);
  }

  @Override
  public void execute() {
    LOG.debug("Executed " + name + " ... ");
    for (Component component : components) {
      component.execute();
    }
  }

  public Component getChild(int position) {
    return components.get(position);
  }

  public void remove(int position) {
    components.remove(position);
  }
}
