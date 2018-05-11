package cn.z.jiutian.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class JButtonTest {

    private static final Logger LOG = LoggerFactory.getLogger(JButtonTest.class);
    
    @Test
    public void jButtonTest(){
        JButton show = new JButton("Show");
        show.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event handling without lambda expression is boring");
            }
        });
    }
    
    @Test
    public void jButtonJava8Test(){
        JButton show = new JButton("Show");
        show.addActionListener((e) -> {
            System.out.println("Light, Camera, Action!! Lambda expressions Rocks");
        });
    }

}
