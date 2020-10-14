import java.util.Scanner;

//任何一个大于6的偶数都能拆分成两个质数的和
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入6以上的偶数");
        int n = sc.nextInt();
        if(n<6){
            System.out.println("请输入大于6的数");
        }else if(n%2!=0){
            System.out.println("请输入偶数");
        }else{
        Test2 g = new Test2();
        for(int i=3; i<n/2; i+=2){
            int num = n-i;
            if(g.isPrime(i) && g.isPrime(num)) {
                System.out.println("数字" + n + "可拆分为" + i + "+" + num);
                }
            }
        }
    }

    private boolean isPrime(int i) {
        for(int j=2; j<i; j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}

