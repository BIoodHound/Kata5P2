package kata5P2.main;

import java.io.IOException;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;
import kata5P2.view.MailListReaderBD;

public class Kata5P2 {
    static String fileName;
    static List<Mail> mailList;
    static Histogram<String> histogram;
    static HistogramDisplay histoDisplay;
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
        execute();
    }
    
    public static void input() throws IOException{
        mailList = new MailListReaderBD().read();
    }
    public static void process(){
        histogram = new MailHistogramBuilder().build(mailList);
    }
    public static void output(){
        histoDisplay = new HistogramDisplay(histogram);
    }
    public static void execute(){
        histoDisplay.execute();
    }
    
}
