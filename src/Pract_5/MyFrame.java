package Pract_5;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    int  ScoreMilan, ScoreNadrid = 0;
    public void Winner(int Milan, int Madrid, JLabel winner)
    {
        if(Milan>Madrid)
        {
            winner.setText("Winner: AC Milan");
        }
        else if(Milan < Madrid)
        {
            winner.setText("Winner: Real Madrid");
        }
        else{
            winner.setText("Winner: DRAW");
        }
    }
    public MyFrame()
    {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel= new JPanel();
        JButton Milan = new JButton("AC Milan");
        JButton Madrid = new JButton("Real Madrid");
        JLabel CurScore = new JLabel("Result: "+ScoreMilan+" X "+ScoreNadrid, JLabel.LEFT);
        JLabel CurGoal = new JLabel("Last scorer: N/A", JLabel.RIGHT);
        JLabel Winner = new JLabel("Winner: N/A", JLabel.CENTER);
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(500,300));


        Milan.addActionListener( add_New ->
                {
                    ScoreMilan++;
                    CurScore.setText("Result: "+ScoreMilan+" X "+ScoreNadrid);
                    Winner(ScoreMilan,ScoreNadrid,Winner);
                    CurGoal.setText("Last scorer: AC Milan");
                }
        );

        Madrid.addActionListener( add_new ->
                {
                    ScoreNadrid++;
                    CurScore.setText("Result: "+ScoreMilan+" X "+ScoreNadrid);
                    Winner(ScoreMilan,ScoreNadrid,Winner);
                    CurGoal.setText("Last scorer: Real Madrid");
                }

        );
        getContentPane().add(panel);
        panel.add(CurScore);
        panel.add(CurGoal);
        panel.add(Winner);
        panel.add(Milan);
        panel.add(Madrid);
        pack();
        setVisible(true);
    }
}
