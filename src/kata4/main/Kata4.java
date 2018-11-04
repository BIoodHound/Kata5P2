package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
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
        fileName = "email.txt";
        mailList = new MailListReader().read(fileName);
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
