public class Main22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number =1;
        System.out.println(number);
        for (int i = 0;i < number;i++) {
        	int number2 = (int)(100 * Math.random());
        	 System.out.println(number2);
        	 for (int j = 0;j < number2;j++) {
        		 System.out.print((int)(Math.random() * Math.pow(10,2)) + " ");
        		 System.out.print((int)(2 * Math.random() * Math.pow(10,3))- 1000 + " ");


        		 System.out.println(); }
        	 }
	}

}