class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        //boundaries set kar raha hu
        int sideX = Math.min(xCenter,x2); 
        int ClosestX = Math.max(x1,sideX);
        
        int sideY = Math.min(yCenter,y2); 
        int ClosestY = Math.max(y1,sideY);

        double SqDistance = Math.pow((yCenter-ClosestY),2) + Math.pow((xCenter-ClosestX),2);
        double distance = Math.sqrt(SqDistance);
        if(radius>=distance) return true;
        else return false;
        
    }
}