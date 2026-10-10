package lab2.ex;

public class ParserArgs {

  public static boolean isCorrectSecondArg(String secondArg){
    return secondArg != null
           && (secondArg.startsWith("-") || secondArg.startsWith("/"))
           && secondArg.length() == 2;
  }

}
