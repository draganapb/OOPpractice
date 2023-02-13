package vezbanjeTest;

public class Q1 {
    public static void main(String[] args) {
        //Zadatak 38 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
//koji ce sadrzati prva tri parna broja prvog niza

        int niz1[] = {1,2,3,4,5,6,7,8,9};
       int niz2 [] = new int [3];
       int y =0;
        for(int i = 0; i< niz1.length; i++){
            if(niz1[i]%2==0){
                niz2 [y] = niz1[i];
                y++;
            }
          if(y>2){
               break;
          }
        }
        for(int i = 0; i<niz2.length; i++){
            System.out.println(niz2[i]);
        }









    }
}
