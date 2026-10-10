package lab2.ex;

import lab2.ex.impl.HandlerH;
import lab2.ex.impl.HandlerP;
import lab2.ex.impl.HandlerS;

/**
 * Через аргументы командной строки программе
 * подаются строковое представление числа x и флаг,
 * определяющий действие с этим числом.
 * Флаг начинается с символа ‘-’ или ‘/’.
 * Программа распознает следующие флаги:
 * */

public class Main {

  private final static Handler[] handlers = new Handler[]{
      new HandlerH(),
      new HandlerP(),
      new HandlerS()
  };

  public static void main(String[] args){
    if(args == null || args.length != 2) {
      System.out.println("incorrect amount of arguments");
      return;
    }

    String stringOfNumber = args[0];
    String stringOfFlag = args[1];

    if(!ParserArgs.isCorrectSecondArg(stringOfFlag)){
      System.out.println("incorrecyt second arg!");
      return;
    }

    String flag = stringOfFlag.substring(1, 2);
    flag = flag.toLowerCase();

    int value = 0;
    try{
      value = Integer.parseInt(stringOfNumber);
    } catch (Exception e){
      System.out.println("Sorry, your input of number is invalid");
      return;
    }

    System.out.println(value);
    System.out.println(flag);

    int count = 0;
    for(Handler handler : handlers){
      if(handler.canHandel(flag)){
        System.out.println(handler.handle(value));
        count++;
      }
    }

    if(count == 0){
      System.out.println("Sorry, doesn't support any handler");
    }


  }

}
