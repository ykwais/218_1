package lab3.abstract_factory.impls;

import lab3.abstract_factory.inter.Button;

public class MacButton implements Button {

  @Override
  public void action() {
    System.out.println("button activated by МАК");
  }
}
