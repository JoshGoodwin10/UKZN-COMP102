public class test 
{
    public static void main(String[] args) 
    {
        String line = "Dempster, Mr Rob  	5607  	dempster@cs.ukzn.ac.za  	Seminars + Quality Rep";
        String[] sArr = line.split(" ", 0);

        for (int i = 0; i < sArr.length; i++)
        {
            //System.out.println(sArr[i]);

            if (sArr[i].contains("@"))
            {
                if (sArr[i].substring(i, sArr[i].length()).contains("."))
                {
                    System.out.println(sArr[i]);

                    for (int a = 0; a < sArr[i].length(); a++)
                    {
                        
                        sArr[i].replace("\t", "");
                        

                        //int asciiV = sArr[i].charAt(a);
                        //System.out.println((int) sArr[i].charAt(a));

                        //System.out.println(sArr[i].charAt(a));
                    }
                    System.out.println(sArr[i]);
                }
            }
        }
    }
}
