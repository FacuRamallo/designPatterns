package com.example.demo.Singleton;

public class Printer {
    //estatic hace que exista
    private static Printer instancePrinter;
    private int pagesprintedCount = 0;

    private Printer() {
    }

    public static Printer getInstance() {
        //si no existe
        if (instancePrinter == null) {
            instancePrinter = new Printer();
        }
        return instancePrinter;
    }

    public int countPrintPages() {
        return pagesprintedCount;
    }

    public void print(String texto) {
        pagesprintedCount++;
    }
}
