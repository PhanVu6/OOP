package exercise_adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new EnlishAdapter());
        client.send("Xin chào bạn");
    }
}
