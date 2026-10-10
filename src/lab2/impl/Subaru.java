package lab2.impl;

public class Subaru extends Toyota {

  private boolean apposite;

  public Subaru(int otherMileage, String model, int volume, boolean apposite){
    super(otherMileage, model, volume);
    this.apposite = apposite;
  }

  @Override
  public String soundOfMotor(){
    return "miiiiiiiiiiiiiiiiiiiiuuuuuuuuuuu";
  }

  public boolean isApposite(){
    return  this.apposite;
  }



}
