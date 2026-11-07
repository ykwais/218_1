package lab4.composite;

import java.util.ArrayList;
import java.util.List;

public class New {

  interface FileSystemItem{
    String getName();
    int getSize();
    void print(String skip);
  }

  static class File implements FileSystemItem{

    private String name;
    private int size;

    public File(String filename, int filesize){
      this.name = filename;
      this.size = filesize;
    }

    @Override
    public String getName() {
      return this.name;
    }

    @Override
    public int getSize() {
      return this.size;
    }

    @Override
    public void print(String skip) {
      System.out.println(skip + "\uD83D\uDCC4 " + this.name + " size: " + this.size);
    }
  }

  static class Folder implements FileSystemItem{

    private String name;
    private List<FileSystemItem> childrens = new ArrayList<>();

    public Folder(String name){
      this.name = name;
    }

    public void addItem(FileSystemItem item){
      this.childrens.add(item);
    }

    public void removeItem(FileSystemItem item){
      this.childrens.remove(item);
    }


    @Override
    public String getName() {
      return this.name;
    }

    @Override
    public int getSize() {
      int total = 0;
      for(FileSystemItem item : childrens){
        total += item.getSize();
      }
      return total;
    }

    @Override
    public void print(String skip) {
      System.out.println(skip + "\uD83D\uDCC2 " + this.getName() + " size: " + this.getSize() + "B");
      for(FileSystemItem item : childrens) {
        item.print(skip + "   ");
      }
    }
  }

  public static void main(String[] args){
    Folder root = new Folder("root");
    Folder src = new Folder("src");
    Folder test = new Folder("test");

    File mainFile = new File("Main.java", 100);
    File treeFile = new File("Tree.java", 450);
    File testFile = new File("Test.java", 900);

    src.addItem(mainFile);
    src.addItem(treeFile);

    test.addItem(testFile);

    root.addItem(src);
    root.addItem(test);

    File readme = new File("README.md", 200);
    root.addItem(readme);

    root.print("");



  }

}
