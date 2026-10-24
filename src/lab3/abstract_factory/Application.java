package lab3.abstract_factory;

import lab3.abstract_factory.inter.Button;
import lab3.abstract_factory.inter.GuiFactory;
import lab3.abstract_factory.inter.TextField;
import lab3.abstract_factory.inter.Widget;

public class Application {

  private final Button button;
  private final Widget widget;
  private final TextField textField;

  public Application(GuiFactory factory){
    this.button = factory.createButton();
    this.textField = factory.createTextField();
    this.widget = factory.createWidget();
  }

  public void run(){
    System.out.println("запуск приложения");
    button.action();
    widget.accept();
    textField.render();
    System.out.println("bye-bye");
  }

}
