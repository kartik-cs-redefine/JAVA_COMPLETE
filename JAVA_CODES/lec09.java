//lec09 
//array : collections of particular datatype 
public class lec09{
    public static void main(String args[]){
        //declaration of array and definition of array 
        int[] roll = new int[3];
        //int[] -> datatype 
        //roll  -> identifier 
        //new   -> special keyword to allocate memory in heap 
        //int[3]-> size of array 
        roll[0]=29;
        roll[1]=3;
        roll[2]=20;
        System.out.println(roll[0]+" "+roll[1]+" "+roll[2]);

        //roll.length --> to find the size of array 
        System.out.println(roll.length);
        // System.out.println(roll[3]);

        // when we access any index which is out of or wqual to size of array then
        // IndexOutofBoundException occurs 
        // - since array follows 0-indexed so there is one less index accessible .

        int marks[] = new int[10];
        int n = marks.length;
        for(int i=0;i<n;i++){
            marks[i]=(i+1)*10;
            System.out.print(marks[i]+" ");
        }
        
        System.out.print("\n");
        //2-D array ( array of array )
        int ok[][] = new int[4][3];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                ok[i][j]=(i+1)*2;
            }
            for(int j=0;j<3;j++){
                System.out.print(ok[i][j]+" ");
            }
            System.out.print("\n");
        }

        int variable[][] = new int[4][];
        variable[0]=new int[3];
        variable[1]=new int[2];
        variable[2]=new int[8];
        variable[3]=new int[1];
        
        // direct --->
        int name[]={2,3,4,5};
        name[2]=5;

        int name2d[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        name2d[1][2]=90;


        //String in  java
        String nm = "Kartik";
        System.out.println(nm);




    }
}