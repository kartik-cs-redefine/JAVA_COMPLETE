//lec-03 
//variables
public class lec03{
    public static void main(String args[]){
        byte firstval = -128;
        // firstval->identifier
        // int - > Datatype 
        // -128 -> literal 
        // keywords : class , int , double , void ( i.e. reserved words )
        System.out.println(firstval);
        //datatype - primitive + non-primitive
        // -primitive : Integer , Real no. , Character , Boolean 
        // Integer : byte , short , int , long 
        // they have different range 
        // byte :  -128 to +127 (8bit)
        // short : 16 bit 
        // int : 32 bit 
        // long : 64 bit
        // - Every number is signed in java 

        // Real no. : float , double 
        // float : 32 bit ( single precision )
        // double : 64 bit ( double precision ) // use while production grade code 

        // Character : char ( unicode ) ASCII -> 8 bit 
        // - use in single quote e.g. 'k'
        // - but in container we store its ASCII number 
        // - then if we retrieve data then it converted from its ASCII code to its character 
        // - but it not include hindi characters , and more 
        // - to solve all charaters problem : Java introduced unicode->16 bit which includes all type of characters 
        
        // Boolean : True(0) or False(1)
        // - unlike of c++ , in java boolean means only True or False 

        //Practice begins
        //Integers - > byte , short , int , long 
        //Binary(2) , Octal(8) , HexaDecimal(16) number system
        byte a = 5;
        short b = 12;
        int c = 12000;
        long d = 123_456_532; //underscore will ignore by compiler : underscore makes things more readable 
        System.out.println(a+" "+b+" "+c+" "+d);

        int ab = 0b101; // 0b -> for binary
        int ac = 023;    // 0  -> for octal 
        int ad = 0X23;  // 0X -> for hexadecimal
        System.out.println(ab+" "+ac+" "+ad);

        float e = 123.21f;
        double f = 1234.456e5;
        char g = 'k';
        boolean i = false;
        System.out.println(e+" "+f+" "+g+" "+i);
            
    }
}