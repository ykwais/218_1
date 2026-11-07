package lab4.adapter;

public class New {

  interface Printer{
    void print(String text);
  }

  static class LegacyPrinter{ // нельзя менять ни в коем случае
    void print(String text){
      System.out.println("legacy printer printed: " + text);
    }
  }

  static class LegacyPrinterWrapper implements Printer{

    private LegacyPrinter printer;

    public LegacyPrinterWrapper(LegacyPrinter legacyPrinter){
      this.printer = legacyPrinter;
    }

    @Override
    public void print(String text) {
      printer.print(text);
    }
  }

  static class NewPrinterWrapper implements Printer{

    @Override
    public void print(String text) {
      System.out.println("new printer printed: " + text);
    }
  }


  static class ReportService{
    private Printer printer;

    public ReportService(Printer printer){
      this.printer = printer;
    }

    public void generateReport(String input){
      printer.print(input);
    }
  }

  public static void main(String[] args){

    ReportService service = new ReportService(new NewPrinterWrapper());
    service.generateReport("akjghkdsfhgkjsfdg");

  }

}
