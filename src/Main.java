import java.util.Scanner;

class Main {

    static void printarry(int[][] a){
        for(int i=0 ;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");

            }
            System.out.println("");
        }
    }

    static void taransposearry(int[][]a,int row){
        int ans[][] = new int[row ][row] ;
        for(int i=0;i<a.length ;i++){
            for(int j=i ;j<a.length ;j++){
               int  temp  = a[i][j] ;
               a[i][j] = a[j][i] ;
               a[j][i] = temp ;

            }
        }
        printarry(a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENter row and column of array : ");
        int row = sc.nextInt();

        int [][] arr = new int[row][row] ;
        for(int i=0;i< arr.length ;i++){
            for(int j=0 ;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();

            }
            System.out.println("");
        }
        taransposearry(arr,row);

    }
}