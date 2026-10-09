import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String str1 = "banana";
    String str2 = "banana";

    String str3 = new String("banana"); //HEAP


    String str4 = str3.intern(); //in string pool


    if(str1.equals(str4)) {
      System.out.println("equals");
    } else {
      System.out.println("not equals");

    }


//    Integer b  = Integer.valueOf(a);
//    Integer c = null;//boxing
//
//    int d = c;//unboxing
//

    float flo = 7.0f;
    double dou = 8.9f;

    long a = 5;
    int c = (int) a;


    String[] arr = new String[]{"first", "Second", "third"};

    System.out.println(Arrays.toString(arr));

    int min = Integer.MIN_VALUE;
    System.out.println(min);
    System.out.println(Integer.toBinaryString(min));

    min >>= 1;
    System.out.println(min);
    System.out.println(Integer.toBinaryString(min));

//    min >>>= 1;
//    System.out.println(min);
//    System.out.println(Integer.toBinaryString(min));

    min <<= 1;
    System.out.println(min);
    System.out.println(Integer.toBinaryString(min));


    int x = a == 5 ? 45 : 89;

    for(;;){
      System.out.println("sdfdf");
      break;
    }

    int swithed = 20;

//    switch(swithed){
//      case 1:
//      case 2:
//        System.out.println("one-two trip");
//        System.out.println(swithed);
//        break;
//      case 3:
//        System.out.println("three");
//      default:
//        System.out.println("default");
//    }

//    switch(swithed){
//
//      case 10, 20, 40, 35634 -> {
//        System.out.println("one-two trip");
//        System.out.println(swithed);
//      }
//      case 30 -> System.out.println("thirty");
//      default -> System.out.println("default ten");
//    }

    String result = switch(swithed){
      case 10, 20, 40, 35634 -> {
        System.out.println("ratatatatat");
        yield "one-two trip";
      }
      case 30 -> "thirty";
      default -> "default ten";
    };

    System.out.println(result);

    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()){
      String str = scanner.next();
      System.out.println("прочитали: " + str );
    }

    StringBuilder sb = new StringBuilder(56);

    sb.append(56).append("sdgsffs").append(8.9d);

    System.out.println(sb);

    sb.append("asdgasgasdgasdgasdga");

    System.out.println(sb);

    sb.setLength(0);

    System.out.println(sb);















  }
}