import java.util*
import javax.swing.JFrame
public class gamelauncher extends Jframe{
  public static void main (string args[]){
    system.out.println("Hello, Welcome to the Five in a Row!");
    gameLauncher gui = new gameLauncher();
    gui.setDefaultCloseOperation(JFram_EXIT_ON_CLOSE);
    gui.setSize(200,200);
    gui.setVisable(true);
    gui.setTitle("First Gui");
  }

}
