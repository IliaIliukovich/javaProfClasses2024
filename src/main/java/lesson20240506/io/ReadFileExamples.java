package lesson20240506.io;

import java.io.*;

public class ReadFileExamples {

    public static void main(String[] args) {

        // try-catch-finally
//        BufferedReader bufferedReader = null;
////        try {
////            Reader reader = new FileReader("src/main/resources/somefile.txt");
////            bufferedReader = new BufferedReader(reader);
////
////            System.out.println(bufferedReader.readLine());
////
////        } catch (IOException ex) {
////            System.out.println("Problem with file: " + ex.getMessage());
////        } finally {
////            if (bufferedReader != null) {
////                try {
////                    bufferedReader.close();
////                } catch (IOException e) {
////                    System.out.println("Problem with closing file");
////                }
////            }
////        }

        // try-with-resources
        try (
            Reader reader2 = new FileReader("src/main/resources/somefile.txt");
            BufferedReader bufferedReader2 = new BufferedReader(reader2);
            ) {
            // read from file
            System.out.println(bufferedReader2.readLine());
        } catch (IOException e) {
            System.out.println("Problem with file: " + e.getMessage());
        }





    }




}
