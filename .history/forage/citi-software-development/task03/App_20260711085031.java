import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;


public class App {

    // Class to store one market data record
    static class MarketData {
        private String price;
        private LocalDateTime timestamp;

        public MarketData(String price, LocalDateTime timestamp) {
            this.price = price;
            this.timestamp = timestamp;
        }

        public String getPrice() {
            return price;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        @Override
        public String toString() {
            return "price=" + price + ", timestamp=" + timestamp;
        }
    }

    private static final Queue<MarketData> queue = new LinkedList<>();

    public static void main(String[] args) {

        String apiKey = System.getenv("TWELVE_DATA_API_KEY");

        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("API key not found.");
            return;
        }

        while (true) {
            try {

                String urlString =
                        "https://api.twelvedata.com/price?symbol=DIA&apikey=" + apiKey;

                URL url = new URL(urlString);

                HttpURLConnection connection =
                        (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("GET");

                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(connection.getInputStream()));

                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                String json = response.toString();

                String price = extractPrice(json);

                if (price != null) {

                    MarketData data =
                            new MarketData(price, LocalDateTime.now());

                    queue.offer(data);

                    System.out.println("Added data point: " + data);
                    System.out.println("Current queue size: " + queue.size());
                    System.out.println("-------------------------------------");

                } else {

                    System.out.println("Unable to retrieve price.");
                    System.out.println(json);

                }

                Thread.sleep(15000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Simple JSON parser for:
    // {"price":"420.15"}

    private static String extractPrice(String json) {

        String key = "\"price\":\"";

        int start = json.indexOf(key);

        if (start == -1) {
            return null;
        }

        start += key.length();

        int end = json.indexOf("\"", start);

        if (end == -1) {
            return null;
        }

        return json.substring(start, end);
    }
}