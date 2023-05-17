import Lista.*;

class Main {
  public static void main(String[] args) {
    Lista<String> fibo = new Lista<String>("zero");
    fibo.addFim("um");
    fibo.addFim("um");
    fibo.addFim("dois");
    fibo.addFim("treis");
    fibo.addFim("cinco");
    fibo.addFim("oito");
    fibo.addFim("trezelula");
    fibo.oqposicao(5);
    fibo.addposicao(777, 1);
    fibo.oqposicao(1);
    fibo.imprime();

    
  }
}

/*1) to com problema no imprime, fala que nao consegue
pegar um get valor pq um tal de local1 é nulo
2) tbm ta imprimindo uns valores inesperados no inicio, sei nao*/