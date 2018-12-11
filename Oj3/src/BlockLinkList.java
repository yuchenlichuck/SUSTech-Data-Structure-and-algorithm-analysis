import java.util.ArrayList;
import java.util.Collections;

public class BlockLinkList {

	public class BlockLinkNode {
		
		
        
        public BlockLinkNode prev;

        
        public BlockLinkNode next;

       
        public ArrayList<Integer> list;
        
        public BlockLinkNode(BlockLinkNode prev,BlockLinkNode next,ArrayList<Integer> list)
        {
        	
        	this.prev=prev;
        	this.next=next;
        	this.list=list;
        	
        }
        
    }
	public BlockLinkNode blockLinkNode = null;
	private int total;
	
	        public BlockLinkList()
	        {
	            //初始化节点
	        	
	        	// blockLinkNode = new BlockLinkNode(null,null,list);
	      
	        }
	
	        
	        
	
	       
	
	        
	        public boolean IsExist(int num)
	        {
	            boolean isExist = false;
	
	            BlockLinkNode temp = blockLinkNode;
	
	            while (temp != null)
	            {
	                //判断是否在该区间内
	                if (temp.list.size()-1 > 0 && num >= temp.list.get(0) && num <= temp.list.get(temp.list.size() - 1))
	                {
	                    isExist = temp.list.indexOf(num) > 0 ? true : false;
	
	                    return isExist;
	                }
	
	                temp = temp.next;
	            }
	
	            return isExist;
	        }
	
	        public String Get(int num)
	        {
	        	int blockIndex = 0;
	            int arrIndex = 0;
	
	            BlockLinkNode temp = blockLinkNode;
	
	            while (temp != null)
	            {
	                //判断是否在该区间内
	                if (temp.list.size()-1 > 0 && num >= temp.list.get(0) && num <= temp.list.get(temp.list.size()- 1))
	                {
	                    arrIndex = temp.list.indexOf(num);
	
	                    return String.format("当前数据在第{0}块中的{1}个位置", blockIndex, arrIndex);
	                }
	
	                blockIndex = blockIndex + 1;
	                temp = temp.next;
	            }
	
	             String str=null;
	             str="";
	             return str;
	        }
	
	       
	        
	        
	        public BlockLinkNode Add(int num)
	        {
	            return Add(blockLinkNode, num);
	        }
	
	       
	        
	        private BlockLinkNode Add(BlockLinkNode node, int num)
	        {
	            if (node == null)
	            {
	                return node;
	            }
	            else
	            {
	                /*
	                 *  第一步：找到指定的节点
	                 */
	                if (node.list.size()== 0)
	                {
	                    node.list.add(num);
	
	                    total = total + 1;
	
	                    return node;
	                }
	
	                //下一步：再比较是否应该分裂块
	                int blockLen = (int)Math.ceil(Math.sqrt(total)) * 2;
	
	                //如果该节点的数组的最后位置值大于插入值，则此时我们找到了链表的插入节点，
	                //或者该节点的next=null，说明是最后一个节点，此时也要判断是否要裂开
	                if (node.list.get(node.list.size() - 1) > num || node.next == null)
	                {
	                    node.list.add(num);
	
	                    //最后进行排序下，当然可以用插入排序解决，O(N)搞定
	                    Collections.sort(node.list);
	
	                    //如果该数组里面的个数大于2*blockLen，说明已经过大了，此时需要对半分裂
	                    if (node.list.size() > blockLen)
	                    {
	                        //先将数据插入到数据库
	                        int mid = node.list.size()/2-1;
	
	                        //分裂处的前段部分
	                        ArrayList<Integer> firstList = new ArrayList<Integer>();
	
	                        //分裂后的后段部分
	                        ArrayList<Integer> lastList = new ArrayList<Integer>();
	
	                        //可以在插入点处分裂，也可以对半分裂(这里对半分裂)
	                        
	                        
	                        for(int i=0;i<mid;i++)
	                        {
	                        	firstList.add(i,node.list.get(i));
	                        }
	                       
	                        for(int i=mid;i<node.list.size()-1;i++)
	                        {
	                        	lastList.add(i,node.list.get(i));
	                        }
	                        
	
	
	                        //开始分裂节点，需要新开辟一个新节点
	                        ArrayList<Integer> tlist = new ArrayList<Integer>();
	                        BlockLinkNode nNode = new BlockLinkNode(null,null,tlist);
	
	                        nNode.list = lastList;
	                        nNode.next = node.next;
	                        nNode.prev = node;
	
	                        //改变当前节点的next和list
	                        node.list = firstList;
	                        node.next = nNode;
	                    }
	
	                    total = total + 1;
	
	                    return node;
	                }
	
	                return Add(node.next, num);
	            }
	        }
	
	       
	        
	        public BlockLinkNode Remove(int num)
	        {
	            return Remove(blockLinkNode, num);
	        }
	
	        
	        
	        private BlockLinkNode Remove(BlockLinkNode node, int num)
	        {
	            if (node == null)
	            {
	                return node;
	            }
	            else
	            {
	                //第一步： 判断删除元素是否在该节点内
	             if (node.list.size()-1> 0 && num >= node.list.get(num) && num <= node.list.get(node.list.size() - 1))
	                {
	                    //定义改节点的目的在于防止remove方法假删除的情况发生
	                    int prevcount = node.list.size();
	
	                    node.list.remove(num);
	
	                    total = total - (prevcount - node.list.size());
	
	                    //下一步： 判断是否需要合并节点
	                    int blockLen = (int)Math.ceil(Math.sqrt(total) / 2);
	
	                    //如果当前节点的数组个数小于 blocklen的话，那么此时改节点需要和后一个节点进行合并
	                    //如果该节点时尾节点，则放弃合并
	                    if (node.list.size()< blockLen)
	                    {
	                        if (node.next != null)
	                        {
	                            node.list.addAll(node.next.list);
	
	                            //如果下一个节点的下一个节点不为null，则将下下个节点的prev赋值
	                            if (node.next.next != null)
	                                node.next.next.prev = node;
	
	                            node.next = node.next.next;
	                        }
	                        else
	                        {
	                            //最后一个节点不需要合并，如果list=0，则直接剔除该节点
	                            if (node.list.size()== 0)
	                            {
	                                if (node.prev != null)
	                                    node.prev.next = null;
	
	                                node = null;
	                            }
	                        }
	                    }
	
	                    return node;
	                }
	
	                return Remove(node.next, num);
	            }
	        }
	
	       
	        public int GetCount()
	        {
	            int count = 0;
	
	            BlockLinkNode temp = blockLinkNode;
	
	            System.out.println("各节点数据个数为：");
	
	            while (temp != null)
	            {
	                count += temp.list.size();
	
	                System.out.println(temp.list.size() + ",");
	
	                temp = temp.next;
	            }
	
	            System.out.println("总共有:{0} 个元素"+count);
	
	            return count;
	        }
	    }