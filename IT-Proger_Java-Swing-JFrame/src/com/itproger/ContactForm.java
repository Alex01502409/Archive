package com.itproger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JTextField name_field, email_field;
    private JRadioButton male, female;
    private JCheckBox checkBox;

    public ContactForm() {
        super("Контактна форма");
        super.setBounds(200, 200, 350, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel name = new JLabel("Введіть імʼя:");
        name_field = new JTextField("", 1);

        JLabel email = new JLabel("Введіть email:");
        email_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Чоловіча");
        female = new JRadioButton("Жіноча");

        male.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(male);
        container.add(female);

        checkBox = new JCheckBox("Погодитись?", true);
        container.add(checkBox);

        JButton btn = new JButton("Відправити");
        container.add(btn);

        btn.addActionListener(new ButtonEventManager());

    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String email = email_field.getText();

            String isMale = "Чоловіча";
            if (!male.isSelected())
                isMale = "Жіноча";

            boolean isCheck = checkBox.isSelected();

            JOptionPane.showMessageDialog(null, "Ваша пошта: " + email + "\nВи: " + isMale + "\nВи погоджуєтесь? " + isCheck, ("Привіт, " + name), JOptionPane.PLAIN_MESSAGE);
        }
    }

}
