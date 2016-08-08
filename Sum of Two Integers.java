import java.util.*;

/**
 * @version 1.11 2016-08-01	
 * @author Steven7Gao
 */
public class Solution
{
	public static void main(String[] args)
	{
		System.out.println(getSum(-3,-2));	
		return ;
	}
	
	/*
	 * 位运算实现加法分为无进位和和进位两块的和： 
		1、输入 a，b 
		2、不考虑进位的和，结果是 a xor b，即1+1 =0 0+0 = 0 1+0=1，记为c
		3、计算ab的进位，只有二者同为1才进位，各自左边移一位，因此进位可以标示为 (a and b) << 1,记为d  
		4、于是a+b可以看成  c+d，这时候如果 新的进位(c and d)不为0，递归重复2,3两步操作，参数为c,d。
		特殊情况：如果a,b任意为负数，不影响。
	 */
	public static int getSum(int a, int b) {		
        int partSum = a^b;
        int carrie = a&b;
        //System.out.println(Integer.toBinaryString(a));
        //System.out.println(Integer.toBinaryString(b));
        //System.out.println(Integer.toBinaryString(partSum));
        //System.out.println(Integer.toBinaryString(carrie));
        if(carrie == 0) return partSum;
        else return getSum(partSum, carrie <<1 );
    }
}
    


