public class lec06{
    public static void main (String [] args){
        //operators in java 
        //-arithmetic operators : + , - , * , / , % , ++ , -- 
        int a = 5 ;
        int b = 10 ;
        System.out.println("a = "+a+"\n"+"b = "+b);
        int c = a+b ;
        int d = a-b ;
        int e = a*b ;
        int f = b/a;
        int g = a%b;
        System.out.println("c : a+b="+c+"\n"+"d: a-b="+d);
        System.out.println("e : a*b="+e+"\n"+"f: b/a="+f);
        System.out.println("g : a%b="+g);

        c*=2; //(short hand way )
        d-=3;
        f/=2;
        g%=2;
        System.out.println("c*=2 :"+c+"\n"+"d-=3 :"+d);
        System.out.println("f/=2 :"+f+"\n"+"g%=2 :"+g);

        c++; //postfix increment 
        ++c; //prefix increment
        d--; // postfix decrement
        --d; //prefix decrement

        System.out.println("c++ :"+c+"\n"+"++c :"+c);
        System.out.println("d-- :"+d+"\n"+"--d :"+d);
        // a = b ; means assign value of b to a 

        // - relational operators : == , != , < , > , <= , >= , they results in boolean value , they are expressions 
        // a==b means is value of a is equal to b ? (is Yes : true else false )
        // a!=b means is value of a is not equal to b ? (is Yes : true else false )
        // a<b means is value of a is less than b ? (is Yes : true else false )
        // a>b means is value of a is greater than b ? (is Yes : true else false )

        boolean p1 = (a==b);
        boolean p2 = (f == g);
        boolean p3 = (c<d);
        boolean p4 = (e>=f);
        boolean p5 = (a!=b);
        boolean p6 = (c>b);
        System.out.println("p1 = "+p1+" p2 = "+p2);
        System.out.println("p3 = "+p3+" p4 = "+p4);
        System.out.println("p5 = "+p5+" p6 = "+p6);

        //Bitwise Operators : | , & , ~ , ^ , << , >> , >>>
        int z1 = 3 ;
        int z2 = 4 ;
        System.out.println("3 & 4 = "+(z1&z2)+"\n"+"3 | 4 = "+(z1|z2));
        System.out.println("3 ^ 4 = "+(z1^z2)+"\n"+"~3 = "+(~z1));
        int z3 = 1 ;
        System.out.println("(byte)1<<7 = "+((byte)z3<<7));
        z3=z3<<7;
        System.out.println("(byte)1<<1 = "+((byte)z3<<1));
        z3=1;
        System.out.println("1<<7 = "+(z3<<7));
        System.out.println("1<<1 = "+(z3<<1));

        // integer is always capped i.e. after 31 java automatically do 36%31 then do shifting 
        // shift will not work on byte or short 
        // -left shift : << : number moving towads left so number increases 
        //                  : number * ( 2 ^ (shift number )) 
        // - right shift : >> : number moving towards right 
        //                    : number * ( 2 ^ -(shift number ))
        // - >>> : right shift with zero  (dumb shift )
        //       : it can make a -ve number to + ve , it dont cares actually for sign bit , it introduces 0 in that place 
        // -(byte)128>>>1 = 64 , depend upon MSB 
        // -128>>>1 = 2147483584
        System.out.println("-(byte)128>>>1 = "+ (-(byte)128>>>1));
        System.out.println("-128>>>1 = "+ (-128>>>1));

        //Logical Operatirs : && , || 

        int y1 = 3 ;
        int y2 = 12 ;
        int y3 = 23 ;
        boolean y4 = (y1<y2) && (y2<y3);
        System.out.println(y4);
        // short circuiting 
        boolean y5 = (y1>y2) & (y2<y3);
        System.out.println("by using short ckt (y1>y2) & (y2<y3) " + y5 );

    }
}