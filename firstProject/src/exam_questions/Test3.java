package exam_questions;

public class Test3 {
	public static void main(String[] args) {
		int[] a={2,3,-2,4};
        int max=a[0], min=a[0], res=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(a[i], max*a[i]);
            min=Math.min(a[i], min*a[i]);
            res=Math.max(res, max);
        }
        System.out.println(res);
	}
}
