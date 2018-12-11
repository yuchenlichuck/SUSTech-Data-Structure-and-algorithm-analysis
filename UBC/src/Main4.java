import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

import javax.imageio.ImageTypeSpecifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *寻找和为定值的多个数
 * 题目：输入两个整数n和sum，从数列1，2，3.......n 中随意取几个数，使其和等于sum，要求将其中所有的可能组合列出来。
 * 注：我们设置flag背包，用来标注对应的n+1是否被选中，1表示被选中，0则表示未选中，每当满足m==n时，则输出一组解。
 * @author Administrator
 */
public class Main4 {
    static int length;

    static void findCombination(int n,int m,int flagI[]){
        if (n<1||m<1) {
            return;
        }
        if (n>m) {
            n=m;
        }
        if (n==m) {
            flagI[n-1]=1;
            for (int i = 0; i < length; i++) {
                if (flagI[i]==1) {
                    System.out.print(i+1+" ");
                }
                
            }
            System.out.println();
            flagI[n-1]=0;
        }
        
        flagI[n-1]=1;
        findCombination(n-1, m-n, flagI);
        Math.
        flagI[n-1]=0;        
        findCombination(n-1, m, flagI);
    }
    public static void main(String[] args) {
        int n,m;3
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        length=n;
        int[] flag=new int[n];
        findCombination(n, m, flag);
    }
}