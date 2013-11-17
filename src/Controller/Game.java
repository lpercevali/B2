/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Characters.NormalChar;
import Characters.Person;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Lucas Tobal
 */
public class Game{

    
    private ArrayList<Person> person;
    private Iterator<Person> i;
    Person aux;
    private int turn;
    private int team_size;
    private int qttperson;
    Random randomGen = new Random();

    public Game(int team_size, int max_life, int max_attack, int max_defend, int max_heal) {
        this.team_size = team_size;
        this.qttperson = team_size*2;
        this.turn = 0;
        person = new ArrayList<Person>();
        
            for (int i = 0; i < this.team_size; i++) {
                person.add(new NormalChar(0,true,randomGen.nextInt(max_life) + 50, randomGen.nextInt(800), randomGen.nextInt(800),
                        randomGen.nextInt(max_attack), randomGen.nextInt(max_defend), randomGen.nextInt(max_heal)));
            }
            for (int i = 0; i < this.team_size; i++) {
                person.add(new NormalChar(1,false,randomGen.nextInt(max_life) + 50, randomGen.nextInt(800), randomGen.nextInt(800),
                        randomGen.nextInt(max_attack), randomGen.nextInt(max_defend), randomGen.nextInt(max_heal)));
            }
            
        
        i = person.iterator();
    }
    
    
    public Person getPerson(int i){
        return person.get(i);
    }
    
    public ArrayList getPerson(){
        return person;
    }
    
    
    public Iterator verifyDead(Person p){
        Person aux;
        i = this.person.iterator();
        while (i.hasNext()){
            aux = i.next();
            if(aux.getLife()<0){
                this.person.remove(aux);
            }
        }
        i = this.person.iterator();
        aux = i.next();
        while(p != aux){
           aux = i.next();
        }
        return i;
        /*
        int qttaux=0;
        for(int i = 0; i<this.qttperson;i++){
            if(this.person.get(i).getLife()<0){
                person.remove(i);
                qttaux++;
            }
        }
        this.qttperson = this.qttperson-qttaux;*/
    }
    
    public void changeTurn(){
        i = person.iterator();
        while(i.hasNext()){
            aux = i.next();
            if(aux.isMyTurn()){
                aux.setMyTurn(false);
            }
            else{
                aux.setMyTurn(true);
            }
        }
    }
    
    public boolean isFinished(){
        i = person.iterator();
        int team1=0,team2=0;
        while(i.hasNext()){
            aux = i.next();
            if(aux.getLife() > 0 && aux.getTeam() == 0){
                team1++;
            }
            if(aux.getLife() > 0 && aux.getTeam() == 1){
                team2++;
            }
            
        }
        if(team1 == 0 || team2== 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}
