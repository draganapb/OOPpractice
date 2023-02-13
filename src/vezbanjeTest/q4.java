package vezbanjeTest;

public class q4 {
    public static void main(String[] args) {

        String zvezdica = "*" ;
        String oznaka = "";

        int i = 0;
        int x=0;

        for(i = 5; i>0; i--){
        for(x=0; x<i; x++){
            oznaka = oznaka + zvezdica;
        }
           System.out.println(oznaka);
        oznaka = "";
       }


        }




    }

