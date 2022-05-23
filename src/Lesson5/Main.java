package Lesson5;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/FileCsv.txt");
        int numOfLines = 0;


        try (Stream<String> lines = Files.lines(file.toPath(), Charset.defaultCharset())) {
            numOfLines = (int) lines.count()-1;



        } catch (Exception e){

        }

        String count;
//        char[] buff;
        AppData appData = new AppData();
        appData.setColumns(numOfLines);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String headers = bufferedReader.readLine();
            appData.parseHeader(headers);
            while ((count = bufferedReader.readLine()) != null) {
                appData.parseRow(count);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        appData.save();


    }
}