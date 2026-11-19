//lec05 
public class lec05{
    public static void main (String args[]){
        //type conversion 
        // - implicit 
        // - explicit 
        byte b = 24 ;
        int i;
        i=b;
        System.out.println(i);
        // rule - destination datatype should be wider than source datatype
        // simple si baat hai , koi small value badi me to aa hi jayegi bhaii
        // this is known as widening conversion i.e. implicit conversion

        // now Explicit conversion : java can't do it by itself . 
        i=300;
        byte c ;
        c=(byte)i;
        System.out.println(c); // o/p : 44 (data is truncated) , narrowing conversion 

        char cc= 'A';
        int kk=cc;
        System.out.println((char)kk);


        float p = 29.99f;
        int pk = (int)p;
        System.out.println(pk);

        //boolean bool = false ;
        //int z = (int)bool; // not possible not possible
        
        //now - Automatic Type promotion 
        byte q = 50 ;
        byte w = 40 ;
        byte e = 100;
        int r = (q*w)/e; // now q*w in automatic convert in int type
        System.out.println(r);

        //rules - 
        // - byte , short , char are promoted into int 
        // - if one operand is long then whole expression is converted into float 
        // - if one operand is double then whole expression is converted into double 
        
    }
}