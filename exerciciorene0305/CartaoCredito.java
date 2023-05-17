public class CartaoCredito{
  private static int numero;
  private static String Nome;
  private static String banco;
  private static double saldo;
  private static int limite;

  public CartaoCredito(int num, String nom, String banc, double sald, int lim){
    numero = num;
    Nome = nom;
    banco = banc;
    saldo = sald;
    limite = lim;
  }

  public boolean compra(int valor){
    limite -= valor;
    if (limite<=0) return false;
    else return true;
  }

  public static String getBanco(){ return banco; }
  public static int getLimite(){ return limite; }
  public static double getSaldo(){ return saldo; }
  public static int getNumero(){ return numero; }
  
}