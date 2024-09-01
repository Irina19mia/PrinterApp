package app;

public class MessagePrinter implements Printer {

    @Override
    public void print(Message message) {
        if (isEmpty(message.getSender()) && isEmpty(message.getText())) {
            Printer printer = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            printer.print(message);

        } else if (isEmpty(message.getSender())) {
            System.out.printf("Анонімній користувач відправив повідомленні: %s\n", message.getText());

        } else {
            System.out.printf("Користувач %s відправив повідомлення: %s", message.getSender(), message.getText());
        }
    }

    private static boolean isEmpty(String str) {
        return str == null ||str.isBlank();
    }

    static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}
