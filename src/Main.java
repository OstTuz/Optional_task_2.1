public class Main {

    public static void main(String[] args)
    {
        int minLength = 0;
        int maxLength = 0;
        int minPosition = 0;
        int maxPosition = 0;

        for (int i = 0; i < args.length; i++)
        {
            if (args[i].length() > maxLength)
            {
                maxLength = args[i].length();
                maxPosition = i;
            }
        }

        minLength = maxLength;

        for (int i = 0; i < args.length; i++)
        {
            if (args[i].length() < minLength)
            {
                minLength = args[i].length();
                minPosition = i;
            }
        }

        System.out.println("Element with maximal length: "+args[maxPosition]+" "+maxLength+"\nElement with minimal length: "+args[minPosition]+" "+minLength);

    }
}
