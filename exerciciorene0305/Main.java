import java.io.IOException;
import java.util.Scanner;
import CartaoCredito.java;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    System.out.println("iae trabaiador");
    CartaoCredito cartaoum(0001, "josue", "inter", 300.00, 100);
    CartaoCredito cartaodois(0002, "josue", "c6", 355.00, 200);
    CartaoCredito cartaotres(0003, "josue", "santander", 100.00, 300);
    int gaita, pao, chevy;
    gaita = ler.nextInt();
    compra(gaita);
    if(compra(gaita)) System.out.printf("Compra aprovada no cartao %s", banco.cartaoum);
    else System.out.printf("compra nao aprovada");
      
    pao = ler.nextInt();
    compra(pao);
    if(compra(pao))System.out.printf("Compra aprovada no cartao %s", banco.cartaodois);
    else System.out.printf("compra nao aprovada");
      
    chevy = ler.nextInt();
    compra(chevy);
    if(compra(chevy)) System.out.printf("Compra aprovada no cartao %s", banco.cartaotres);
    else System.out.printf("compra nao aprovada");

    System.out.printf("limite do inter: %d", cartaoum.getLimite);
    System.out.printf("limite do c6: %d", cartaodois.getLimite);
    System.out.printf("limite do santander: %d", cartaotres.getLimite);
  }
}