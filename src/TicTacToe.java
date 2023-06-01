import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe extends JComponent{

    public TicTacToe(){
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }

    void drawGrid(Graphics graphics){
        int w = getWidth();
        int h = getHeight();
        int dw = w / 3;
        int dh = h / 3;
        graphics.setColor(Color.BLUE);
        for(int i = 1; i < 3; i++){
            graphics.drawLine(0,dh * i,w,dh * i);
            graphics.drawLine(dw * i,0,dw * i,h);
        }
    }

    protected void processMouseEvent(MouseEvent mouseEvent){
        super.processMouseEvent(mouseEvent);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        drawGrid(graphics);
    }


}
