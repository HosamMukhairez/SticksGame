package drawing.drawingsticksgame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author Hosam
 */
public class MatrixFrame extends javax.swing.JFrame {

    ImageIcon imageIcon = new ImageIcon("matrix.png");

    /**
     * Creates new form MatrixFrame
     */
    public MatrixFrame() {
        initComponents();
        exampleLabel.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
        exampleLabel.setIcon(imageIcon);
    }

    public static void main(String[] args) {
        MatrixFrame m = new MatrixFrame();
        m.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        widthF = new javax.swing.JTextField();
        heightF = new javax.swing.JTextField();
        drawMatrixB = new javax.swing.JButton();
        exampleLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        player2Name = new javax.swing.JTextField();
        player1Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        player2Color = new javax.swing.JButton();
        player1Color = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameSticks");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Player 2 Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 100, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Matrix Height");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 20);

        widthF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        widthF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(widthF);
        widthF.setBounds(110, 40, 140, 21);

        heightF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        heightF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(heightF);
        heightF.setBounds(110, 10, 140, 21);

        drawMatrixB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drawMatrixB.setIcon(new javax.swing.ImageIcon("F:\\FreeLancing\\idem\\Projects\\IDEM_TORUK_MVN\\pics\\draw.png")); // NOI18N
        drawMatrixB.setText("Draw Game");
        drawMatrixB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawMatrixBActionPerformed(evt);
            }
        });
        getContentPane().add(drawMatrixB);
        drawMatrixB.setBounds(110, 190, 140, 30);

        exampleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exampleLabel.setIcon(new javax.swing.ImageIcon("F:\\FreeLancing\\DrawingSticksGame\\matrix.png")); // NOI18N
        exampleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(exampleLabel);
        exampleLabel.setBounds(0, 250, 310, 350);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Matrix Width");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Player 1 Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 90, 20);

        player2Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        player2Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(player2Name);
        player2Name.setBounds(110, 100, 140, 21);

        player1Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        player1Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(player1Name);
        player1Name.setBounds(110, 70, 140, 21);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Player 1 Color");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Player 2 Color");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 160, 90, 20);

        player2Color.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        player2Color.setText("Select");
        player2Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ColorActionPerformed(evt);
            }
        });
        getContentPane().add(player2Color);
        player2Color.setBounds(110, 160, 140, 23);

        player1Color.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        player1Color.setText("Select");
        player1Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ColorActionPerformed(evt);
            }
        });
        getContentPane().add(player1Color);
        player1Color.setBounds(110, 130, 140, 23);

        setSize(new java.awt.Dimension(336, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void drawMatrixBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawMatrixBActionPerformed
        // TODO add your handling code here:
        try {
            MatrixSize m = new MatrixSize();
            m.setMatrixHeight(Integer.parseInt(heightF.getText()));
            m.setMatrixWidth(Integer.parseInt(widthF.getText()));
            m.setRemainder(0);

            Players p1 = new Players();
            p1.setColor(player1Color.getBackground());
            p1.setPlayerName(player1Name.getText());
            p1.setScore(0);

            Players p2 = new Players();
            p2.setColor(player2Color.getBackground());
            p2.setPlayerName(player2Name.getText());
            p2.setScore(0);

            DrawMatrixFrame dmf = new DrawMatrixFrame(m, p1, p2);
            dmf.drawGame();
            dmf.setVisible(true);
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_drawMatrixBActionPerformed

    private void player2ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ColorActionPerformed
        // TODO add your handling code here:
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
        player2Color.setBackground(newColor);
    }//GEN-LAST:event_player2ColorActionPerformed

    private void player1ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ColorActionPerformed
        // TODO add your handling code here:
        Color newColor = JColorChooser.showDialog(null, "Choose a color", Color.RED);
        player1Color.setBackground(newColor);
    }//GEN-LAST:event_player1ColorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drawMatrixB;
    private javax.swing.JLabel exampleLabel;
    private javax.swing.JTextField heightF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton player1Color;
    private javax.swing.JTextField player1Name;
    private javax.swing.JButton player2Color;
    private javax.swing.JTextField player2Name;
    private javax.swing.JTextField widthF;
    // End of variables declaration//GEN-END:variables
}
