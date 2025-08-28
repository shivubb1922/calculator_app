package com.example.calculator.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.calculator.Calculator;

public class CalculatorUI {
    private Calculator calculator;
    private JFrame frame;
    private JTextField inputA;
    private JTextField inputB;
    private JTextArea resultArea;

    public CalculatorUI() {
        calculator = new Calculator();
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        inputA = new JTextField(10);
        inputB = new JTextField(10);
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        JButton checkButton = new JButton("Check Number Type");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                int result = calculator.performAddition(a, b);
                resultArea.setText("Result: " + result);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                int result = calculator.performSubtraction(a, b);
                resultArea.setText("Result: " + result);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                int result = calculator.performMultiplication(a, b);
                resultArea.setText("Result: " + result);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                double result = calculator.performDivision(a, b);
                resultArea.setText("Result: " + result);
            }
        });

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(inputA.getText());
                String result = calculator.checkNumberType(number);
                resultArea.setText("Number Type: " + result);
            }
        });

        frame.add(inputA);
        frame.add(inputB);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(checkButton);
        frame.add(resultArea);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorUI());
    }
}