package lab5.decorater;


public class LocalMain {

  public static final String keyWord = "keyWord";

  interface Coffee{
    String getDescription();
    double getCost();
  }

  static class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
      return "Простой кофе";
    }

    @Override
    public double getCost() {
      return 2.0d;
    }
  }

  static abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
      this.coffee = coffee;
    }

    @Override
    public String getDescription() {
      return coffee.getDescription() + ", c добавленным " + this.getClass().getSimpleName();
    }

    @Override
    public double getCost() {
      return coffee.getCost() + 0.375d;
    }
  }

  static class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
      super(coffee);
    }

    @Override
    public String getDescription(){
      return coffee.getDescription() + " с добавленным молоком";
    }
  }

  static class ChocoDecorator extends CoffeeDecorator{
    public ChocoDecorator(Coffee coffee){
      super(coffee);
    }
  }




  public static void main(String[] args){

    Coffee order = new SimpleCoffee();

    order = new MilkDecorator(order);
    order = new ChocoDecorator(order);

    System.out.println(order.getDescription());
    System.out.println(order.getCost());
  }

}
