package com.example.demo.Singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void shouldPrinterCreateOnlyOneInstance(){
        var printer1 = Printer.getInstance();
        var printer2 = Printer.getInstance();

        assertThat(printer1, equalTo(printer2));
    }
    @Test
    void shouldPrinterPrintsSamePages(){
        var printer1 = Printer.getInstance();
        var printer2 = Printer.getInstance();

        printer1.print("texto1");
        printer2.print("texto2");

        assertThat(printer1.countPrintPages(), equalTo(2));
    }

}