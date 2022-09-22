/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithbound;

import java.util.Scanner;

/**
 *
 * @author prosf
 */
public class MyScoreWithBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        LiveScoreBean source = new LiveScoreBean();
        SubscriberThaiFan listen1 = new SubscriberThaiFan();
        SubscriberUAEFan listen2 = new SubscriberUAEFan();
        source.addPropertyChangeListener(listen1);
        source.addPropertyChangeListener(listen2);
        
        
        int th,uae;
        while (true) {
            try {
                String tmp = inp.nextLine().trim();
                if (tmp.split("\\s+").length == 2) {
                    th = Integer.parseInt(tmp.split("\\s+")[0]);
                    uae = Integer.parseInt(tmp.split("\\s+")[1]);
                } else {
                    th = Integer.parseInt(tmp);
                    uae = Integer.parseInt(inp.nextLine());
                }
                System.out.println("Enter Score Thai " + th + "-" + uae + " UAE");
            } catch (Exception e) {
                break;
            }
            source.setScoreLine(new int[]{th, uae});
        }
    }
    
}
