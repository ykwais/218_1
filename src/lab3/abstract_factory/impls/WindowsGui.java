package lab3.abstract_factory.impls;

import lab3.abstract_factory.inter.Button;
import lab3.abstract_factory.inter.GuiFactory;
import lab3.abstract_factory.inter.TextField;
import lab3.abstract_factory.inter.Widget;

public class WindowsGui implements GuiFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public TextField createTextField() {
    return new WindowsTextField();
  }

  @Override
  public Widget createWidget() {
    return new WindowsWidget();
  }
}
