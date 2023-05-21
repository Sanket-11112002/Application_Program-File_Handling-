import java.io.*;

class WriteFile
{
    public static void main(String Arg[]) throws Exception
    {
        FileOutputStream fobj = new FileOutputStream("Infosystems.txt");
        String str = "India is my Country";

        byte Arr[] = str.getBytes();
        fobj.write(Arr);
        fobj.close();
    }
}