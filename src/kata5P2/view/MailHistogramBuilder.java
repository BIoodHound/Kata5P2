package kata5P2.view;

import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;

public class MailHistogramBuilder {
    public Histogram<String> build(List<Mail> o){
        Histogram<String> histogram = new Histogram();
        for (Mail mail : o) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    } 
}
