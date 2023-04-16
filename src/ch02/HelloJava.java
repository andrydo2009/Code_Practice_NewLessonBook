package ch02;

import javax.swing.*;

public class HelloJava {
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Hello, Java!" );//для размещения окна на экране содзаем обьек frame
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );//создаем сообщение в окне и размещаем его в центре
        frame.add(label);
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}
