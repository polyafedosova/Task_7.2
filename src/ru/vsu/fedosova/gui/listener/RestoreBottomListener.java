package ru.vsu.fedosova.gui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestoreBottomListener implements ActionListener
{
    JTextField inputArrayField;
    JTextField outputDecrease;
    JTextField outputIncrease;

    public RestoreBottomListener(JTextField inputArray, JTextField outputDecrease,
                                 JTextField outputIncrease)
    {
        this.inputArrayField = inputArray;
        this.outputDecrease = outputDecrease;
        this.outputIncrease = outputIncrease;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        inputArrayField.setText(null);
        outputDecrease.setText(null);
        outputIncrease.setText(null);
    }
}
