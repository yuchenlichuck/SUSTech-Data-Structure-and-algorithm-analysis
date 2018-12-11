public class Main44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int daysNumberConstant = 50;
		final int orderConstant = 10;
		
    int daysNumber = (int)(100 * Math.random());
    int ordersNumber = (int)(100 * Math.random());
    System.out.print(daysNumber + " ");
    System.out.println(ordersNumber);
    for (int i = 0; i < daysNumber;i ++) {
    	System.out.print(daysNumberConstant + (int)( daysNumberConstant * Math.random() ) + " " );
    	}
     System.out.println();
     for (int i = 0; i < ordersNumber;i ++) {
     	System.out.print(orderConstant + (int)( orderConstant * Math.random() ) + " " );
     	int j = orderConstant + (int)( orderConstant * Math.random() );
    	System.out.print(j+ " " );
    	System.out.print(j +(int)( orderConstant * Math.random() )+" ");
    	System.out.println();
     	}
      
	}

}
