package grafo;
import RedeSocial.Pessoa;
public interface IListaAdj<T>{
  public void setAbaixo(Vertice<T> a);
  public T getAbaixo();
  public void append(T obj);
  public void printData(T obj);
  public void printRel(T obj);
  public void printGraph();
}