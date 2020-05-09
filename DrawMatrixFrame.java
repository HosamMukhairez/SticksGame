package drawing.drawingsticksgame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Hosam
 */
public class DrawMatrixFrame extends javax.swing.JFrame implements ActionListener {

    JButton[][] grid; //names the grid of buttons    
    int buttonsOrder = 0;
    GridLayout gridLayOut;
    int playerStickCounter = 0;
    int playerStickDirection = 0;
    int xCoordinate = 0;
    int yCoordinate = 0;
    boolean player1Turn = false;
    boolean player2Turn = false;
    boolean firstSelect = false;
    int lastButtonXPosition = 0;
    int lastButtonYPosition = 0;
    MatrixSize matrixSize;
    Players p1, p2;

    /**
     * Creates new form DrawMatrixFrame
     */
    public DrawMatrixFrame(MatrixSize matrixSize, Players p1, Players p2) {
        try {
            initComponents();
            this.matrixSize = matrixSize;
            this.p1 = p1;
            this.p2 = p2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void drawGame() {
        player1.setText(p1.getPlayerName());
        player2.setText(p2.getPlayerName());
        player1.setBackground(p1.getColor());
        player2.setBackground(p2.getColor());
        int w = matrixSize.getMatrixWidth();
        int h = matrixSize.getMatrixHeight();
        gridLayOut = new GridLayout(h, w);
        buttonsOrder = h * w;
        panelGrid.setLayout(gridLayOut); //set layout of frame
        panelGrid.removeAll();
        grid = new JButton[w][h]; //allocate the size of grid            
        for (int x = h - 1; x >= 0; x--) {// this for loops to draw button dynimaclly according to the matrix entered by the user
            for (int y = 0; y < w; y++) {
                buttonsOrder--;
                JButton tempButton = new JButton("");
                tempButton.setBackground(new Color(240, 240, 240));
                tempButton.addActionListener(this);
                grid[y][x] = tempButton;
                panelGrid.add(grid[y][x]); //adds button to grid
            }
        }//*/
    }

    public void actionPerformed(ActionEvent e) {// this action is applied all over the created buttons when the user clicks on one of them
        JButton obj = (JButton) e.getSource();
        int x = obj.getX();
        int y = obj.getY();
        int buttonWidth = obj.getWidth();
        int buttonHight = obj.getHeight();
        Color buttonColor = obj.getBackground();
        if (buttonColor == player1.getBackground() || buttonColor == player2.getBackground()) {
            JOptionPane.showMessageDialog(this, "This button is being selected befor!!", "WRONING", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (playerStickCounter == 0) {
            JOptionPane.showMessageDialog(this, "You finished your trun.", "WRONING", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (playerStickDirection == 1 && !firstSelect) {
            if (x == xCoordinate || y != yCoordinate || Math.abs(x - lastButtonXPosition) > buttonWidth) {
                JOptionPane.showMessageDialog(this, "You have to go in the horizontal direction and continuously", "WRONING", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (playerStickDirection == 2 && !firstSelect) {
            if (y == yCoordinate || x != xCoordinate || Math.abs(y - lastButtonYPosition) > buttonHight) {
                JOptionPane.showMessageDialog(this, "You have to go in vertical direction and continuously", "WRONING", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        if (firstSelect) {
            xCoordinate = obj.getX();
            yCoordinate = obj.getY();
            lastButtonXPosition = xCoordinate;
            lastButtonYPosition = yCoordinate;
            firstSelect = false;
        }
        if (player1Turn) {
            obj.setBackground(player1.getBackground());
        } else {
            obj.setBackground(player2.getBackground());
        }
        playerStickCounter--;
        if (playerStickCounter == 0) {
            JOptionPane.showMessageDialog(this, "You finished your trun.", "WRONING", JOptionPane.ERROR_MESSAGE);
            if (player1Turn) {
                p1.setScore(Integer.valueOf(stickCounterList.getSelectedItem().toString()));
                player2.setSelected(true);
            } else {
                p2.setScore(Integer.valueOf(stickCounterList.getSelectedItem().toString()));
                player1.setSelected(true);
            }
        }
        lastButtonXPosition = obj.getX();
        lastButtonYPosition = obj.getY();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        player2 = new javax.swing.JRadioButton();
        player1 = new javax.swing.JRadioButton();
        stickCounterList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        direction = new javax.swing.JComboBox<>();
        panelGrid = new javax.swing.JPanel();
        drawB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameSticks");
        setLocationByPlatform(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        buttonGroup1.add(player2);
        player2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        player2.setText("jRadioButton1");
        player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                player2MouseClicked(evt);
            }
        });
        jPanel1.add(player2);
        player2.setBounds(150, 10, 140, 30);

        buttonGroup1.add(player1);
        player1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        player1.setSelected(true);
        player1.setText("jRadioButton1");
        player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                player1MouseClicked(evt);
            }
        });
        jPanel1.add(player1);
        player1.setBounds(10, 10, 150, 30);

        stickCounterList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stickCounterList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel1.add(stickCounterList);
        stickCounterList.setBounds(390, 10, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Direction");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 10, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Stick Length");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 10, 90, 30);

        direction.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        direction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horizontal", "Vertical" }));
        jPanel1.add(direction);
        direction.setBounds(540, 10, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 50);

        panelGrid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGrid.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelGrid);
        panelGrid.setBounds(0, 79, 640, 470);

        drawB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drawB.setIcon(new javax.swing.ImageIcon("F:\\FreeLancing\\idem\\Projects\\IDEM_TORUK_MVN\\pics\\draw.png")); // NOI18N
        drawB.setText("Draw Stick");
        drawB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBActionPerformed(evt);
            }
        });
        getContentPane().add(drawB);
        drawB.setBounds(0, 50, 470, 25);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 50, 160, 25);

        setSize(new java.awt.Dimension(657, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void drawBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBActionPerformed
        // TODO add your handling code here:
        try {
            playerStickCounter = Integer.valueOf(stickCounterList.getSelectedItem().toString());
            playerStickDirection = direction.getSelectedItem().toString().equals("Horizontal") ? 1 : 2;
            xCoordinate = 0;
            yCoordinate = 0;
            firstSelect = true;
            if (player1.isSelected()) {
                player1Turn = true;
                player2Turn = false;
            } else {
                player1Turn = false;
                player2Turn = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_drawBActionPerformed

    private void player1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_player1MouseClicked
        // TODO add your handling code here:
        try {
            playerStickCounter = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_player1MouseClicked

    private void player2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_player2MouseClicked
        // TODO add your handling code here:
        try {
            playerStickCounter = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_player2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p1Name = p1.getPlayerName();
        String p2Name = p2.getPlayerName();
        int player1Score = p1.getScore();
        int player2Score = p2.getScore();
        String result = "Palyer #1:" + p1Name + " Score:" + player1Score + " \n"
                + "Palyer #2:" + p2Name + " Score:" + player2Score;
        JOptionPane.showMessageDialog(this, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> direction;
    private javax.swing.JButton drawB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGrid;
    private javax.swing.JRadioButton player1;
    private javax.swing.JRadioButton player2;
    private javax.swing.JComboBox<String> stickCounterList;
    // End of variables declaration//GEN-END:variables
}
