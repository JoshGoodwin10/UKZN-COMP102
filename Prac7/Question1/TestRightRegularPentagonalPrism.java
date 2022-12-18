package Question1;

public class TestRightRegularPentagonalPrism 
{
    private static RightRegularPentagonalPrism pArr[] = new RightRegularPentagonalPrism[10];
    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++)
        {
            double edgeLength = (int) (Math.random() * 11);
            double height = (int) (Math.random() * 11);
            pArr[i] = new RightRegularPentagonalPrism(height, edgeLength);
            //System.out.println(pArr[i].toString());   used when testing
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
            greatestVol = pArr[pos].getVolume();
            vol = pArr[j].getVolume();

            if (vol > greatestVol)
            {
                greatestVol = vol;
                pos = j;
            }   
        }

        return pArr[pos].toString() + " has the greatest volume of " + pArr[pos].getVolume();
    }

    public static String getSmallestSurfaceArea()
    {
        double smallestSurfaceArea = 0;
        double sArea = 0;
        int pos = 0;    //position of element with smallest area

        for (int j = 0; j < 10; j++)
        {
            smallestSurfaceArea = pArr[pos].getVolume();
            sArea = pArr[j].getVolume();

            if (sArea < smallestSurfaceArea)
            {
                smallestSurfaceArea = sArea;
                pos = j;
            }   
        }

        return pArr[pos].toString() + " has the smallest surface area of " + pArr[pos].getSurfaceArea();
    }
}
