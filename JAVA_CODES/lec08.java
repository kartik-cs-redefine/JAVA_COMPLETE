//lec 08 
public class lec08{
    public static void main(String [] args){
        //loops : for , while , do-while 
        //- for loop : for(initialiazation , condition , updation ){} // condition --> boolean 
        
        for(int i=1 ;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        // comma separated variation 
        for(int p =1 ,  q = 2 ; p<=5 && q<=10;p+=1,q+=2){
            System.out.print(p*q+" ");
        }
        System.out.println("\n");
        //nested for-loop 
        outer : for(int i=1;i<20;i++){
            inner : for(int j=1;j<=i;j++){
                System.out.print("*");
                if(j>7) break inner ;
            }
            System.out.print("\n");
            if(i>15) break outer ;
        }

        System.out.print("\n");




        //-while loop : while(expression) {} // expression --> boolean 
        int k = 1 ;
        while(k<100){
            System.out.print(k++ + " ");
        }
        System.out.println("\n");


        // do-while loop 
        int z = 0 ;
        do{
            System.out.print(z++ +" ");
        }
        while(z<10);

        // Jump statements in Java - break , continue 

         System.out.println("\n");
        int kj = 1 ;
        while(kj<100){
            if(kj<30 ) continue ;
            System.out.print(kj++ + " ");

            if(kj>50) break ;
        }



    }
}