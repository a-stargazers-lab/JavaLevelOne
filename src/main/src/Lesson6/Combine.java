package Lesson6;

import java.io.*;
import java.util.Scanner;

/**
 * Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
 * Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
 * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 * ** Написать метод, проверяющий, есть ли указанное слово в папке
 */
public class Combine {

    private static FileInputStream in;
    private static FileOutputStream out;

    public static void createFiles() {
        try {
            FileOutputStream fileOne = new FileOutputStream("fileOne.txt");
            PrintStream printStream = new PrintStream(fileOne);
            String out = ("Hello World, I am learning programming with Geekbrains. " +
                    "It makes very much fun!");
            printStream.println(out);

            FileOutputStream fileTwo = new FileOutputStream("fileTwo.txt");
            PrintStream printStream2 = new PrintStream(fileTwo);
            String out2 = ("We are learning a lot of interesting stuff. " +
                    "I hope that I'm going to be a great programmer :)");
            printStream2.println(out2);

            FileOutputStream fileThree = new FileOutputStream("fileThree.txt");
            PrintStream printStream3 = new PrintStream(fileThree);
            printStream3.println(out + out2);

        } catch (FileNotFoundException exception) {
            System.out.println("ERROR!!: " + exception.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void combineTwoFiles(String fileName, String fileNameTwo) {
        try {
            out = new FileOutputStream("newFile.txt");
            int n;

            in = new FileInputStream(fileName);
            while ((n = in.read()) != -1) {
                out.write(n);
            }
            in.close();

            in = new FileInputStream(fileNameTwo);
            while ((n = in.read()) != -1) {
                out.write(n);
            }
            in.close();

            out.close();
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findString(String file, String word) throws IOException {
        word.toLowerCase();
        word.toUpperCase();
        boolean match = false;
        int count = 0;
        //in = new FileInputStream(file);

        //while(sc.hasNext()){
        Scanner sc = new Scanner(new FileInputStream(file));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (line.indexOf(word) != -1) {
                match = true;
                count = count + 1;
            }
        }

        if (match) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static void main(String[] args) throws IOException {
        createFiles();
        combineTwoFiles("fileOne.txt", "fileTwo.txt");
        findString("fileOne.txt", "Hello");
        findString("fileOne.txt", "learning");
        findString("fileOne.txt", "hola");
    }
}
