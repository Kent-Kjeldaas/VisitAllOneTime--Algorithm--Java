package directgraph;

public class DirectGraph {

    public static void main(String[] args) {
        
        //Koden funker akkurat som oppgaven ønsket, skriv inn nodene (eksempelene under har noder A,B,C,D,E og Q) og et som viser hva som skjer om det er false, og et for true.
        //Eneste kravet er at antallet noder som er laget, er det den skal gå igjennom, på den måten kan det legges til noder i store kretser, som ikke nødvendigvis henger sammen.
        //og programmet vil løse ethvert tilfelle, uansett størrelse og type på Node-kretsen.
        
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node Q = new Node("Q");
        
//        False (kommer ikke til node Q)
//        A.addEdge(B);
//        A.addEdge(C);
//        A.addEdge(D);
//        B.addEdge(E);
//        Q.addEdge(E);
//        E.addEdge(B);
//        C.addEdge(E);
//        D.addEdge(E);
//        D.addEdge(C);
//        Q.addEdge(A);

//      True (Naar koden er riktig, vil den også printe veien som fungerer)
        A.addEdge(C);
        B.addEdge(A);
        B.addEdge(D);
        C.addEdge(E);
        D.addEdge(A);
        D.addEdge(E);
        D.addEdge(Q);
        E.addEdge(A);
        Q.addEdge(B);
        E.addEdge(Q);

        
        System.out.println(A.visitAll());
  }
}