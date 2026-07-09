/*write a program to calculate simple interest and all the values will be given by user.*/
public class Si {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("please enter time ");
		int time=sc.nextInt();
		System.out.println("please enter principal");
		int principal=sc.nextInt();
		System.out.println("please enter rate");
		int rate=sc.nextInt();
        int si= (principal*rate*time)/100;
        System.out.println("Simple interest is "+si);
	}

}
