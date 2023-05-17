package progressao;

public class Fibonacci extends Progressao{
  protected int a;
  protected int b;
  // fibo[i] = fibo[i-1] + fibo[i-2];
  public Fibonacci(){
    a = 0;
    b = 1;
  }

  public int proximoValor(){
    atual = a + b;
    a = b;
    b = atual;
    return atual;

    
  }
}