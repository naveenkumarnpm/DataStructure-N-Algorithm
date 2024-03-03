public class secondLargest {
    public static void main(String[] args) {   //o(n) TC
        int arr[]={4,5,2,10,7,9,1};
        //int arr[]={7,5,6,1,4,2};
        int largest=0,secLargest=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>largest && secLargest <arr[i])
            {
                System.out.println(arr[i]);
                secLargest=largest;
                largest=arr[i];
            }else if(secLargest < arr[i])
            {
                secLargest=arr[i];
            }
        }

        System.out.println("second largest "+secLargest);
    }
}
