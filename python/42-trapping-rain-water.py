def trap(self, height: list[int]) -> int:
        tot=sum(height)
        left,right=0,0
        for i in range(1,len(height)-1):
            left,right=max(left,height[i-1]),max(height[i+1:])
            if height[i]<left and height[i]<right:
                height[i]=min(left,right)
        return sum(height)-tot