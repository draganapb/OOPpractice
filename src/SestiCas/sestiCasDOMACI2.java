package SestiCas;

public class sestiCasDOMACI2 {
    public static void main(String[] args) {

        //Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

        int niz[]= {1,10,256,57,69,33,27,58};

        for(int i = 0; i<niz.length; i++){
            if(niz[i]%2!=0){
                niz[i]=niz[i] + 2;
            }
        }

        for(int i = 0; i<niz.length; i++){
            System.out.println(niz[i]);

        }






    }
}
