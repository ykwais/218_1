package lab2.impl;

import java.util.Objects;
import lab2.interfaces.Car;
import lab2.interfaces.Vehicle;

public class Toyota implements Car, Vehicle {

  private int mileage;
  private String model;
  private int volume;

  public Toyota(){
    System.out.println("init Toyota");
    this.mileage = 67;
  }

  public Toyota(int otherMileage, String model, int volume){
    System.out.println("other constructor");
    this.mileage = otherMileage;
    this.model = model;
    this.volume = volume;
  }

  public int getMileage() {
    return mileage;
  }

  public int getVolume(){
    return volume;
  }

  public String getModel(){
    return model;
  }

  public void setMileage(int newMileage){
    this.mileage = newMileage;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public void setModel(String newModel){
    this.model = newModel;
  }

  @Override
  public String soundOfMotor(){
    return "ratatatatatatatat";
  }

  @Override
  public void drive(){
    System.out.println("start engine");
    System.out.println("warming");
    System.out.println(soundOfMotor());
    System.out.println("run");
  }

  @Override
  public String location(){
    return "on land";
  }




  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || this.getClass() != o.getClass()) return false;
    Toyota obj = (Toyota) o;
    return this.mileage == obj.mileage &&
           this.volume == obj.volume
           && Objects.equals(this.model, obj.model);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.mileage, this.model, this.volume);
  }


  @Override
  public String toString(){
    return "Toyota{mileage=" + this.mileage
        + ", model=" + this.model +
           ", volume=" + this.volume +
           "}";
  }

}
