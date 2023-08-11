package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String file = "LegionFile.txt";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "August is here and with it comes school planning with the 2023-2024 school year right around the corner!\n" + "I cannot believe how quickly the summer is flying by.\n" + "I hope that everyone has been enjoying it!\n" +
                "Plans are already being started for the new school year! \n");
        fileManager.readFromFile(file);
        fileManager.deleteFile(file);
    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cannot write...");
            e.printStackTrace();
        }
    }

    public void readFromFile(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) { //if scanner can read next line
//                        String row = scanner.nextLine();//he reads and prints
//                System.out.println(row);
//            }
            //another way to do it
            for (int i = 0; scanner.hasNextLine(); i++) {
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}

