package grafo;
import RedeSocial.Pessoa;
public interface IVertice<T>{
  
  public void setProx(Vertice<T> c);
  public T getProx();
  public T getObjProx();
  
}