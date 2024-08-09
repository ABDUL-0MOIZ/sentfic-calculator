Simport javax.swing.*;

import javax.xml.namespace.QName;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame frame;
    static JButton[] numbtn = new JButton[10];
    static JButton[] functonBtn=new JButton[22];
    static JButton addBtn,subBtn,mult,divid,eqBtn,decBtn,clrBtn,delBtn,powBtn,sqrBtn,logBtn,piBtn,
            tenBtn,facBtn,modBtn,sinBtn,cosBtn,tanBtn,hypBtn,cscBtn,secBtn,cotBtn;

    static  double num1=0.0,num2=0.0,result=0.0;
     static char operator;
    static JTextField field;

    public static void main(String[] args) {
        frame=new JFrame();
        frame.setBounds(400,100,450,600);
        frame.setTitle("Sentific Calculator");
        ImageIcon icon=new ImageIcon("calculator.png");
        frame.setIconImage(icon.getImage());
  frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        field=new JTextField();

        field.setBounds(20,10,550,50);
        field.setEditable(false);

        Font font=new Font("arial",Font.BOLD,25);
        field.setFont(font);

        addBtn=new JButton("+");
        subBtn=new JButton("-");
        mult=new JButton("x");
        divid=new JButton("/");
        eqBtn=new JButton("=");
        decBtn=new JButton(".");
        clrBtn=new JButton("C");
        delBtn=new JButton("CE");
        powBtn=new JButton("^");

        sqrBtn=new JButton("sqrt");

        logBtn=new JButton("log");
        piBtn=new JButton("pi");

        tenBtn=new JButton("10^");
        facBtn=new JButton("!");
        modBtn=new JButton("Mod");
        sinBtn=new JButton("sin");
        cosBtn=new JButton("Cos");
        tanBtn=new JButton("tan");
        hypBtn=new JButton("hyp");
        cscBtn=new JButton("Csc");
        secBtn=new JButton("Sec");
        cotBtn=new JButton("cot");

        functonBtn[0]=addBtn;
        functonBtn[1]=subBtn;
        functonBtn[2]  = mult;

        functonBtn[3]=divid;
        functonBtn[4]=eqBtn;
        functonBtn[5]=decBtn;
        functonBtn[6]=clrBtn;
        functonBtn[7]=delBtn;
        functonBtn[8]=powBtn;
        functonBtn[9]=sqrBtn;
        functonBtn[10]=logBtn;
        functonBtn[11]=piBtn;
        functonBtn[12]= tenBtn;
        functonBtn[13]= facBtn;
        functonBtn[14]=modBtn;
        functonBtn[15]=sinBtn;

        functonBtn[16]=cosBtn;
        functonBtn[17]=tanBtn;
        functonBtn[18]=hypBtn;
        functonBtn[19]=cscBtn;
        functonBtn[20]=secBtn;
        functonBtn[21]=cotBtn;
        for (int i = 0; i <= 21; i++) {
            functonBtn[i].setFont(font);

        }
        for (int i = 0; i < 10; i++) {
            numbtn[i]=new JButton(String.valueOf(i));
            numbtn[i].setFont(font);
            numbtn[i].setFocusable(false);

        }
        field.setLayout(null);
GridLayout layout=new GridLayout(6,5,3,3);
    JPanel    panel=new JPanel();




      panel.setLayout(layout);
        panel.setBounds(30,100,300,600);
  panel.setBackground(Color.gray);
        panel.add(cosBtn);
        panel.add(sinBtn);
        panel.add(tanBtn);
        panel.add(delBtn);
        panel.add(clrBtn);
        //
        panel.add(cscBtn);
        panel.add(secBtn);
       panel.add(cotBtn);
        panel.add(powBtn);
        panel.add(hypBtn);
        //
        panel.add(logBtn);
        panel.add(numbtn[7]);
        panel.add(numbtn[8]);
        panel.add(numbtn[9]);
        panel.add(mult);
        //
        panel.add(tenBtn);
        panel.add(numbtn[4]);
        panel.add(numbtn[5]);
        panel.add(numbtn[6]);
        panel.add(subBtn);
//
        panel.add(sqrBtn);
        panel.add(numbtn[1]);
      panel.add(numbtn[2]);
       panel.add(numbtn[3]);
        panel.add(addBtn);
        //
        panel.add(piBtn);
        panel.add(decBtn);
        panel.add(numbtn[0]);
        panel.add(divid);
    panel.add(eqBtn);
//
        frame.setLayout(new BorderLayout());
       frame.add(field, BorderLayout.NORTH);
   frame.add(panel, BorderLayout.CENTER);



        frame.setVisible(true);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            numbtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+numbtn[finalI].getText());
                }
            });

        }
        decBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText()+".");
            }
        });
        clrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String text=  field .getText();
              int len=text.length();
             text =text.substring(0,len-1);
             field.setText(text);
             }
        });
        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("");
                num1=0;
                result=0;

            }
        });
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                operator='*';
                field.setText("");
            }
        });

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 num1=Double.parseDouble(field.getText());
                operator='+';
                field.setText("");
            }
        });

        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 num1=Double.parseDouble(field.getText());
                operator='-';
                field.setText("");
            }
        });

        divid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 num1=Double.parseDouble(field.getText());
                operator='/';
                field.setText("");
            }
        });

        modBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());

            }
        });
        powBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                operator='^';
                field.setText("");
            }
        });
        sqrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result=Math.sqrt(num1);
                field.setText(String.valueOf(result));
            }
        });
        tenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result=Math.pow(10,num1);
                field.setText(String.valueOf(result));
            }
        });
        cosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result =Math.cos(num1);

                field.setText(String.valueOf(result));


            }
        });
        sinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result =Math.sin(num1);

                field.setText(String.valueOf(result));


            }
        });
        tanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result =Math.tan(num1);

                field.setText(String.valueOf(result));


            }
        });

        cscBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result =1/Math.sin(num1);

                field.setText(String.valueOf(result));


            }
        });
        secBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result =1.0/Math.cos(num1);

                field.setText(String.valueOf(result));


            }
        });
        cotBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                result =1/Math.tan(num1);

                field.setText(String.valueOf(result));


            }
        });
        hypBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(field.getText());
                operator='$';
                field.setText("");
            }
        });
      logBtn.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              num1=Double.parseDouble(field.getText());
              result =Math.log(num1);

              field.setText(String.valueOf(result));


          }
      });
      piBtn.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              num1=Math.PI;
              field.setText(String.valueOf(num1));
          }
      });

        eqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 num2=Double.parseDouble(field.getText());
                switch (operator){
                    case '*':
                        result=num1*num2;
                        break;
                    case '+':
                        result=num1+num2;
                        break;
                    case '-':
                        result=num1-num2;
                        break;
                    case '/':
                        result=num1/num2;
                        break;
                    case '^':
                        result=Math.pow(num1,num2);
                        break;
                    case '$':
                        result=Math.hypot(num1,num2);
                        break;


                }

                field.setText(String.valueOf(result));
                num1= result;



            }
        });
    }
}