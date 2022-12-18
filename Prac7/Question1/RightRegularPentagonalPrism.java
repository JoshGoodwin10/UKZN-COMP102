package Question1;

public class RightRegularPentagonalPrism 
{
   double edgeLength;
   double height;

   public RightRegularPentagonalPrism(double h, double a)
   {
      if (h > 0)
         height = h;

      else if (h <= 0)
         height = 1;

      if (a > 0)
         edgeLength = a;
            
      else if (a <= 0)
         edgeLength = 1;   
   }

   public double getEdgeLength() 
   {
      return edgeLength;
   }
    
   public void setEdgeLength(double a) 
   {
      if(a > 0) 
         edgeLength = a;
      
      else 
         edgeLength = 1;
   }
    
   public double getHeight() 
   {
      return height;
   }
    
   public void setheight(double h) 
   {
      if(h > 0) 
         height = h;
       
      else 
         edgeLength = 1;
   }
    
   public double getVolume() 
   {
      return getBaseArea() * height;
   }

   public double getSurfaceArea()
   {
      return ((5 * edgeLength * height) + 0.5 * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))) * Math.pow(edgeLength, 2)); 
   }

   public double getBaseArea()
   {
      return (0.25 * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))) * Math.pow(edgeLength, 2));
   }
    
   public String toString() 
   {
      return "Edge Length: " + edgeLength + " \tHeight: " + height;
   }
}