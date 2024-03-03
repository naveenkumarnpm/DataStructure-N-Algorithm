public class SearchRotatedSorted {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};
        int find=2;

        int first=arr[0];
        int last=arr.length-1;

        int mid=0;

        while(first<last)
        {
            mid=first+((last-first)/2);
            if(arr[mid]>arr[last])
            {
                first=mid+1;
            }else
            {
                last=mid;
            }
        }
        System.out.println(arr[first]);
    }
}
