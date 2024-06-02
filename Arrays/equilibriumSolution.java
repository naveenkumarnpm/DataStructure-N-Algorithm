//https://www.geeksforgeeks.org/problems/equal-sum0810/1
class equilibriumSolution {
    String equilibrium(int arr[], int n) {
        // code here
        
        int leftSum=0;
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        
        for(int i=0;i<n;i++)
        {
            sum=sum-arr[i];
            if(sum==leftSum)
            {
                return "YES";
            }
            leftSum=leftSum+arr[i];
        }
        
        return "NO";
        
    }
}

