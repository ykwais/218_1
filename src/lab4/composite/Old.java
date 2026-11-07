package lab4.composite;

import java.util.List;
import java.util.Objects;

public class Old {

  static class File{
    public String name;
    public int size;

    public File(String fileName, int size){
      this.name = fileName;
      this.size = size;
    }

    public int getSize(){
      return this.size;
    }
  }

  static class Folder{
    public String name;
    public List<Object> children;

    public Folder(String name, List<Object> list){
      this.name = name;
      this.children = List.copyOf(list);
    }

    public int getSize(){
      int total = 0;
      for(Object elem : children){
        if(elem instanceof File){
          total += ((File) elem).getSize();
        } else if (elem instanceof Folder){
          total += ((Folder) elem).getSize();
        } else {
          throw new UnsupportedOperationException("не поддерживается такой файл!");
        }
      }
      return total;
    }


  }

}
