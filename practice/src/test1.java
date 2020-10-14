import java.util.Scanner;
//输入n打印n层金字塔；n为奇数
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入层数（奇数）");
        try{
            int n = sc.nextInt();
            if(n%2!=0) {
                n = n*2-1;
                for (int a = 1; a <= n; a += 2) {
                    for (int i = 0; i < (n - a) / 2; i++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < a; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }else{
                System.out.println("请输入奇数");
            }
        }catch (Exception e){
            System.out.println("请输入正整数");
        }
    }
}
