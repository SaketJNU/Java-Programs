// Java program for try-with-resources having multiple resources

import java.io.*;

class readwrite {
    public static void main(String[] args)
    {
        try (FileOutputStream f
             = new FileOutputStream("outputfile.txt");
           BufferedReader br = new BufferedReader(
                 new FileReader("hello.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {
       		System.out.println(text);
		    byte arr[] = text.getBytes();
                f.write(arr);
          }

         System.out.println(
                "File content copied to another one.");
        }
    catch (Exception e) {
            System.out.println(e);
        }
       System.out.println(
            "Resource are closed and message has been written into the file.");
    }
}
