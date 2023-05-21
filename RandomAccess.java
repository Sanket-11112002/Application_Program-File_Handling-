import java.io.*;

class RandomAccess
{
    public static void main(String Arg[]) throws Exception
    {
       RandomAccessFile fobj = new RandomAccessFile("Infosystems.txt","rw");

        fobj.writeUTF("abcdefghij");
        fobj.seek(0);
        System.out.println("Datafrom file :"+fobj.readUTF());

       fobj.seek(5);
       fobj.writeUTF("****");

        fobj.seek(0);
       System.out.println("Datafrom file :"+fobj.readUTF());

       
    }
}