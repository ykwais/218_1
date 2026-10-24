package lab3.factory_method;

import lab3.factory_method.impl.Truck;

public abstract class Logistics {

  public Transport createTransport(){
    return new Truck();
  }

  public void planDelivery(){
    System.out.println("Сортировка");
    System.out.println("сборка заказа");
    System.out.println("передача в доставку");

    Transport transport = createTransport();
    transport.delivery();

    System.out.println("заказ доставлен с помощью " + transport.getName() + ", оставьте отзыв");
  }

}
