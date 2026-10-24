package lab3.abstract_factory.impls;

import lab3.abstract_factory.inter.Widget;

public class MacWidget implements Widget {

  @Override
  public void accept() {
    System.out.println("widget accepted by МАК");
  }
}
