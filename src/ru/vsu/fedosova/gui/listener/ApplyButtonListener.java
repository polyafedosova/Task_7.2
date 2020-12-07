package ru.vsu.fedosova.gui.listener;

import ru.vsu.fedosova.ArrayUtils;
import ru.vsu.fedosova.common.GetQuantityIntervals;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplyButtonListener implements ActionListener
{
    JTextField inputArrayField;
    JTextField outputDecrease;
    JTextField outputIncrease;

    public ApplyButtonListener(JTextField inputArray, JTextField outputDecrease,
                               JTextField outputIncrease)
    {
        this.inputArrayField = inputArray;
        this.outputDecrease = outputDecrease;
        this.outputIncrease = outputIncrease;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String inputArr = inputArrayField.getText();

        if (inputArr != null && !"".equals(inputArr))
        {
            int[] arr = ArrayUtils.toIntArray(inputArr);

            GetQuantityIntervals GetQuantityIntervals = new GetQuantityIntervals();

            int[] arrIntervals = GetQuantityIntervals.getQuantityIntervals(arr);

            this.outputDecrease.setText(Integer.toString(arrIntervals[0]));
            this.outputIncrease.setText(Integer.toString(arrIntervals[1]));
        }
    }
}

