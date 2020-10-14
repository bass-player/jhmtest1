//求2/1+3/2+5/3+8/5+····前20项的和
//* 分子 2 3 5 8 13 21
//* 分母 1 2 3 5 8 13
public class test_3 {
    public static void main(String[] args) {
        double a = 2;
        double b = 1;
        double sum = 0;
        for(int i=0; i<4; i++){
            sum = sum + a/b;
            double c = a;
            a = a+b;
            b = c;
        }
        System.out.println(sum);
    }
}
