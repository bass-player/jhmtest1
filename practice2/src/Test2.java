import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入9宫格规模：");
        int N = sc.nextInt();
        int[][] result = new int[N][N];
        int row = 0;//行
        int col = N/2;//列，中心
        for(int i=1; i<=N*N; i++){
            result [row][col] = i;
            row--;
            col++;
            if(row<0 && col>=N){col--;row+=2;} // 行列越界
            else if(row<0){row = N-1;}  //行越界
            else if(col>=N){col = 0;}   //列越界
            else if(result[row][col]!=0){col--;row+=2;} //有冲突
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){System.out.print(result[i][j]+"\t");}
            System.out.println();
        }
    }
}
