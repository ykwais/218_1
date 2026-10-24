package lab3.abstract_factory;

import java.util.Locale;
import lab3.abstract_factory.impls.MacGui;
import lab3.abstract_factory.impls.WindowsGui;
import lab3.abstract_factory.inter.GuiFactory;

public class LocalMain {

  private static final String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);

  public static GuiFactory getGuiFactory(){
    return switch(os){
      case "windows 11" -> new WindowsGui();
      case "macOS 27.1" -> new MacGui();
      default -> throw new UnsupportedOperationException("передано неизывестное значение");
    };

  }

  public static void main(String[] args){
    GuiFactory gui = getGuiFactory();
    Application app = new Application(gui);
    app.run();
  }

}
