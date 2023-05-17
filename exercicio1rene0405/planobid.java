public class Planobid{
  private int l;
  private int alt;
  private int area;
  private int pontox;
  private int pontoy;

  public Planobid(int a, int b, int larg, int al){
    pontox = a;
    pontoy = b;
    l = larg;
    alt = al;
    area = l*alt;
  }

  public Planobid(int lar, int a){
    pontox = 0;
    pontoy = 0;
    l = lar;
    alt = a;
    area = l*alt;
  }
  
  public static void Mover(int d, int c){
    pontox = d;
    pontoy = c;
  }
  public static int getArea(){ return area; }
  
}