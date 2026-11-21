package lab5.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LocalMain {

  private static final Random random = new Random();

  record Coffee(String kindCoffee, double price, String description, String toping){}

  static class FlyWeightExample{
    private Map<String, Coffee> mapCoffeeCache = new HashMap<>();

    public FlyWeightExample(){
      Coffee arabica = new Coffee("arabica", 3.99, "почувствуй вкус арабики", null);

      mapCoffeeCache.put(arabica.kindCoffee(), arabica);
    }

    public Coffee getCoffee(String kind){
      if(mapCoffeeCache.containsKey(kind)){
        return mapCoffeeCache.get(kind);
      }
        System.out.println("there is no such coffee in cache, let's get it");
        Coffee coffee = new Coffee(kind, random.nextExponential(), "добавили какой-то новый кофе", "choco");
        return mapCoffeeCache.put(kind, coffee);

    }
  }



  public static void main(String[] args){

    FlyWeightExample ex = new FlyWeightExample();
    System.out.println(ex.getCoffee("arabica"));

    System.out.println(ex.getCoffee("latte"));

    System.out.println(ex.getCoffee("latte"));

    ex.mapCoffeeCache.remove("latte");

    System.out.println(ex.mapCoffeeCache.get("latte"));

  }
}
