import java.awt.*
import javax.swing.*
public class gamelauncher extends Jframe{
  private JLabel label;
  private JButton button;
  private JTextFeild textfeild;
  public static void main (string args[]){
    system.out.println("Hello, Welcome to the Five in a Row!");
    gameLauncher gui = new gameLauncher();
    gui.setDefaultCloseOperation(JFram_EXIT_ON_CLOSE);
    gui.setSize(200,200);
    gui.setVisable(true);
    gui.setTitle("First Gui");
  }

}
