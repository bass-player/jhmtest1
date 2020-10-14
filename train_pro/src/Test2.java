import java.util.Scanner;

//打印斐波那契数列第n个值
public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        System.out.println("请输入您要查询的位次：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int temp = a;
            a = a + b;
            b = temp;
            System.out.print(b+" ");
        }
        System.out.println("");
        System.out.println("第n个值为："+b);
    }
}
