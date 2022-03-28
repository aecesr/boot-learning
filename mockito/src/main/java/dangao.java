import javax.swing.*;
import java.awt.*;


/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-21 18:15
 **/

public class dangao extends JFrame {
    public dangao() {
        this.setBounds(500, 250, 500, 450);
        this.setContentPane(new Paint());
        setVisible(true);
    }

    public static void main(String[] args) {       //主函数
        dangao hap = new dangao();       //实例化主类

        java.awt.EventQueue.invokeLater(new Runnable() { //运行图形化界面
            public void run() {
                hap.setVisible(true);
            }
        });
    }

    class Paint extends JPanel {

        public void paint(Graphics g) {
            // //画出蛋糕的主体（下部分）
            g.setColor(Color.pink);
            g.fillOval(100,150,240,120);
            g.setColor(Color.green);
            g.fillOval(110,160,220,100);
            g.setColor(Color.red);
            g.fillOval(120,170,200,80);
            g.setColor(Color.yellow);
            g.fillOval(130,180,180,60);
            g.setColor(Color.pink);
            g.fillOval(140,190,160,40);
            g.setColor(Color.blue);
            g.fillOval(150,200,140,20);
            //画出蛋糕的主体（上部分）（分成椭圆和矩形）
            g.setColor(Color.orange);
            g.drawRect(160,130,120,50);
            g.fillOval(160,100,120,60);
            g.fillOval(160,150,120,60);
            g.fillRect(160,130,120,50);
            //描线
            g.setColor(Color.black);
            g.drawOval(160,100,120,60);
            g.drawOval(100,150,240,120);
            g.drawArc(100,220,240,120,0,-180);
            g.drawLine(100,210,100,280);
            g.drawLine(340,210,340,280);
            g.drawLine(160,130,160,180);
            g.drawLine(280,130,280,180);
            //将上部分背面的线抹去
            g.setColor(Color.orange);
            g.drawArc(100,150,240,120,55,125);
            //写字
            g.setColor(Color.red);
            g.setFont(new Font("楷体", Font.BOLD, 35));
            g.drawString("生    乐", 140, 305);
            g.drawString("日快", 180, 315);

        }
    }


}
