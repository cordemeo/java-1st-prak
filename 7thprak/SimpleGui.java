import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;
/*Напишите интерактивную программу с использованием GUI
имитирует таблицу результатов матчей между командами Милан и Мадрид.
Создайте JFrame приложение, у которого есть следующие компоненты GUI:
• одна кнопка JButton labeled “AC Milan”
• другая JButton подписана “Real Madrid”
• надпись JLabel содержит текст “Result: 0 X 0”
• надпись JLabel содержит текст “Last Scorer: N/A”
• надпись Label содержит текст “Winner: DRAW”;
Всякий раз, когда пользователь нажимает на кнопку AC Milan,
результат будет увеличиваться для Милана, сначала 1 X 0, затем 2 X 0 и так
далее. Last Scorer означает последнюю забившую команду. В этом случае:
AC Milan. Если пользователь нажимает кнопку для команды Мадрид, то счет
приписывается ей. Победителем становится команда, которая имеет больше
кликов кнопку на соответствующую, чем другая. */


public class SimpleGui extends JFrame {
    public int milancnt = 0;
    public int madridcnt = 0;
    private JButton acmilan;
    private JButton realmadrid;
   // private JTextField acmilan1 = new JTextField("AC Milan", 5);
    private JLabel result;
    private JLabel lastscorer;
    private Label winner;
    public SimpleGui () {
        super("Я люблю Никиту");
        this.setBounds(500,500,600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        acmilan = new JButton("AC milan");
        realmadrid = new JButton("Real Madrid");
        result = new JLabel("Result: " + milancnt + " X " + madridcnt);
        lastscorer = new JLabel("Last Scorer: N/A");
        winner = new Label("Winner: DRAW");


        //Container container = this.getContentPane();
        setLayout(new GridLayout(3,2));

        add(result);
        add(lastscorer);
        add(winner);
        add(acmilan);
        add(realmadrid);
        acmilan.addActionListener(new ActionListener() {
      //  });
        //add(acmilan);
        public void actionPerformed(ActionEvent e){
            milancnt++;
            updateresult();
            lastscorer.setText("Last scorer: AC Milan");
            updatewinner();
        }
        });
        realmadrid.addActionListener(new ActionListener() {
           // @Override
            public void actionPerformed(ActionEvent e) {
                madridcnt++;
                updateresult();
                lastscorer.setText("Last scorer: Real Madrid");

            }
        });
        }
        private void updateresult(){
            result.setText("Result: " + milancnt + " X " + madridcnt);
        }
        private void updatewinner(){
            if (milancnt > madridcnt){
                winner.setText("Winner: AC Milan");
            } else if (madridcnt > milancnt) {
                winner.setText("Winner: Real Madrid");

            } else {
                winner.setText("Winner: DRAW");
            }
        }
       // realmadrid.addActionListener(new buttoneventlistener());
       // container.add(realmadrid);
    }
    /*class buttoneventlistener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = "";
           // message += "button was pressed\n";
           // message += "text" + acmilan.getText() + "\n";
           // message += (realmadrid.isSelected() ? madridcnt + 1 : "NOT SELECTED REALMADRID") + "CHTOTO SELECTED\n";
            //JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
            if (realmadrid.isSelected()) {
                madridcnt += 1;
            }
        }
    }
}*/

