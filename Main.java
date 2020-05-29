 1) class Main {
  public static void main(String[] args) {
    String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "0";
                else chessBoard[i][j] = "1";
                System.out.print(" " + chessBoard[i][j] + " ");
               
               
            }
             System.out.println();
        }
  }
}
2)
class Main {
  public static void main(String[] args) {
    int[][] mas2d = new int [10][10];
    Random rand = new Random();
    for (int i = 0; i < 10; i++)
    for (int j = 0; j< 10; j++)
    mas2d[i][j] = rand.nextInt(1000);
    
    for (int i = 0; i < 10; i++)
    {
      for (int j = 0; j < 10; j++)
      System.out.print(" "+ mas2d[i][j] + " ");
    System.out.println();
      
    }
    
  }
}
3)class Main {
  public static void main(String[] args) {
   int a[] = {9,5,5,59};
    int sum=0;
    for(int i=0; i<a.length; i++) {
        sum=sum+a[i];
    }
    System.out.println(sum);
  }
}
4)
class Main {
  public static void main(String[] args) {
    int[] r = new int[]{3, 7, 100, -26, 59, 11, -5, 5, 36, 1};
        for (int i = 0; i< r.length; i++){
            if (primeNumber(r[i]) == 1){
                System.out.print(r[i]+" ");
            }
        }
    }
 
    private static int primeNumber(int number)
    {
        for (int i=2; i<number; i++)
        {
            if (number%i == 0)
            {
                return 0;
            }
 
            if ((i==number) || (i>Math.sqrt(number)))
            {
                return 1;
            }
        }
 
        return 0;
    }
  }


