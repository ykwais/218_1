package lab3.abstract_factory.impls;

import lab3.abstract_factory.inter.TextField;

public class WindowsTextField implements TextField {

  @Override
  public void render() {
    System.out.println("rendered by ВИНДОВС");
  }
}
