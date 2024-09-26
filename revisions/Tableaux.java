package revisions;

public class Tableaux {public static void main(String[] args) {
  int [] Tab;
  Tab = new int []{4,8, 7, 9, 1, 5, 4, 6,};
  int [] Tab2;
  Tab2 = new int [] {7, 6, 5, 2, 1, 3, 7, 4};
  int [] Tab3;
  Tab3 = new int [8];
  for (int i = 0; i < Tab3.length; i++);{
    for ( int i = 0; i < Tab.length; i++){int valeurCellule1= Tab2[i];        
        int resultat = ((Tab[i])+valeurCellule1);
        Tab3[i] = resultat;
        System.out.println(resultat);
    }}
  }


}
    
