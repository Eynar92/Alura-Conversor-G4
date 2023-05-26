package convert;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TemperatureFieldListener<T> extends KeyAdapter {

    private Class<T> temperatureType;

    public TemperatureFieldListener(Class<T> temperatureType) {
        this.temperatureType = temperatureType;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
