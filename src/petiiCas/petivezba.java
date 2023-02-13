package petiiCas;

import java.util.Scanner;

public class petivezba {
    public static void main(String[] args) {
      //Koristeci WHILE petlju napraviti program gde korisnik unosi dvocifrene brojeve
//sve dok ne unese 'nedvocifren' broj
//na kraju programa ispisati prvu i drugucifru dvocifrenog broja
////napomena: ako je dvocifren broj deljiv sa 5 onda prekinuti program


        // Unositi brojeve sve dok se ne unesu dva ista broja za redom


      //  Napraviti program gde korisnik unosi brojeve sve dok ne unese 0
//Na kraju ispisati koji je najveci, a koji najmanji broj od prethodno unetih

            Scanner sc = new Scanner(System.in);
            System.out.println("Unesi broj: ");
            int x = sc.nextInt();
            int max;
            int min;

                max = 0;
               min = Integer.MAX_VALUE;

                while(x!=0){
                    if(x>max){
                        max = x;
                    }
                    if(x<min){
                        min = x;
                    }
                    x = sc.nextInt();

                }



        System.out.println(min + " i " + max);





            }




    }

