/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

import Controller.Controller;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lucas Tobal
 */
public abstract class Person  {

    private int life;
    private int max_life;
    private int pos_x;
    private int pos_y;
    private int attack;
    private int defend;
    private int heal;
    private int team;
    private boolean attacking;
    private boolean defending;
    private boolean healing;
    private boolean turn;
    private Controller controller;

    /**
     *
     * @param life - life points
     * @param pos_x - position in x-axis
     * @param pos_y - position in y-axis
     * @param attack - attacking points
     * @param defend - defending points
     * @param heal - healing points
     */
    public Person(int team,boolean turn, int life, int pos_x, int pos_y, int attack, int defend, int heal) {
        this.max_life = life;
        this.life = life;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.attack = attack;
        this.defend = defend;
        this.heal = heal;
        attacking = false;
        defending = false;
        healing = false;
        this.team = team;
        this.turn = turn;
        controller = new Controller(this);
    }

    public void setSkills(int life, int pos_x, int pos_y, int attack, int defend, int heal) {
        this.life = life;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.attack = attack;
        this.defend = defend;
        this.heal = heal;
    }

    /**
     *
     * @param p
     */
    public abstract void Attack(Person p);

    public abstract void Draw(Graphics g);

    public abstract void Move(int pos_x, int pos_y);

    public int getTeam() {
        return team;
    }

    public boolean isMyTurn() {
        return turn;
    }
    
    public void setMyTurn(boolean s){
        this.turn = s;
    }

    public int getMax_life() {
        return max_life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public boolean isAttacking() {
        return attacking;
    }

    public void setAttacking(boolean attacking) {
        this.attacking = attacking;
    }

    public boolean isDefending() {
        return defending;
    }

    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    public boolean isHealing() {
        return healing;
    }

    public void setHealing(boolean healing) {
        this.healing = healing;
    }

    public Controller getController() {
        return this.controller;
    }

    public void Defend() {
        this.setDefending(true);
    }

    public void Heal() {
        if (this.getLife() + this.getHeal() > this.getMax_life()) {
            this.setLife(this.getMax_life());
        } else {
            this.setLife(this.getLife() + this.getHeal());
        }
    }
}
