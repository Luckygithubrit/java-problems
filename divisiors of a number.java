class Solution {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Write your code here
        int a=1;
        while(a<=n){
            if(n%a==0){
                System.out.print(a+" ");
                
            }
            a++;
            
        }
    }
}