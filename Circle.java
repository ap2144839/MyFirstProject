public class Circle{
  //fields
  private double r;
  //private double x;
  //private double y;
  //methods
  public void setR(double r){
    this.r=r;
  }
  public double getR(){
    return r;
  }
  public double square(double r){
    return 2*3.14*r*r;
  }
  public void printSquare(){
    System.out.println(square(5));
  }
}