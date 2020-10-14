/**
 * 利用程序输出以下图形
 *         *
 *         ***
 *         *****
 *         *******
 *         *****
 *         ***
 *         *
 *
 */
public class test_4 {
    public static void main(String[] args) {
        for(int i=1; i<=13; i+=2){
            for(int j=1; j<=i && i+j<=14; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
