package lab3.builder;

public class LocalMain {

  public static void main(String[] args){
    Http http = new Http.Builder()
        .url("https://funandchecks.ru")
        .token("sfjhdkfhsj.sdkjhfjksd.sdfjweiuryew")
        .method("PUT")
        .method("POST")
        .header("key", "value")
        .header("length", "198")
        .build();

    System.out.println(http);

  }

}
