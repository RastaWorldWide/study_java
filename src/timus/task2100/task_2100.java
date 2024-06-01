package timus.task2100;

import java.io.*;

public class task_2100 {
    public static void main(String[] args){
        String inputFileName = "src/timus/task2100/input";
        boolean oj = System.getProperty("ONLINE)JUDGE") != null;
        int marshalAndLilly = 2;


        try {

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName));

            String readLine = "";

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null){
                if(numberOfFriends == 0){
                    numberOfFriends = Integer.parseInt(readLine);
                }
                if(readLine.contains("+")){
                    numberOfPairs++;
                }
            }

            int result;

            int quests = (marshalAndLilly + numberOfFriends + numberOfPairs);

            if (quests == 13){
                result = (quests * 100) + 100;
            } else {
                result = quests * 100;
            }

            System.out.println(result);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
