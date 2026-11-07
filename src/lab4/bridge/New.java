package lab4.bridge;

public class New {

  interface Renderer{
    void renderCircle(double radius);
    void renderSquare(int side);
    void renderTriangle(int side);
  }

  static class VectorRenderer implements Renderer{

    @Override
    public void renderCircle(double radius) {
      System.out.println("Vector renderer for Circle, it's radius = " + radius);
    }

    @Override
    public void renderSquare(int side) {
      System.out.println("Vector renderer for Square, it's side = " + side);
    }

    @Override
    public void renderTriangle(int side) {
      System.out.println("Vector renderer for Triangle, it's side = " + side);
    }
  }

  static class PixelRenderer implements Renderer{

    @Override
    public void renderCircle(double radius) {
      System.out.println("Pixel renderer for Circle, it's radius = " + radius);
    }

    @Override
    public void renderSquare(int side) {
      System.out.println("Pixel renderer for Square, it's side = " + side);
    }

    @Override
    public void renderTriangle(int side) {
      System.out.println("Pixel renderer for Triangle, it's side = " + side);
    }
  }

  static abstract class Shape{

    protected final Renderer renderer;


    public Shape(Renderer renderer) {
      this.renderer = renderer;
    }

    protected abstract void draw();
  }

  static class Circle extends Shape{

    private double radius;

    public Circle(Renderer renderer, double radius){
      super(renderer);
      this.radius = radius;
    }

    @Override
    protected void draw() {
//      this.renderer.renderCircle(this.radius);
      System.out.println("hello");
    }
  }

  static class Square extends Shape{

    private int side;

    public Square(Renderer renderer, int side){
      super(renderer);
      this.side = side;
    }

    @Override
    protected void draw() {
      this.renderer.renderSquare(this.side);
    }
  }

  static class Triangle extends Shape{

    private int side;

    public Triangle(Renderer renderer, int side){
      super(renderer);
      this.side = side;
    }

    @Override
    protected void draw() {
      this.renderer.renderTriangle(this.side);
    }
  }

  public static void main(String[] args){

    Renderer rendererPixel = new PixelRenderer();
    Renderer rendererVector = new VectorRenderer();

    Shape c1 = new Circle(rendererPixel, 4);
    Shape c2 = new Circle(rendererVector, 4);
    Shape s1 = new Square(rendererPixel, 6);
    Shape t1 = new Triangle(rendererPixel, 8);

    c1.draw();
    c2.draw();
    s1.draw();
    t1.draw();

  }

}
