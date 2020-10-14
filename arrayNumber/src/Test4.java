//1000个随机4位数，个位为0存在数组b[0]，以此推类得出数组
public class Test4 {
    public static void main(String[] args) {
        int[] al = new int[1000];
        int[] b = new int[10];
        for(int i=0; i<al.length; i++) {
            al[i] = (int) (10000 * Math.random());
            switch (al[i]%10){
                case 0: b[0]+=1;
                        continue;
                case 1: b[1]+=1;
                        continue;
                case 2: b[2]+=1;
                        continue;
                case 3: b[3]+=1;
                        continue;
                case 4: b[4]+=1;
                        continue;
                case 5: b[5]+=1;
                        continue;
                case 6: b[6]+=1;
                        continue;
                case 7: b[7]+=1;
                        continue;
                case 8: b[8]+=1;
                        continue;
                default: b[9]+=1;
                        continue;
            }
        }
        System.out.print("数组的值为：");
        int sum = 0;
        for(int a=0; a< b.length; a++){
            System.out.print(b[a]+" ");
            sum += b[a];
        }
        System.out.print(sum);
    }
}
