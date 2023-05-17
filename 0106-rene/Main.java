import grafo.*;
import RedeSocial.*;

class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Joao Boanerges", "12/07/2028", 1, "MG30979431");
    Pessoa p2 = new Pessoa("Tiago Boanerges", "12/07/2028", 1, "MG30987431");
    Pessoa p3 = new Pessoa("Jose Trovao", "07/01/2002", 26, "MG01262777");
    Pessoa p4 = new Pessoa("Maria Untouched", "12/12/2001", 26, "MG81667778");
    Pessoa p5 = new Pessoa("Joana Brave", "01/05/2023", 5, "SC05281000");
    Pessoa p6 = new Pessoa("Cesa Birth", "27/12/1997", 30, "MG50015235");
    Pessoa p7 = new Pessoa("Vitoria Birth", "05/05/2003", 25, "MG70800999");
    Vertice<Pessoa> v1 = new Vertice<Pessoa>(p1);
    Vertice<Pessoa> v2 = new Vertice<Pessoa>(p2);
    Vertice<Pessoa> v3 = new Vertice<Pessoa>(p3);
    Vertice<Pessoa> v4 = new Vertice<Pessoa>(p4);
    Vertice<Pessoa> v5 = new Vertice<Pessoa>(p5);
    Vertice<Pessoa> v6 = new Vertice<Pessoa>(p6);
    Vertice<Pessoa> v7 = new Vertice<Pessoa>(p7);
    ListaAdj<Pessoa> Caralivro = new ListaAdj<Pessoa>(v1);
    Caralivro.append(v2);
    Caralivro.append(v3);
    Caralivro.append(v4);
    Caralivro.append(v5);
    Caralivro.append(v6);
    Caralivro.append(v7);
    v1.addRel(v2);
    v1.addRel(v3);
    v1.addRel(v4);
    v2.addRel(v1);
    v2.addRel(v3);
    v2.addRel(v4);
    v2.addRel(v5);
    v3.addRel(v1);
    v3.addRel(v2);
    v3.addRel(v4);
    v3.addRel(v6);
    v4.addRel(v1);
    v4.addRel(v2);
    v4.addRel(v3);
    v4.addRel(v4);
    v4.addRel(v7);
    v5.addRel(v2);
    v5.addRel(v7);
    v6.addRel(v4);
    v6.addRel(v7);
    v7.addRel(v3);
    v7.addRel(v5);
    v7.addRel(v6);
    Caralivro.printData(v3);
    Caralivro.printRel(v6);
    Caralivro.printGraph();
  }
}

/*
Em java, toda classe tem é subclasse de uma superclasse em comum, que é a Objects que tem Number(q tem Byte, Integer, Double, Float etc e tal), Boolean e Characters ;; só que nao pode usar muito isso pq nao dá pra fazer operacoes matematicas, é mto generico, dá uma volta do carai pra tentar fazer. ele vai explicar uma das solucoes
public class Valor<Tipo> {        ISSO É TIPO ARGUMENTO DE TIPO
  private Tipo i;

  public Valor(Tipo i){
    this.i = i;
  }
}
POSSO COLOCAR MAIS DE UM TIPO
class name Valor<T1, T2 ... TN>{
DHSDHGSD
}
CONVENÇÃO DE NOMES: K - key, T - type, eahsasujasjjhf
E K asasas asasa
DÁ PRA USAR COM OUTRA CLASSE COM OUTROS TIPOS
ex:  (construtor)   Valor(<Integer, Box<String, Double>>)
DÁ PRA FORÇAR O TIPO SER SÓ NUMBER
public class Valor<Type extends Number>{
jgfufjhgfgfjfjhgfk
}
E NAO PARA POR AÍ
class name<T extends Number, T2 extends Animal, T3 extends List, T4 extends coco> {
ashiashias
}
CARAAAAALHOOOOOOOOO DÁ PRA FAZER DE QUALQUER TIPO, SEJA OBJETO SEJA DE QQ COISA

agora fudeu

TRABALHO: 
IMAGEM
colocar dados das pessoas ne cada ponta que começa

*/