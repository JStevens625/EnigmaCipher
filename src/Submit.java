
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens
 */
public class Submit extends JPanel
{
    private ActionListener submit = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }
    };
    
    public Submit()
    {
        JButton jb = new JButton("Begin The Coding Process");
        jb.addActionListener(submit);
        add(jb);
        
    }
}
