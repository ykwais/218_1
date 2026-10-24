package lab3.abstract_factory.impls;

import lab3.abstract_factory.inter.Button;
import lab3.abstract_factory.inter.GuiFactory;
import lab3.abstract_factory.inter.TextField;
import lab3.abstract_factory.inter.Widget;

public class MacGui implements GuiFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public TextField createTextField() {
    return new MacTextField();
  }

  @Override
  public Widget createWidget() {
    return new MacWidget();
  }
}
