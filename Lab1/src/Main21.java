import java.util.ArrayList;
import java.util.Scanner;

import lab.Main;

public class Main21{
	public class MatrixUDG {

	    private int[] mVexs;       // 顶点集合
	    private int[][] mMatrix;    // 邻接矩阵
	    private static final int INF = Integer.MAX_VALUE-10000;   // 最大值
	    
	    private int getPosition(int ch) {
	        for(int i=0; i<mVexs.length; i++)
	            if(mVexs[i]==ch)
	                return i;
	        return -1;
	    }
	    
	    public void prim(int start) {
		    int num = mVexs.length;         // 顶点个数
		    int index=0;                    // prim最小树的索引，即prims数组的索引
		    int[] prims  = new int[num];  // prim最小树的结果数组
		    int[] weights = new int[num];   // 顶点间边的权值

		    // prim最小生成树中第一个数是"图中第start个顶点"，因为是从start开始的。
		    prims[index++] = mVexs[start];

		    // 初始化"顶点的权值数组"，
		    // 将每个顶点的权值初始化为"第start个顶点"到"该顶点"的权值。
		    for (int i = 0; i < num; i++ )
		        weights[i] = mMatrix[start][i];
		    // 将第start个顶点的权值初始化为0。
		    // 可以理解为"第start个顶点到它自身的距离为0"。
		    weights[start] = 0;

		    for (int i = 0; i < num; i++) {
		        // 由于从start开始的，因此不需要再对第start个顶点进行处理。
		        if(start == i)
		            continue;

		        int j = 0;
		        int k = 0;
		        int min = INF;
		        // 在未被加入到最小生成树的顶点中，找出权值最小的顶点。
		        while (j < num) {
		            // 若weights[j]=0，意味着"第j个节点已经被排序过"(或者说已经加入了最小生成树中)。
		            if (weights[j] != 0 && weights[j] < min) {
		                min = weights[j];
		                k = j;
		            }
		            j++;
		        }

		        // 经过上面的处理后，在未被加入到最小生成树的顶点中，权值最小的顶点是第k个顶点。
		        // 将第k个顶点加入到最小生成树的结果数组中
		        prims[index++] = mVexs[k];
		        // 将"第k个顶点的权值"标记为0，意味着第k个顶点已经排序过了(或者说已经加入了最小树结果中)。
		        weights[k] = 0;
		        // 当第k个顶点被加入到最小生成树的结果数组中之后，更新其它顶点的权值。
		        for (j = 0 ; j < num; j++) {
		            // 当第j个节点没有被处理，并且需要更新时才被更新。
		            if (weights[j] != 0 && mMatrix[k][j] < weights[j])
		                weights[j] = mMatrix[k][j];
		        }
		    }

		    // 计算最小生成树的权值
		    int sum = 0;
		    for (int i = 1; i < index; i++) {
		        int min = INF;
		        // 获取prims[i]在mMatrix中的位置
		        int n = getPosition(prims[i]);
		        // 在vexs[0...i]中，找出到j的权值最小的顶点。
		        for (int j = 0; j < i; j++) {
		            int m = getPosition(prims[j]);
		            if (mMatrix[m][n]<min)
		                min = mMatrix[m][n];
		        }
		        sum += min;
		    }
	    System.out.println(sum);
	    }
	}

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for (int i = 0; i < T; i++) {
			int n=in.nextInt();
			int m=in.nextInt();
			MatrixUDG matrixUDG=new Main21().new MatrixUDG();
			matrixUDG.mMatrix=new int [n][n];
			matrixUDG.mVexs=new int[n];
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
				matrixUDG.mMatrix[j][j2]=Integer.MAX_VALUE;	
				}
			}
			for (int j = 0; j < m; j++) {
				int x=in.nextInt()-1;
				int y=in.nextInt()-1;
				int z=in.nextInt();
				matrixUDG.mMatrix[x][y]=z;
				matrixUDG.mMatrix[y][x]=z;
			}
			matrixUDG.prim(0);
			
		}
	}
}
