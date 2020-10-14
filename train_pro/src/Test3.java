//求1-1/3+1/5-1/7....
public class Test3 {
    public static void main(String[] args) {
        double sum = 0;
        int a = 1;
        for(int i=1; ; i+=2){
            double b = i;
            sum = sum + a*Math.pow(-1,i/2)/b;
            if(a/b<1e-5){
                break;
            }
        }
        System.out.println(sum);
    }
}
