package Hybrid;

class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

class LoggingPrinter {
    private Printer printer;

    public LoggingPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        System.out.println("LOG: " + message);
        printer.print(message);
    }
}

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        LoggingPrinter loggingPrinter = new LoggingPrinter(printer);

        loggingPrinter.print("Hello, World!");
    }
}