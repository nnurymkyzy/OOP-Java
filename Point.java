
class Point{
  double p1;
  double p2;
  public void SetPoint1(){ 
    Scanner myObj = new Scanner(System. in);
    this. p1 = myObj. nextDouble();
  }
  public void SetPoint2(){
    Scanner myObj = new Scanner(System.in);
    this. p2 = myObj. nextDouble();
  }
   public double getPoint1(){
          return p2;
     }
    public double getPoint2(){
          return p2;
     }
}  
   class Main{  
    public static void main(String[] args){
      Point X = new Point();
      Point Y = new Point();
      X. SetPoint1();
      X. SetPoint2();
      Y. SetPoint1();
      Y. SetPoint2();
      
      double distance = Math. sqrt(((X.p2-X.p1)(X.p2-X.p1))+((Y. p2-Y. p1)(Y. p2-Y. p1)));
      System. out. print(distance);
    }
  }