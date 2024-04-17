public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;
        if(n==0)
        {
            return 0;
        }
        int i=0;
        int j=height.length-1;
        int width=0;
        int min=0;
        int water=0;
        int max=0;

        while(i<j)
        {
            if(height[i]<height[j])
            {
                width=j-i;
                min=Integer.min(height[i], height[j]);
                water=min*width;
                if(water>max)
                {
                    max=water;
                }
                i++;
            }
            if(height[i]>height[j])
            {
                width=j-i;
                min=Integer.min(height[i], height[j]);
                water=min*width;
                if(water>max)
                {
                    max=water;
                }
                j--;
            }
            if(height[i]==height[j])
            {
                i++;
            }
        }
        
        return max;
    }
    
    public static void main(String args[])
    {
        ContainerWithMostWater c=new ContainerWithMostWater();
        int n[]={1,8,6,2,5,4,8,3,7};
        
        System.out.println(c.maxArea(n));
    }
}
