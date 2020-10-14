import java.util.Scanner;
public class test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入想要的a值");
            int a = sc.nextInt();
            System.out.println("请输入希望相加的位数");
            double b = sc.nextDouble();
            double sum = 0;
            for (double i = b; i > 0; i--) {
                sum = sum + a * Math.pow(10, b - i) * i;
            }
            int sum1 = (new Double(sum)).intValue();
            System.out.println(sum1);
        }catch (Exception e){
            System.out.println("请输入数字");
        }
    }
}

