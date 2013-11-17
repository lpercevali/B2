/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Characters.Team;
import Controller.Controller;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint2  {

/*
    private Controller controller1;
    private Controller controller2;
    public int team_size;

    public Paint2() throws HeadlessException {
        this.setTitle("Teste");
        this.setSize(800, 800);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.gray);
        team_size = 4;
        System.out.println(team_size);
        controller1 = new Controller(team_size, true);
        controller2 = new Controller(team_size, false);
       /* for(int i = 0;i< team_size;i++){
            System.out.println(i + " team1 "+controller1.chars.getTeamMember(i).getPos_x() + " " + controller1.chars.getTeamMember(i).getPos_y());
            System.out.println(i + " team2 "+controller2.chars.getTeamMember(i).getPos_x() + " " + controller2.chars.getTeamMember(i).getPos_y());
        }*/
        
        
        
        //this.repaint();
    }/*

    public void paint(Graphics g) {
        
        drawMap(g);
        drawPerson1(g);
        drawPerson2(g);
    }
    
    private void drawMap(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        /*64 é o numero de quadrantes de um tabuleiro de xadrez*//*
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((j + i) % 2 == 0) {
                    g2d.setColor(Color.GRAY);
                } else {
                    g2d.setColor(Color.GRAY);
                }
                g2d.fillRect(j * 80, i * 80, 80, 80);
            }
        }
    }

    
    private void drawPerson1(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        System.out.println(team_size);
        for (int i = 0; i < team_size; i++) {
            /*controller1.chars.getTeamMember(i).Draw(g);
            controller2.chars.getTeamMember(i).Draw(g);*/

     /*   }*/
    /*}/*
    
    private void drawPerson2(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        System.out.println(team_size);
        for (int i = 0; i < team_size; i++) {
            System.out.println(controller2.isMyTurn());
         //   controller2.chars.getTeamMember(i).Draw(g);
            //controller2.chars.getTeamMember(i).Draw(g);

        }
    }
/*
    /**
     * Construtor que inicializa os desenhos
     *
     * @param g Variável da Graphics
     *//*
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1){
            int x = e.getX();//pega as coordenadas do mouse
            int y = e.getY();
            System.out.println("x:"+x+"  y:"+y);
      //      controller1.chars.getTeamMember(0).move(x, y);
        //    controller2.chars.getTeamMember(0).move(x, y);
                        this.repaint();
        }else if(e.getButton() == MouseEvent.BUTTON3){
            
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}


     /*   protected void paintComponent(Graphics g) {
        System.out.println("MERDA");
        super.paintComponent(g);
        //drawMap(g);
        drawPerson(g);
    }

    private void drawMap(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        /*64 é o numero de quadrantes de um tabuleiro de xadrez
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ((j + i) % 2 == 0) {
                    g2d.setColor(Color.GRAY);
                } else {
                    g2d.setColor(Color.DARK_GRAY);
                }
                g2d.fillRect(j * 40, i * 40, 40, 40);
            }
        }
    }

    /*
     * Imprime as pecas no tabuleiro
     * @param g
     
    private void drawPerson(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        System.out.println(Map.team_size);
        for (int i = 0; i < Map.team_size; i++) {
            Team.team.get(i).Draw(g);*//*

        }

  /*  }*/