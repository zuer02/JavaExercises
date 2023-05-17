package progressao;

public class ProgressaoAritmetica extends Progressao{
  protected int incremento;

  public ProgressaoAritmetica(){
   this(1);
  //^ aqui vai chamar o | constutor aqui com valor 1
  }//                   |
//                      V
  public ProgressaoAritmetica(int valor){
    incremento = valor;
  }// implicitamente, qualquer construtor da subclasse chama o construtor da superclasse, ai vai chamar o default
  //explicitamente da pra usar o metodo super
  public ProgressaoAritmetica(int inicio, int inc){
    super(inicio);
    incremento = inc;
  }
  public int proximoValor(){
    atual += incremento;
    return atual;
  }
  
  
}