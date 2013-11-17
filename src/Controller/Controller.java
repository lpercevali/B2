/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Characters.Person;
import Characters.Team;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lucas Tobal
 */
public class Controller {

    public Person p;

    public Controller(Person p) {
        this.p = p;
    }

    public void Attack(Person d) {
        this.p.Attack(d);
    }

    public void Defend() {
        this.p.setDefending(true);
    }

    public void Heal() {
        this.p.Heal();
    }

    public void Move(int x, int y) {
        this.p.Move(x, y);
    }

    // PEGAR SELECT CHAR
    public Person selectChar(ArrayList<Person> p) {
        Person aux = null;
        Iterator<Person> i = p.iterator();
        while (i.hasNext()) {
            aux = i.next();
            if (!aux.isMyTurn()) {
                int a = aux.getPos_x();
                int b = aux.getPos_y();
                if (Math.sqrt(Math.pow((this.p.getPos_x() - a), 2) + Math.pow((this.p.getPos_y() - b), 2)) <= 50) {
                    return aux;
                }
            }
        }
        return null;
    }
}
