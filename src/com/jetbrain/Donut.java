package com.jetbrain;
import java.awt.*;
import javax.swing.*;

public class Donut extends JFrame {

    public Donut() {
        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(330, 330);

        setTitle("Donut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Donut ex = new Donut();
            ex.setVisible(true);
        });
    }
}