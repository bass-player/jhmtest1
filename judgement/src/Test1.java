import java.util.Scanner;
//输入成绩，进行分级
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        try {
            int a = sc.nextInt();
            if(a>=0 && a<=100) {
                switch (a / 10) {
                    case 10:
                        System.out.println("满分");
                        break;
                    case 9:
                        System.out.println("优秀");
                        break;
                    case 8:
                        System.out.println("良好");
                        break;
                    case 7:
                    case 6:
                        System.out.println("及格");
                        break;
                    default:
                        System.out.println("不及格");
                }
            }else System.out.println("错误！请输入0-100内的数字");
        }catch (Exception e){
            System.out.println("错误！请输入数字");
        }
    }
}
