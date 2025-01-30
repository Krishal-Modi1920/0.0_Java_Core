public class Pattern8 {
    public static void main(String[] args) {
        int i,j,k,l;
        for(i=1;i<=5;i++)
        {
            for(k=2;k<=i;k++)
            {
                System.out.print("   ");
            }
            for(j=5;j>=i;j--)
            {
                System.out.print(" * ");
            }
            for(l=4;l>=i;l--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


/*
*******
 *****
  ***
   *
*/
