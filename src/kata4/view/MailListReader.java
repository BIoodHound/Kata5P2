package kata4.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    public List<Mail> read(String fileName) throws IOException{
        List<Mail> res = new ArrayList();
        
        BufferedReader bread = new BufferedReader(new FileReader(fileName)); 
        String read = " ";
        
        while(true){
            read = bread.readLine();
            if(read == null){break;}
            if(read.contains("@")){
                res.add(new Mail(read));
            }
        }
        
        return res;
    }
}
