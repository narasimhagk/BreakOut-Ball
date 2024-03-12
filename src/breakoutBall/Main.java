package breakoutBall;
import javax.swing.JFrame;

public class Main{
    public static  void main(String[] args){
        JFrame frame=new JFrame();
        Gameplay gameplay=new Gameplay();

        frame.setBounds(200,100,700,600);
        frame.setTitle("BreakOut Ball");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(gameplay);
              frame.setVisible(true);
    }
}