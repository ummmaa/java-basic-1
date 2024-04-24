import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFile = "path/to/your/csv/jusho.csv"; // ファイルのパス
        String line = "";
        String split = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // 1行をカンマで分割
                String[] words = line.split(split);

                // 単語を一つずつ出力
                for (String word : words) {
                    System.out.println(word);
                }
            } // while end
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
