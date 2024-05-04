package exercise_adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private EnlishAdapter adapter;

    public TranslatorAdapter(EnlishAdapter adapter) {
        this.adapter = adapter;
    }

    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        adapter.receive(vietnameseWords);
    }

    private String translate(String words) {
        System.out.println("Transalated!");
        return "Hello you";
    }

}
