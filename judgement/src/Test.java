import java.util.Scanner;
//判断是否为闰年
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查询的年份：");
        try{
             int a = sc.nextInt();
        if( a<3000 && a>0 ){
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                System.out.println("是闰年");
            }else System.out.println("不是闰年");
        }
        else System.out.println("请输入0-3000的数字");
        }catch (Exception e){
            System.out.println("请输入数字");
        }
    }
}
