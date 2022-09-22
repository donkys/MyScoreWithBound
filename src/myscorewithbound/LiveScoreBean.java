/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithbound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author prosf
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SCORE_PROPERTY = "scoreLine";
    
    private int[] scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int[] getScoreLine() {
        return scoreLine;
    }
    
    public void setScoreLine(int[] score) {
        int[] oldScore = scoreLine;
        scoreLine = score;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldScore, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
