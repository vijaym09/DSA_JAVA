class TwoTablePrint{
    static void PrintTWoTable(){
        for(int i=1;i<=10;i++){
            int ans=2*i;
            System.out.println("ans-> "+ans);
        }
    }
    static void parameters(int x, int y){
        int sum=x+y;
        System.out.println("sum= "+sum);
    }
    public static void main(String[] args) {
        PrintTWoTable();
        parameters(5,10);
        
    }
}