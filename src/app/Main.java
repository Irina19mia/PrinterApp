package app;

public class Main {

    public static void main(String[] args) {
        Printer printer = new MessagePrinter();

        MessagePrinter.Message message = new MessagePrinter.Message("Hello, friend!", "Tom");
        printer.print(message);
    }
}
