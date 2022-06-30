
import javax.swing.JFrame;


public class Janelas {
    public static void main(String[] args){
        
        JFrame f1 = new JFrame();
        JFrame f2 = new JFrame();
        
        f1.setVisible(true);
        f1.setSize(500,300);
        f1.setLocation(100,200);
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        f2.setSize(200,300);
        f2.setLocation(200,300);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);
        
    }
    
}
