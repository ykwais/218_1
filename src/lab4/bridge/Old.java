package lab4.bridge;

public class Old {

//  interface Renderer{
//    void renderCircle();
//    void renderSquare();
//  }

  static
  class Circle{

  }

  static class Square{

  }

  static class Triangle{

  }

  static class VectorRenderer{
    void renderCircle(){}
    void renderSquare(){}
    void renderTriangle(){}
  }

  static class PixelRenderer{
    void renderCircle(){}
    void renderSquare(){}
    void renderTriangle(){}
  }

  public static void main(String[] args){
    VectorRenderer vRender = new VectorRenderer();
    PixelRenderer pixelRenderer = new PixelRenderer();

    vRender.renderCircle();
    vRender.renderSquare();
    pixelRenderer.renderCircle();
    pixelRenderer.renderSquare();

  }

}
