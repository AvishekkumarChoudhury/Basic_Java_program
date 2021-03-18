package module3;


public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX=10;
        
        //allocate triangular array
        int[][] odds=new int[NMAX+1][];
        for(int n=0;n<=NMAX;n++)
            odds[n]=new int[n+1];
        //fill triangular array
        for(int n=0;n<odds.length;n++)
            for(int k=0;k<odds[n].length;k++)
            {
                int lotteryOdds=1;
                for(int i=1;i<=k;i++)
                    lotteryOdds=lotteryOdds*(n-1+1)/i;
                odds[n][k]=lotteryOdds;
    }
        //print triangular arrys
        
        for(int[] row: odds)
        {
            for (int odd : row)
                System.out.printf("%4d",odd);
            System.out.println();
        }
    }
}
