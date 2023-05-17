package progressao;

public class ProgressaoGeometrica extends Progressao{
  protected int razao;

  public ProgressaoGeometrica(){ this(1); }
  
  public ProgressaoGeometrica(int raz){
    razao = raz;
  }
  public ProgressaoGeometrica(int inicio, int raz){
    super(inicio);
    razao = raz;
  }

  public int proximoValor(){
    atual = atual*razao;
    return atual;
  }
}