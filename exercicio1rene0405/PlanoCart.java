
public class PlanoCart(){
  private int[] maisx = new int[101];
  private int[] maisy = new int[101];
  private int[] menosx = new int[101];
  private int[] menosy = new int[101];
  private int coordx;
  private int coordy;
  
  public PlanoCart(int a, int b, int j){
    if(a>=0) maisx[j] = a;
    else menosx[j] = a; 
    if(b>=0) maisy[j] = b;
    else menosy[j] = b;
    coordx = a;
    coordy = b;
  }
}

/*
  2. Crie uma classe para representar um plano cartesiano que pode conter
múltiplos pontos (máximo de 100 pontos):
● crie atributos e métodos para a manipulação dos atributos
● pontos são armazenados em um array e indexados
●
insira pontos aleatório no plano
● DICA: importe a classe java.util.Random
● Random random = new Random();
●
int numero = random.nextInt(valor);

● Um ponto (a,b) no plano cartesiano domina outro ponto (x,y) se a <= x e
b <= y. Escreva um método para retornar todos os pontos dominados
>por um ponto especificado pelo índice no array.
  */