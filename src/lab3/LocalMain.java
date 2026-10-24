package lab3;

import lab3.singleton.SingleClass;

public class LocalMain {

  public static void main(String[] args){

    SingleClass single = SingleClass.getInstance();

    single.getConnection();

  }

}
