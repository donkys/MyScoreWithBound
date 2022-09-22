/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author prosf
 */
public class SubscriberThaiFan implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int[] score = (int[])(evt.getNewValue());
        System.out.println("Live Result: Thai " + score[0] + "-" + score[1] + " UAE");
    }
    
}
