package lab3.factory_method.impl;

import lab3.factory_method.Logistics;
import lab3.factory_method.Transport;

public class PlaneLogistics extends Logistics {

  @Override
  public Transport createTransport(){
    return new Plane();
  }

}
