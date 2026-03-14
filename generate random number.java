public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of values:");
		int a=sc.nextInt();
		Random random=new Random();
		for(int i=0;i<a;i++){
		    System.out.println(random.nextInt(100));
		}
// 		System.out.println();
	}
}