package lab4.adapter;

public class Old {

  static class LegacyPrinter{
    void print(String text){
      System.out.println("legacy printer printed: " + text);
    }
  }

  static class ReportService{
    private LegacyPrinter printer;

    public ReportService(LegacyPrinter printer){
      this.printer = printer;
    }

    public void generateReport(String input){
      printer.print(input);
    }
  }

  public static void main(String[] args){

    ReportService service = new ReportService(new LegacyPrinter());
    service.generateReport("akjghkdsfhgkjsfdg");

  }


}
