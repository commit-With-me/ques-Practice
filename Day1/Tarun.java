public class Tarun{
    public static void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public static void print(int[] A,int n){ 
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
    }
    public static void rearrange(int[] A,int n){
     int[] B=new int[A.length];
     for(int i=0;i<A.length;i++){
        B[i]=-1;      
     }
     for(int i=0;i<A.length;i++){
       for(int j=0;j<n;j++){
        if(A[j]==i){
            B[i]=i;
         }
       }
     }
     for(int i=0;i<n;i++){
        A[i]=B[i];
     }
    }
    public static void main(String[] args) {
        int[] arr={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n=arr.length;
        rearrange(arr, n);
        print(arr, n);
    }
}