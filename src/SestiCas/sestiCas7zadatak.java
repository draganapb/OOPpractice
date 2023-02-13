package SestiCas;

public class sestiCas7zadatak {
    public static void main(String[] args) {
        //Zadatak 30
//Kreirati niz od x clanova (birate sami koliko)
//Dodeliti im vrednosti
//Ispisati da li je prvi clan veci od poslednjeg clana



                int niz[] = new int[2];

                niz[0] = 1;
                niz[1] = 9;

                if (niz[0] > niz[niz.length-1]) {
                    System.out.println("Prvi clan ima vecu vrednost");
                } else {
                    System.out.println("Prvi clan ima manju ili istu vrednost");
                }

            }
        }
















       /*moj nacin

        int niz[]=new int[5];


        niz[0]=20;
        niz[1]=5;
        niz[2]=6;
        niz[3]=18;
        niz[4]=2;

        if(niz[0]>niz[niz.length-1]){
            System.out.println("Prvi clan je veci od poslednjeg");
        }
        else if(niz[0]==niz[niz.length-1]){
        System.out.println("Prvi clan niza je jednak poslednjem");

        }
        else{
            System.out.println("Prvi clan je manji od poslednjeg");
        }
*/







