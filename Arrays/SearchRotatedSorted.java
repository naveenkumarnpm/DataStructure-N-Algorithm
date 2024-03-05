public class SearchRotatedSorted {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,3};

        int first=0;
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
