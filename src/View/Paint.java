/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Characters.Person;
import Characters.Team;
import Controller.Controller;
import Controller.Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.*;
import java.util.Iterator;
import javax.swing.JPanel;

public class Paint extends JPanel implements Serializable {

    /**
     * Construtor que inicializa os desenhos
     *
     * @param g Variável da Graphics
     */
    Game game;
    Iterator<Person> i;

    public Paint(Game game) {
        this.game = game;
    }

    @Override //sobrescrita do metodo paintComponent da classe JPanel
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMap(g);
        drawPerson(g);
    }

    private void drawMap(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        /*64 é o numero de quadrantes de um tabuleiro de xadrez*/
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ((j + i) % 2 == 0) {
                    g2d.setColor(Color.GRAY);
                } else {
                    g2d.setColor(Color.GRAY);
                }
                g2d.fillRect(j * 40, i * 40, 40, 40);
            }
        }
    }

    /*
     * Imprime as pecas no tabuleiro
     * @param g
     */
    private void drawPerson(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Person aux;
        i = this.game.getPerson().iterator();
        while(i.hasNext()){
            aux = i.next();
            aux.Draw(g);
        }
    }
}


