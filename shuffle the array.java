import java.util.Arrays;

class solution{
    public static int[] shuffle(int[] nums, int n){
        int[] r=new int[2*n];
        for(int i=0;i<n;i++){
            r[2*i]=nums[i];
            r[2*i+1]=nums[n+i];

        }
        return r;
    }


    public static void main(String[] args){
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] sol=shuffle(nums,n);
        System.out.println(Arrays.toString(sol));
    }
}