import java.io.*;

class ReadFile
{
    public static void main(String Arg[]) throws Exception
    {
        FileInputStream fobj = new FileInputStream("Infosystems.txt");
        int i = 0;

        while((i = fobj.read()) != -1)
        {
            System.out.print((char)i);
        }
        fobj.close();
    }
}