
public class Solution {
    public static int[] getNoZeroIntegers(int n) {
        int[] array= new int[2];
        boolean checkZero= true;
        double a = (double)n;

        a=((a*0.5)/2);
        Math.round(a);
        array[0]=(int)a;

        while (checkZero==true)
        {
            array[1]=n-(int)a;
            for(int i=0;i<array.length;i++)
            {
                String numbers=String.valueOf(array[i]);
                char[] array2 = new char[numbers.length()];
                for (int j=0;j<numbers.length();j++)
                {
                    array2[j]=numbers.charAt(j);
                    if(array2[j]=='0'){
                        array[0]=(int)a-1;
                    }else{
                        checkZero=false;
                    }
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
    int[] array = new int[2];
    int n=11;
    array = getNoZeroIntegers(n);
    for(int i=0;i<array.length;i++)
    {
        System.out.println(array[i]);
    }
    }
}