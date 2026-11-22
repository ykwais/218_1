package builder;

public class LocalMain {
  public static void main(String[] args) {
    Computer computer = new Computer.Builder("Intel Core i5")
        .ramGb(16)
        .storageGb(512)
        .graphicsCard(true)
        .build();

    System.out.println(computer);
  }
}
