import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        while(br.ready()) {
            String line = br.readLine();
            if(line != null) {
                line = line.trim();

                if(!line.isEmpty()) {
                    frequencyMap.put(line, frequencyMap.getOrDefault(line, 0) + 1);
                }
            }
        }
        br.close();

        for (Map.Entry<String, Integer> entry: frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}