//输出所有的水仙花数,水仙花数是指一个3位数各位数字的立方和等于本身
public class test_1 {
    public static void main(String[] args) {
        for(int i=100; i<1000; i++){
            int a=i/100;    //确定百位数字
            int b=(i-a*100)/10;    //确定十位数字
            int c=(i-a*100-b*10);   //确定个位数字
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}

