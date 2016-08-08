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
	 * λ����ʵ�ּӷ���Ϊ�޽�λ�ͺͽ�λ����ĺͣ� 
		1������ a��b 
		2�������ǽ�λ�ĺͣ������ a xor b����1+1 =0 0+0 = 0 1+0=1����Ϊc
		3������ab�Ľ�λ��ֻ�ж���ͬΪ1�Ž�λ�����������һλ����˽�λ���Ա�ʾΪ (a and b) << 1,��Ϊd  
		4������a+b���Կ���  c+d����ʱ����� �µĽ�λ(c and d)��Ϊ0���ݹ��ظ�2,3��������������Ϊc,d��
		������������a,b����Ϊ��������Ӱ�졣
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
    


