package directgraph;
import java.util.Stack;

public class Node <T> { //generisk klasse Node
    Node[] nabo;
    int antallNaboer;
    static int noder;
    boolean merket = false;
    T id;
    static int pathL = 0; //path length, hvor mange noder algoritmen har vært innom
    static Stack a = new Stack(); // oppretter en stack
    
    public String toString() {
        return (String) id;
      }
    
    Node(T id) { //konstruktør
        this.id=id;
        nabo = new Node[7];
        antallNaboer = 0;
        noder++;
    }
    
    public void addEdge (Node n) { //legg til node
        nabo[antallNaboer] = n;
        antallNaboer++;
    }
    
    public boolean visitAll() { //basicly df
        merket = true; // merkerer noden vi er på
        boolean funnet = false; //vi har ikke funnet det vi leter etter
        int ant = 0; //ant node-veier?
        a.push(this); //pop`er noden vi er på nå, på stacken
        pathL++; //øker global counter med 1
        if (pathL == noder) { //om pathL er det samme som antall noder vi har vært innom er vi ferdig.
                System.out.println(a);
                return true; // end
        }
        else {
          for (int i = 0; i < antallNaboer; i++) { //Løper igjennom og finner første node som ikke er merkert.
              if (nabo[i].merket==false) {
                  funnet = nabo[i].visitAll();
              }
               if(pathL==noder){ //tester igjen om vi har fått merkert alle nodene 
               return true;
           }
          }
        }
          merket = false;
          a.pop();
          pathL--;
        return funnet;
    }
}