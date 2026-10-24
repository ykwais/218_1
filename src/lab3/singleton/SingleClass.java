package lab3.singleton;

public class SingleClass {

  private static final SingleClass INSTANCE = new SingleClass();

  private SingleClass(){}

  public static SingleClass getInstance(){
    return INSTANCE;
  }

  public void getConnection(){
    System.out.println("connecting to db....");
    System.out.println("connected to db");
    System.out.println("execute request");
    System.out.println("done, rows affected");
    System.out.println("return connection to pool");
  }

}
