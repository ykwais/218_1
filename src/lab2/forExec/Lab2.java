package lab2.forExec;

import lab2.impl.Subaru;
import lab2.impl.Toyota;
import lab2.interfaces.Car;

public class Lab2 {

  public static void main(String[] args){

    Toyota toyota1 = new Toyota(4387568, "mark2", 4);
//    System.out.println(toyota1);
//    System.out.println(toyota1.getModel());


    Toyota toyota2 = new Toyota(4387568, "mark2", 4);

//    if(toyota2.equals(toyota1)){
//      System.out.println("equals");
//    } else {
//      System.out.println("not equals");
//    }

//    System.out.println(toyota1.hashCode());
//    System.out.println(toyota2.hashCode());

//    toyota1.drive();


    Car car = new Subaru(100, "brz", 3, true);

    ((Toyota) car).drive();
    ((Toyota) car).getModel();











  }

}
