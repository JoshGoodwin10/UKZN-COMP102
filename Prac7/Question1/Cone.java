package Question1;

class Cone 
{
   private double radius = 0;
   private double height = 0;
    
   public Cone(double r, double h) 
   {
      if (h > 0)
         height = h;

      else if (h <= 0)  
         height = 1;

      if (r > 0)
         radius = r;

      else if (r <= 0)
         radius = 1;      
   }
    
   public double getRadius() 
   {
      return radius;
   }
    
   public void setRadius(double r) 
   {
      if(r > 0) 
         radius = r;
      
      else 
         System.out.println("Invalid input for radius");
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
         System.out.println("Invalid input for height");
   }
    
   public double getVolume() 
   {
      return getBaseArea() * (height / 3);
   }

   public double getSurfaceArea()
   {
      return (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)))); 
   }

   public double getBaseArea()
   {
      return (Math.pow(radius, 2) * Math.PI);
   }
    
   public String toString() 
   {
      return "Radius: " + radius + " \tHeight: " + height;
   } 
    
}
