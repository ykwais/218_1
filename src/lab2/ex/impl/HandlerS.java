package lab2.ex.impl;

import lab2.ex.Handler;

public class HandlerS implements Handler {

  @Override
  public boolean canHandel(String str) {
    return "s".equals(str);
  }

  @Override
  public String handle(int value) {
    StringBuilder sb = new StringBuilder();
    while(value > 0){
      sb.append(value % 10).append(" ");
      value /= 10;
    }
    return sb.reverse().toString();
  }
}
