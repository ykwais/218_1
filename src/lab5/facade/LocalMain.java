package lab5.facade;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocalMain {

  //MVC

  static class DbRepository{

    private Map<Integer, String> db = new HashMap<>();

    public DbRepository(String connectionStr){
      System.out.println("get connection to DB: " + connectionStr);
      db.put(1, "test");
      db.put(3, "zatest");
      System.out.println("db initialized and connection got");
    }

    public String findById(int id){
      return db.get(id);
    }
  }

  static class BusinessService {
    private final DbRepository dbRepository;

    public BusinessService(DbRepository dbRepository){
      this.dbRepository = dbRepository;
    }

    public String findByIdAndConvertToUpperCase(int id){
      String value = dbRepository.findById(id);
      if(value == null) {
        System.out.println("Упс, вы передали id, который не хоранится в базе данных");
        return null;
      }
      return value.toUpperCase(Locale.ROOT);
    }
  }

  static class Server{
    private final BusinessService service;
    private boolean isStarted;

    public Server(BusinessService service){
      this.service = service;
      this.isStarted = false;
    }

    public void startServer(){
      this.isStarted = true;
      System.out.println("Server started on port 8080");

    }

    public String getInfo(int id){

        return isStarted ? service.findByIdAndConvertToUpperCase(id) : null;


    }
  }

  static class Application{
    private Server server;
    private DbRepository dbRepository;
    private BusinessService service;

    public Application(String connectionStr){
      this.dbRepository = new DbRepository(connectionStr);

      this.service= new BusinessService(this.dbRepository);

      this.server = new Server(this.service);
    }

    public void run(){
      server.startServer();
    }
  }



  public static void main(String[] args){

    Application app = new Application("jdbc:postgresql://192.89.67.2:5432/my_db");
    app.run();

    //разница

    DbRepository db = new DbRepository("jdbc:postgresql://192.89.67.2:5432/my_db");

    BusinessService service = new BusinessService(db);

    Server server = new Server(service);

    server.startServer();

  }

}
