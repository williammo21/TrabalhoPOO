



import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Q14 {
    
    private static Object mes;
    public static void main(String[] args) 
throws ParseException {  
            String Mes; 
          
                System.out.println("Informe a data, Please:  ");
	       SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
              Scanner data = new Scanner(System.in);
              
              
              SimpleDateFormat formatoy = new SimpleDateFormat("/MMMM dd/ yyyy");
       
		String Date = formatoy.format(mes);
		System.out.println(Date);
    }
}
    