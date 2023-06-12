package exercises.exercise7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class ElapsingTime extends JFrame {
    private Timer timer;
    private int counter = 0;
    private JLabel timeLabel;

    public ElapsingTime() {
        setTitle("Elapsed Time");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        timeLabel = new JLabel("Counter=0");
        timeLabel.setBounds(20, 20, 200, 30);
        add(timeLabel);

        JButton startButton = new JButton("Start");
        startButton.setBounds(20, 60, 80, 30);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });
        add(startButton);

        JButton stopButton = new JButton("Stop");
        stopButton.setBounds(120, 60, 80, 30);
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });
        add(stopButton);

        setSize(220, 140);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void startTimer() {
        if (timer != null) {
            timer.cancel();
        }

        counter = 0;
        timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 0, 1000);
    }

    private void stopTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            counter++;
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    timeLabel.setText("Counter=" + String.valueOf(counter));
                }
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ElapsingTime();
            }
        });
    }
}
