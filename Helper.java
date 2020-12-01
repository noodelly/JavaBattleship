import java.lang.Math;
import javax.swing.JOptionPane;

public class Helper
{

    public void showMsg(String msg)
    {
        JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
    }
    public String generateTileID(int iteration)
    {

        String letter = "";
        String number = "";
        
        double x = Math.floor((iteration / 10));
        double num = iteration - (x * 10);
        if(x == 0){ letter = "A"; }
        if(x == 1){ letter = "B"; }
        if(x == 2){ letter = "C"; }
        if(x == 3){ letter = "D"; }
        if(x == 4){ letter = "E"; }
        if(x == 5){ letter = "F"; }
        if(x == 6){ letter = "G"; }
        if(x == 7){ letter = "H"; }
        if(x == 8){ letter = "I"; }
        if(x == 9){ letter = "J"; }

        if(num == 0) {number = "1"; }
        if(num == 1) {number = "2"; }
        if(num == 2) {number = "3"; }
        if(num == 3) {number = "4"; }
        if(num == 4) {number = "5"; }
        if(num == 5) {number = "6"; }
        if(num == 6) {number = "7"; }
        if(num == 7) {number = "8"; }
        if(num == 8) {number = "9"; }
        if(num == 9) {number = "10"; }
        
        return letter + number;
    }
}