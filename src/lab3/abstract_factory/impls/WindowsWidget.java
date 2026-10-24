package lab3.abstract_factory.impls;

import lab3.abstract_factory.inter.Widget;

public class WindowsWidget implements Widget {

  @Override
  public void accept() {
    System.out.println("accepted widget by ВИНДОВС");
  }
}
