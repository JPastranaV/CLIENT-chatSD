package my_swing;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.Friend;

public class Friend_Box extends javax.swing.JPanel implements Friend {

    private ImageIcon icon;
    private int ID;
    private String fName;
    private String time;

    @Override
    public void set(ImageIcon image, int ID, String name, String time) {
        if (image != null) {
            Image img;
            if (image.getIconWidth() > image.getIconHeight()) {
                img = image.getImage().getScaledInstance(60, -1, Image.SCALE_SMOOTH);
            } else {
                img = image.getImage().getScaledInstance(-1, 60, Image.SCALE_SMOOTH);
            }
            icon = new ImageIcon(img);
            //profile.setIcon(icon);
        }
        lbName.setText(name);
        lbTime.setText(time);
        this.ID = ID;
        this.fName = name;
        this.time = time;
    }

    public void itMe() {
        lbName.setForeground(new Color(0, 0, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        line = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(210, 61));

        line.setBackground(new java.awt.Color(216, 215, 215));
        line.setOpaque(true);

        lbTime.setForeground(new java.awt.Color(102, 102, 102));
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTime.setText("12:00 PM");

        lbName.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 13)); // NOI18N
        lbName.setForeground(new java.awt.Color(51, 51, 51));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Friend Name");
        lbName.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime))
                .addGap(26, 26, 26)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public ImageIcon getImage() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Friend_Box() {
        initComponents();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel line;
    // End of variables declaration//GEN-END:variables
}
