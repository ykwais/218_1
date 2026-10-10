package lab2.ex.impl;

import lab2.ex.Handler;

public class HandlerH implements Handler {

  @Override
  public boolean canHandel(String str) {
    return "h".equals(str);
  }

  @Override
  public String handle(int value) {
    StringBuilder sb = new StringBuilder();
    for(int i = value; i <= 100; i+=value){
      sb.append(i).append(" ");
    }
    return sb.toString();
  }
}
