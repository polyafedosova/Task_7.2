package ru.vsu.fedosova.gui;

import ru.vsu.fedosova.gui.listener.ApplyButtonListener;
import ru.vsu.fedosova.gui.listener.RestoreBottomListener;

import javax.swing.*;

public class Frame extends JFrame
{
    private JPanel mainPanel;
    private JTextField inputArrayField;
    private JButton applyButton;
    private JTextField outputDecrease;
    private JTextField outputIncrease;
    private JButton restoreButton;

    public Frame()
    {
        this.setTitle("Decrease and Increase intervals");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setBounds(750, 300, 500, 200);

        this.applyButton.addActionListener(new ApplyButtonListener(inputArrayField, outputDecrease, outputIncrease));
        this.restoreButton.addActionListener(new RestoreBottomListener(inputArrayField,
                outputDecrease, outputIncrease));

        this.setVisible(true);
    }
}