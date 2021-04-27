import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    private static final List<String> ARRAY_LIST = new ArrayList<>();

    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("File không tồn tại!");
            } else {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line = bufferedReader.readLine();

                ARRAY_LIST.add(line);
                System.out.println(line);
                bufferedReader.close();
                inputStreamReader.close();
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                System.out.println("File đã tồn tại!");
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                for (String line : ARRAY_LIST) {
                    bufferedWriter.write(line);
                }
                bufferedWriter.close();
                outputStreamWriter.close();
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
