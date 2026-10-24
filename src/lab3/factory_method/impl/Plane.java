package lab3.factory_method.impl;

import lab3.factory_method.Transport;

public class Plane implements Transport {

  @Override
  public void delivery() {
    System.out.println("Доставка осуществлена с помошью PLANE");
  }

  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }
}
