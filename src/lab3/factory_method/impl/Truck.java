package lab3.factory_method.impl;

import lab3.factory_method.Transport;

public class Truck implements Transport {


  @Override
  public void delivery() {
    System.out.println("доставка осуществлена с помощью ТРАКА");
  }

  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }
}
