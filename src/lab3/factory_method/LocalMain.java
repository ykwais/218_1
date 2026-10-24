package lab3.factory_method;

import lab3.factory_method.impl.DefaultLogistics;
import lab3.factory_method.impl.PlaneLogistics;
import lab3.factory_method.impl.SeaLogistics;

public class LocalMain {

  public static void main(String[] args){

    Logistics logistics = new DefaultLogistics();

    logistics.planDelivery();

  }

}
