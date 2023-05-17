import progressao.*;

class Main {
  public static void main(String[] args) {
    Progressao P;
    P = new ProgressaoAritmetica();
    P.imprime(10);
    P = new ProgressaoAritmetica(5);
    P.imprime(10);
    P = new ProgressaoAritmetica(5, 5);
    P.imprime(10);

    P = new Fibonacci();
    P.imprime(10);
  }
}