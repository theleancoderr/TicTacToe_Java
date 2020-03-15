import  java.awt.*;
import java.awt.event.*;
import  javax.swing.*;
public class ZeroCross extends JFrame {
    String startgame = "X";
    int xcount = 0;
    int Ocount = 0;
    public ZeroCross() {
        initComponents();
        setSize(1500,800);
        
    }                         
    private void initComponents() {
        jPanel1 = new  JPanel();
        one = new  JButton();
        two = new  JButton();
        three = new  JButton();
        jTextField1 = new  JTextField();
        xScore = new  JTextField();
        four = new  JButton();
        five = new  JButton();
        six = new  JButton();
        jTextField2 = new  JTextField();
        oScore = new  JTextField();
        seven = new  JButton();
        eight = new  JButton();
        nine = new  JButton();
        resetButton = new  JButton();
        exitButton = new  JButton();
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC-TAC-TOE");
        jPanel1.setLayout(new  GridLayout(3, 5));
        one.setBackground(new  Color(153, 153, 255));
        one.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        one.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        one.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel1.add(one);
        two.setBackground(new  Color(153, 153, 255));
        two.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        two.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        two.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel1.add(two);
        three.setBackground(new  Color(153, 153, 255));
        three.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        three.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        three.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel1.add(three);
        jTextField1.setBackground(new  Color(51, 255, 51));
        jTextField1.setFont(new  Font("Times New Roman", 1, 48)); // NOI18N
        jTextField1.setHorizontalAlignment( JTextField.CENTER);
        jTextField1.setText("Player X:");
        jTextField1.setCursor(new  Cursor( Cursor.DEFAULT_CURSOR));
        jPanel1.add(jTextField1);
        xScore.setBackground(new  Color(51, 255, 51));
        xScore.setFont(new  Font("Times New Roman", 1, 80)); // NOI18N
        xScore.setHorizontalAlignment( JTextField.CENTER);
        xScore.setCursor(new  Cursor( Cursor.DEFAULT_CURSOR));
        jPanel1.add(xScore);
        four.setBackground(new  Color(153, 153, 255));
        four.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        four.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        four.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel1.add(four);
        five.setBackground(new  Color(153, 153, 255));
        five.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        five.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        five.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel1.add(five);
        six.setBackground(new  Color(153, 153, 255));
        six.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        six.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        six.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel1.add(six);
        jTextField2.setBackground(new  Color(255, 0, 255));
        jTextField2.setFont(new  Font("Times New Roman", 1, 48)); // NOI18N
        jTextField2.setHorizontalAlignment( JTextField.CENTER);
        jTextField2.setText("Player O:");
        jTextField2.setCursor(new  Cursor( Cursor.DEFAULT_CURSOR));
        jPanel1.add(jTextField2);
        oScore.setBackground(new  Color(255, 0, 255));
        oScore.setFont(new  Font("Times New Roman", 1, 80)); // NOI18N
        oScore.setHorizontalAlignment( JTextField.CENTER);
        oScore.setCursor(new  Cursor( Cursor.DEFAULT_CURSOR));
        jPanel1.add(oScore);
        seven.setBackground(new  Color(153, 153, 255));
        seven.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        seven.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        seven.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel1.add(seven);
        eight.setBackground(new  Color(153, 153, 255));
        eight.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        eight.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        eight.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel1.add(eight);
        nine.setBackground(new  Color(153, 153, 255));
        nine.setFont(new  Font("Times New Roman", 1, 150)); // NOI18N
        nine.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        nine.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel1.add(nine);
        resetButton.setBackground(new  Color(102, 102, 102));
        resetButton.setFont(new  Font("Times New Roman", 1, 48)); // NOI18N
        resetButton.setText("RESET");
        resetButton.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        resetButton.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton);
        exitButton.setBackground(new  Color(255, 51, 51));
        exitButton.setFont(new  Font("Times New Roman", 1, 48)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setCursor(new  Cursor( Cursor.HAND_CURSOR));
        exitButton.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton);
        getContentPane().add(jPanel1,  BorderLayout.CENTER);
        pack();
    }                      
    private void exitButtonActionPerformed(  ActionEvent evt) {                                           
           if(JOptionPane.showConfirmDialog(this, "Do you want to exit? ","Confirmation",
              JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
              System.exit(0); 
           }
    }                                          
    private void resetButtonActionPerformed(  ActionEvent evt) {                                            
        xScore.setText("");
        oScore.setText("");
        clearText();
    }                                           
    private void oneActionPerformed(  ActionEvent evt) {                                    
        one.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
            one.setForeground(Color.GREEN);
        }else{
           one.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();
    }                                   
    private void twoActionPerformed(  ActionEvent evt) {                                           
        two.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
            two.setForeground(Color.GREEN);
        }else{
           two.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();   
    }                                   
    private void threeActionPerformed(  ActionEvent evt) {                                      
        three.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
            three.setForeground(Color.GREEN);
        }else{
           three.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();
    }                                     
    private void fourActionPerformed(  ActionEvent evt) {                                     
        four.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
            four.setForeground(Color.GREEN);
        }else{
           four.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame()        ;
    }                                    
    private void fiveActionPerformed(  ActionEvent evt) {                                     
        five.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
            five.setForeground(Color.GREEN);
        }else{
           five.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();
    }                                    
    private void sixActionPerformed(  ActionEvent evt) {                                    
        six.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
           six.setForeground(Color.GREEN);
        }else{
           six.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();
    }                                   
    private void sevenActionPerformed(  ActionEvent evt) {                                      
        seven.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
           seven.setForeground(Color.GREEN);
        }else{
           seven.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();
    }                                     
    private void eightActionPerformed(  ActionEvent evt) {                                      
        eight.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
            eight.setForeground(Color.GREEN);
        }else{
           eight.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();
    }                                     
    private void nineActionPerformed(  ActionEvent evt) {                                     
        nine.setText(startgame);  
        if(startgame.equalsIgnoreCase("X")){
            nine.setForeground(Color.GREEN);
        }else{
           nine.setForeground(Color.MAGENTA);
        }
        startGame();
        winningGame();
    }                                    
    public void startGame(){
        if(startgame.equalsIgnoreCase("X")){
            startgame = "O";
        }else{
          startgame = "X";
        }
    }
    public void winningGame(){
        String a1 = one.getText();
        String a2 = two.getText();
        String a3 = three.getText();
        String a4 = four.getText();
        String a5 = five.getText();
        String a6 = six.getText();
        String a7 = seven.getText();
        String a8 = eight.getText();
        String a9 = nine.getText();
        if(("X".equals(a1)&& "X".equals(a2) && "X".equals(a3))){
            one.setBackground(Color.GREEN);
            two.setBackground(Color.GREEN);
            three.setBackground(Color.GREEN);
            one.setForeground(Color.BLACK);
            two.setForeground(Color.BLACK);
            three.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++; 
            scoreCount();clearText();
        }
        else if(("X".equals(a4)&& "X".equals(a5) && "X".equals(a6))){
            four.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            six.setBackground(Color.GREEN);
            four.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            six.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scoreCount();clearText();
        }
        else if(("X".equals(a7)&& "X".equals(a8) && "X".equals(a9))){
            seven.setBackground(Color.GREEN);
            eight.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            seven.setForeground(Color.BLACK);
            eight.setForeground(Color.BLACK);
            nine.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scoreCount();clearText();
        }
        else if(("X".equals(a1)&& "X".equals(a5) && "X".equals(a9))){
            one.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            one.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            nine.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scoreCount();clearText();
        }
        else if(("X".equals(a2)&& "X".equals(a5) && "X".equals(a8))){
            two.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            eight.setBackground(Color.GREEN);
            eight.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            two.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scoreCount();clearText();
        }
        else if(("X".equals(a3)&& "X".equals(a5) && "X".equals(a7))){
            three.setBackground(Color.GREEN);
            five.setBackground(Color.GREEN);
            seven.setBackground(Color.GREEN);
            three.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            seven.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scoreCount();clearText();
        }
        else if(("X".equals(a1)&& "X".equals(a4) && "X".equals(a7))){
            four.setBackground(Color.GREEN);
            one.setBackground(Color.GREEN);
            seven.setBackground(Color.GREEN);
            one.setForeground(Color.BLACK);
            four.setForeground(Color.BLACK);
            seven.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scoreCount();clearText();
        }
        else if(("X".equals(a3)&& "X".equals(a6) && "X".equals(a9))){
            three.setBackground(Color.GREEN);
            nine.setBackground(Color.GREEN);
            six.setBackground(Color.GREEN);
            three.setForeground(Color.BLACK);
            six.setForeground(Color.BLACK);
            nine.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "X player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scoreCount();clearText();
        }
        
        else  if(("O".equals(a1)&& "O".equals(a2) && "O".equals(a3))){
            one.setBackground(Color.MAGENTA);
            two.setBackground(Color.MAGENTA);
            three.setBackground(Color.MAGENTA);
            one.setForeground(Color.BLACK);
            two.setForeground(Color.BLACK);
            three.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(("O".equals(a4)&& "O".equals(a5) && "O".equals(a6))){
            four.setBackground(Color.MAGENTA);
            five.setBackground(Color.MAGENTA);
            six.setBackground(Color.MAGENTA);
            four.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            six.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(("O".equals(a7)&& "O".equals(a8) && "O".equals(a9))){
            seven.setBackground(Color.MAGENTA);
            eight.setBackground(Color.MAGENTA);
            nine.setBackground(Color.MAGENTA);
            seven.setForeground(Color.BLACK);
            eight.setForeground(Color.BLACK);
            nine.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(("O".equals(a1)&& "O".equals(a5) && "O".equals(a9))){
            one.setBackground(Color.MAGENTA);
            five.setBackground(Color.MAGENTA);
            nine.setBackground(Color.MAGENTA);
            one.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            nine.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(("O".equals(a3)&& "O".equals(a5) && "O".equals(a7))){
            three.setBackground(Color.MAGENTA);
            five.setBackground(Color.MAGENTA);
            seven.setBackground(Color.MAGENTA);
            three.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            seven.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(("O".equals(a1)&& "O".equals(a4) && "O".equals(a7))){
            one.setBackground(Color.MAGENTA);
            four.setBackground(Color.MAGENTA);
            seven.setBackground(Color.MAGENTA);
            one.setForeground(Color.BLACK);
            four.setForeground(Color.BLACK);
            seven.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(("O".equals(a2)&& "O".equals(a5) && "O".equals(a8))){
            two.setBackground(Color.MAGENTA);
            five.setBackground(Color.MAGENTA);
            eight.setBackground(Color.MAGENTA);
            eight.setForeground(Color.BLACK);
            five.setForeground(Color.BLACK);
            two.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(("O".equals(a3)&& "O".equals(a6) && "O".equals(a9))){
            three.setBackground(Color.MAGENTA);
            six.setBackground(Color.MAGENTA);
            nine.setBackground(Color.MAGENTA);
            three.setForeground(Color.BLACK);
            six.setForeground(Color.BLACK);
            nine.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "O player Won","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            Ocount++;
            scoreCount();clearText();
        }
        else if(!("".equals(a1))&&!("".equals(a2))&&!("".equals(a3))&&!("".equals(a4))&&!("".equals(a5))&&!("".equals(a6))
            &&!("".equals(a7))&&!("".equals(a8))&&!("".equals(a9))){
            one.setBackground(Color.BLACK);one.setForeground(Color.RED);
            two.setBackground(Color.BLACK);two.setForeground(Color.RED);
            three.setBackground(Color.BLACK);three.setForeground(Color.RED);
            four.setBackground(Color.BLACK);four.setForeground(Color.RED);
            five.setBackground(Color.BLACK);five.setForeground(Color.RED);
            six.setBackground(Color.BLACK);six.setForeground(Color.RED);
            seven.setBackground(Color.BLACK);seven.setForeground(Color.RED);
            eight.setBackground(Color.BLACK);eight.setForeground(Color.RED);
            nine.setBackground(Color.BLACK);nine.setForeground(Color.RED);
            JOptionPane.showMessageDialog(this, "Match DRAW","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
            clearText();    
        }        
    }
    public void scoreCount(){
        xScore.setText(Integer.toString(xcount));
        oScore.setText(Integer.toString(Ocount));
    }
    public void clearText(){
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        nine.setText("");
        one.setBackground(new  Color(153, 153, 255));
        two.setBackground(new  Color(153, 153, 255));
        three.setBackground(new  Color(153, 153, 255));
        four.setBackground(new  Color(153, 153, 255));
        five.setBackground(new  Color(153, 153, 255));
        six.setBackground(new  Color(153, 153, 255));
        seven.setBackground(new  Color(153, 153, 255));
        eight.setBackground(new  Color(153, 153, 255));
        nine.setBackground(new  Color(153, 153, 255));
    }
    public static void main(String args[]) {
          EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZeroCross().setVisible(true);
            }
        });
    }              
    private  JButton eight;
    private  JButton exitButton;
    private  JButton five;
    private  JButton four;
    private  JPanel jPanel1;
    private  JTextField jTextField1;
    private  JTextField jTextField2;
    private  JButton nine;
    private  JTextField oScore;
    private  JButton one;
    private  JButton resetButton;
    private  JButton seven;
    private  JButton six;
    private  JButton three;
    private  JButton two;
    private  JTextField xScore;
                    
}