public class ArrayNumber {
    public static void main(String[] args) {
        int[] arrayNumber = new int[10];
        double sum = 0;
        System.out.print("数列的值为：");
        for(int i=0; i<arrayNumber.length; i++){
            arrayNumber[i] = (int)(100*Math.random());
            System.out.print(arrayNumber[i]+" ");
            sum += arrayNumber[i];
        }
        System.out.println("");
        int max = 0;
        int min = 100;
        for(int j=0; j<arrayNumber.length; j++){
            if(arrayNumber[j]>max){
                max = arrayNumber[j];
            }
            if(arrayNumber[j]<min){
                min = arrayNumber[j];
            }
        }
        System.out.println("数列最大值为:"+max);
        System.out.println("数列最小值为:"+min);
        System.out.println("数列和为:"+(int)sum);
        System.out.println("数列均值为"+(sum/arrayNumber.length));
    }
}
