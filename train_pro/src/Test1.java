/**
 * 计算圆周率
 * PI=4-4/3+4/5-4/7...
 * 打印出第一个大于3.1415小于3.1416的值
 */
public class Test1 {
    public static void main(String[] args) {
        double a = 4;
        double num = 0;
        for(int i=1; ; i+=2){
            double b = i;
            num = num + a*Math.pow(-1,i/2)/b;
            if(num>3.14159 && num<3.1416) {
                break;
            }
        }
        System.out.println("计算所得PI值为："+num);
    }
}
