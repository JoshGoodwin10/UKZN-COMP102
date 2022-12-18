package Question1;

public class TestCone 
{
    private static Cone cArr[] = new Cone[10];

    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++)
        {
            int radius = (int) (Math.random() * 11);
            int height = (int) (Math.random() * 11);
            cArr[i] = new Cone(radius, height);
            //System.out.println(cArr[i].toString());   used when testing
        }

        System.out.println(getLargestVolume());
        System.out.println(getSmallestSurfaceArea());
    }

    public static String getLargestVolume()
    {
        double greatestVol = 0;
        double vol = 0;
        int pos = 0;    //position of element with greatest volume

        for (int j = 0; j < 10; j++)
        {
            greatestVol = cArr[pos].getVolume();
            vol = cArr[j].getVolume();

            if (vol > greatestVol)
            {
                greatestVol = vol;
                pos = j;
            }   
        }

        return cArr[pos].toString() + " has the greatest volume of " + cArr[pos].getVolume();
    }

    public static String getSmallestSurfaceArea()
    {
        double smallestSurfaceArea = 0;
        double sArea = 0;
        int pos = 0;    //position of element with smallest area

        for (int j = 0; j < 10; j++)
        {
            smallestSurfaceArea = cArr[pos].getVolume();
            sArea = cArr[j].getVolume();

            if (sArea < smallestSurfaceArea)
            {
                smallestSurfaceArea = sArea;
                pos = j;
            }   
        }

        return cArr[pos].toString() + " has the smallest surface area of " + cArr[pos].getSurfaceArea();
    }
}
