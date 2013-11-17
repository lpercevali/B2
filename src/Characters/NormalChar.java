/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lucas Tobal
 */
public class NormalChar extends Person {

    public NormalChar(int team, boolean turn, int life, int pos_x, int pos_y, int attack, int defend, int heal) {

        super(team, turn, life, pos_x, pos_y, attack, defend, heal);
    }

    @Override
    public void Attack(Person p) {
        if (Math.sqrt(Math.pow(this.getPos_x() - p.getPos_x(), 2) + Math.pow(this.getPos_y() - p.getPos_y(), 2)) < 50) {
            if ((p.isDefending()) && (this.getAttack() - p.getDefend() > 0)) {
                p.setLife(p.getLife() - (this.getAttack() - p.getDefend()));
            } else {
                p.setLife(p.getLife() - this.getAttack());
            }

        }
    }

    @Override
    public void Move(int pos_x, int pos_y) {

        double x = (pos_x - this.getPos_x());
        double y = (pos_y - this.getPos_y());
        double norm = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (norm > 50) {
            this.setPos_x(this.getPos_x() + (int) ((x / norm) * 50));
            this.setPos_y(this.getPos_y() + (int) ((y / norm) * 50));
        } else {
            this.setPos_x((int) (this.getPos_x() + x));
            this.setPos_y((int) (this.getPos_y() + y));
        }



    }

    @Override
    public void Draw(Graphics g) {
        if (this.getLife() > 0) {
            String path = System.getProperty("user.dir");

            Graphics2D g2d = (Graphics2D) g;
            BufferedImage img = null;
            path = path + "\\img\\StarWars\\godd.png";
            try {
                img = ImageIO.read(new File(path));
                if (isMyTurn()) {
                    g2d.setColor(Color.red);
                } else {
                    g2d.setColor(Color.yellow);
                }
                g2d.drawOval(this.getPos_x() - 50, this.getPos_y() - 50, 100, 100);
                g2d.drawImage(img, null, this.getPos_x() - 25, this.getPos_y() - 25);
            } catch (IOException ex) {
            }

        }
    }
}