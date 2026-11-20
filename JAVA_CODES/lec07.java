//lec07 
public class lec07 {
    public static void main (String args[]){
        int k = 29 ;
        //simple if condition 
        if(k==29){
            System.out.println("Yes i is 29");
        }

        // if-else condition 
        int j = 3 ;
        if(j==3){
            System.out.println("j is not 23 ");
        }
        else {
            System.out.println("i is 23 ");
        }

        // nested if-else condition 
        if(k==29){
            if(j==23){
                System.out.println("yes k is 29 and j is 3 ");
            }
            else {
                System.out.println("k is 29 but j is not 3  ");
            }
        }
        else {
            System.out.println("k is not 29 ");
        }

        // nested if-elseif ladder condition 
        int i =7;
        if(i==3) System.out.println("1st");
        else if (i==4)System.out.println("1st");
        else if (i==4) System.out.println("2nd");
        else if (i==3) System.out.println("3rd");
        else  System.out.println("4th");

        //switch 
        int g = 3 ;
        switch(g){
            case 1 : 
                System.out.println("1st");
                break;
            case 2 : 
                System.out.println("2nd");
                break ;
            case 3 : 
                System.out.println("3rd");
                break ;
            case 4 : 
                System.out.println("4th");
                break ;
            default : 
                System.out.println("default case ");
        }
    }
    //expression in switch should be only in : byte , char , int , long , char , Enumeration 
    // No duplicate cases allowed 
     
}