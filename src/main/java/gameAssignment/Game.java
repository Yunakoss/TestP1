package gameAssignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

        public enum GameType {
            SOCCER,
            HOCKEY,
            RUGBY
        }

        public static void writeNumOfPlayersPerTeam(GameType game) {

            //System.out.println(GameType.HOCKEY);
            switch (game) {
                case SOCCER:
                    createFile("soccer.txt");
                    writeToFile("soccer.txt", "11");
                    break;
                case HOCKEY:
                    createFile("hockey.txt");
                    writeToFile("hockey.txt", "6");
                    break;
                case RUGBY:
                    createFile("rugby.txt");
                    writeToFile("rugby.txt", "15");
            }
        }
        public static void createFile(String fileName) {
            File file = new File(fileName);
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void writeToFile(String fileName, String text) {
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(text);
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error. cannot write...");
                e.printStackTrace();
            }
        }
    }