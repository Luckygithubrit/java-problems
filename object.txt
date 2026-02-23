class Lucky {
    int i;
    int j;
    public Lucky(){
        i=20;
        j=34;
            
        }
    public Lucky(int i,int j){
        this.i=i;
        this.j=j;
        
    }
    public static void main(String[] args) {
        Lucky a=new Lucky();
        Lucky b=new Lucky();
        Lucky c=new Lucky();
        Lucky d=new Lucky();
        System.out.println(a==b);
        
        
        System.out.println(a.add());
    }
    public int add(){
        return i+j;
    }
}