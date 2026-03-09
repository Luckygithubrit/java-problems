class Solution {
    public static void main(String[] args)   {
        // code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int c=arr.length;
        System.out.println(c);
    }
}
