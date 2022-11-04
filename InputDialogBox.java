import javax.swing.*;  
public class InputDialogBox {
    public static void main(String[] args) {
      String string = JOptionPane.showInputDialog("Hello");
      String string1 = JOptionPane.showInputDialog(null,"Hello","Dialog box",JOptionPane.QUESTION_MESSAGE);

    }
  }
  