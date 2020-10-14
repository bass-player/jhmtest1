import java.util.ArrayList;

//定义数组，并赋值1-10；将数组元素往前转移
public class Test1 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[10];
        System.out.print("原始数组为 ");
        for(int i=0; i<10; i++){
            arrayNumber[i] = i+1;
            System.out.print(arrayNumber[i]+" ");
        }
        System.out.println("");
        System.out.print("移位后的数组为 ");
        int temp = arrayNumber[0];
        for(int j=0; j<arrayNumber.length; j++){
            if(j==arrayNumber.length-1){
                arrayNumber[j]=temp;
            }else{
            arrayNumber[j]=arrayNumber[j+1];}
            System.out.print(arrayNumber[j]+" ");
        }
    }
}
