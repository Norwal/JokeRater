/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
import Models.Joke;
/**
 *
 * @author John King
 */
public class JokeBean {
    public Joke joke;
    
    public JokeBean(){
        
    }
    
    public void setRatings(int funniness, int punniness, int edginess){
        joke.setFunniness(funniness);
        joke.setPunniness(punniness);
        joke.setEdginess(edginess);
        int overallRating = Math.round(funniness+punniness+edginess)/3;
        joke.setOverallRating(overallRating);
    }
}
