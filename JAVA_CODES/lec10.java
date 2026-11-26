//lec10 
public class lec10{
    public static void main(String [] args){
        //Primitive datatype --> goes in Stack Memory 
        // int s = 5 ; ( reference Memory ) ( s directly holds the value of 5 )
        //array - > Non-primitive datatype 
        // -------> Heap Memory 
        // int[] arr = new int[5];
        // arr - > reference variable in stack 
        // -- arr -> doesn't directly holds the array 
        // -- -----> It is a reference to an array 

        String[] name = new String[4];
        name[0]="Kartik";
        name[1]="Janvi";
        name[2]="Deepanshu";
        name[3]="Kaushik";

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }


    }
}