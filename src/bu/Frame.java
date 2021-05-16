package bu;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
import java.text.DecimalFormat;

public class Frame extends JFrame implements ActionListener{
    
    public static int rull,rull2;
    public static double milCap, Guv, nok1, nok3, nok4, burulma;
    
    JComboBox kuv_Say;
    JTextField mil_Uz, mot_Guc, dev_Say, p1x1, p1y1, p1z1, p2x1, p2y1, p2z1, p2x2, p2y2, p2z2, p3x1, p3y1, p3z1, p3x2, p3y2, p3z2, p3x3, p3y3, p3z3, p1uza, p2uza1, p2uza2, p3uza1, p3uza2, p3uza3;
    JLabel kabul, kabul1, kabul2,kabul3, kabul4, kabul5, kabul6, milUz, motGuc, devSay, kuvSay, son1, son2, son3, son4, son5, son6, by;
    JButton hes, sıf;
    JPanel p1, p2, p3, p;
    
    Frame(){
        
        
        
        //Text Fields
        mil_Uz = new JTextField();
        mil_Uz.setBounds(5, 135, 100, 20);
        
        mot_Guc = new JTextField();
        mot_Guc.setBounds(5, 405, 100, 20);
        
        dev_Say = new JTextField();
        dev_Say.setBounds(5, 455, 100, 20);
        
        
        
        p1x1 = new JTextField("x Kuvveti");      
        p1y1 = new JTextField("y Kuvveti");
        p1z1 = new JTextField("z Kuvveti");
        p1uza = new JTextField("Mesnete Uzaklık");
        p2x1 = new JTextField("x1 Kuvveti");
        p2y1 = new JTextField("y1 Kuvveti");
        p2z1 = new JTextField("z1 Kuvveti");
        p2x2 = new JTextField("x2 Kuvveti");        
        p2y2 = new JTextField("y2 Kuvveti");        
        p2z2 = new JTextField("z2 Kuvveti");
        p2uza1 = new JTextField("Mesnete Uzaklık");
        p2uza2 = new JTextField("Mesnete Uzaklık");
        p3x1 = new JTextField("x1 Kuvveti");
        p3y1 = new JTextField("y1 Kuvveti");
        p3z1 = new JTextField("z1 Kuvveti");
        p3x2 = new JTextField("x2 Kuvveti");
        p3y2 = new JTextField("y2 Kuvveti");
        p3z2 = new JTextField("z2 Kuvveti");
        p3x3 = new JTextField("x3 Kuvveti");        
        p3y3 = new JTextField("y3 Kuvveti");       
        p3z3 = new JTextField("z3 Kuvveti");
        p3uza1 = new JTextField("Mesnete Uzaklık");
        p3uza2 = new JTextField("Mesnete Uzaklık");
        p3uza3 = new JTextField("Mesnete Uzaklık");

        
        
        //Panels
        p = new JPanel();
        p.setBounds(15, 220, 450, 150);
        p.setBackground(Color.LIGHT_GRAY);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(15, 220, 450, 150);
        p1x1.setBounds(5, 65, 100, 20);
        p1y1.setBounds(115, 65, 100, 20);
        p1z1.setBounds(225, 65, 100, 20);
        p1uza.setBounds(335, 65, 100, 20);
        p1.add(p1x1);p1.add(p1y1);p1.add(p1z1);p1.add(p1uza);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setVisible(false);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(15, 220, 450, 150);
        p2x1.setBounds(5, 45, 100, 20);
        p2y1.setBounds(115, 45, 100, 20);
        p2z1.setBounds(225, 45, 100, 20);
        p2x2.setBounds(5, 85, 100, 20);
        p2y2.setBounds(115, 85, 100, 20);
        p2z2.setBounds(225, 85, 100, 20);
        p2uza1.setBounds(335, 45, 100, 20);
        p2uza2.setBounds(335, 85, 100, 20);
        p2.add(p2x1);p2.add(p2y1);p2.add(p2z1);p2.add(p2x2);p2.add(p2y2);p2.add(p2z2);p2.add(p2uza1);p2.add(p2uza2);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setVisible(false);
        
        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(15, 220, 450, 150);
        p3x1.setBounds(5, 25, 100, 20);
        p3y1.setBounds(115, 25, 100, 20);
        p3z1.setBounds(225, 25, 100, 20);
        p3x2.setBounds(5, 65, 100, 20);
        p3y2.setBounds(115, 65, 100, 20);
        p3z2.setBounds(225, 65, 100, 20);
        p3x3.setBounds(5, 105, 100, 20);
        p3y3.setBounds(115, 105, 100, 20);
        p3z3.setBounds(225, 105, 100, 20);
        p3uza1.setBounds(335, 25, 100, 20);
        p3uza2.setBounds(335, 65, 100, 20);
        p3uza3.setBounds(335, 105, 100, 20);
        p3.add(p3x1);p3.add(p3y1);p3.add(p3z1);p3.add(p3x2);p3.add(p3y2);p3.add(p3z2);p3.add(p3x3);p3.add(p3y3);p3.add(p3z3);p3.add(p3uza1);p3.add(p3uza2);p3.add(p3uza3);
        p3.setBackground(Color.LIGHT_GRAY);
        p3.setVisible(false);
        
        //ComboBoxes
        String ks[] = {"Tek Kuvvet", "Çift Kuvvet", "Üç Kuvvet"};
        kuv_Say = new JComboBox(ks);
        kuv_Say.setSelectedItem(null);
        kuv_Say.setBounds(5, 185, 100, 20);
        kuv_Say.addActionListener(this);
        
        
        //Labels
        milUz = new JLabel("Mil uzunluğu:");
        milUz.setBounds(5, 100, 100, 50);
        
        kuvSay = new JLabel("Kuvvet sayısı:");
        kuvSay.setBounds(5, 150, 100, 50);
        
        motGuc = new JLabel("Motor Gücü:");
        motGuc.setBounds(5, 370, 100, 50);
        
        devSay = new JLabel("Devir Sayısı:");
        devSay.setBounds(5, 420, 100, 50);
        
        kabul = new JLabel("Dikkat: İşlemler sadece Fe50 malzemesi için yapılır.");
        kabul.setBounds(35, -15, 484, 50);
        kabul.setForeground(Color.RED);
        kabul.setFont(new Font("Serif", Font.PLAIN, 14));
        
        kabul1 = new JLabel("Güvenlik katsayısı 1,5 olarak ayarlanmıştır.");
        kabul1.setBounds(77, 0, 484, 50);
        kabul1.setForeground(Color.RED);
        kabul1.setFont(new Font("Serif", Font.PLAIN, 14));
        
        kabul2 = new JLabel("Tüm uzaklıklar sol mesnete göre girilmelidir.  ");
        kabul2.setBounds(77, 15, 484, 50);
        kabul2.setForeground(Color.RED);
        kabul2.setFont(new Font("Serif", Font.PLAIN, 14));
        
        kabul3 = new JLabel("Rulman tipi sabit tek sıra bilyalıdır.");
        kabul3.setBounds(77, 30, 484, 50);
        kabul3.setForeground(Color.RED);
        kabul3.setFont(new Font("Serif", Font.PLAIN, 14));
        
        kabul4 = new JLabel("Mil hesaplaması 10-65mm arasında yapılabilir.");
        kabul4.setBounds(77, 45, 484, 50);
        kabul4.setForeground(Color.RED);
        kabul4.setFont(new Font("Serif", Font.PLAIN, 14));
        
        kabul5 = new JLabel("Rulman ömrü için ürünün 5 yıl aralıksız çalışabildiği varsayılmıştır.");
        kabul5.setBounds(77, 60, 484, 50);
        kabul5.setForeground(Color.RED);
        kabul5.setFont(new Font("Serif", Font.PLAIN, 14));
        
        kabul6 = new JLabel("İstenilen bilgiler boş bırakılamaz, olmayan değerler için '0' giriniz. ");
        kabul6.setBounds(77, 75, 484, 50);
        kabul6.setForeground(Color.RED);
        kabul6.setFont(new Font("Serif", Font.PLAIN, 14));
        
        son1 = new JLabel("Mil çapı = ");
        son1.setBounds(140, 525, 700, 40);
        
        son2 = new JLabel("Birinci yatak kodu = ");
        son2.setBounds(82, 540, 700, 40);
        
        son3 = new JLabel("İkinci yatak kodu = ");
        son3.setBounds(88, 555, 700, 40);
        
        son4 = new JLabel("Max eğilme momenti = ");
        son4.setBounds(65, 570, 700, 40);
        
        son5 = new JLabel("Max burulma momenti = ");
        son5.setBounds(56, 585, 700, 40);
        
        son6 = new JLabel("Güvenlik katsayısı = ");
        son6.setBounds(81, 600, 700, 40);
        
        by = new JLabel("Berkay Kahraman 1621012045");
        by.setBounds(328, 642, 700, 20);
        by.setFont(new Font("Serif", Font.PLAIN, 12));
        
        //Buttons
        hes = new JButton("Hesapla");
        hes.setBounds(125, 490, 100, 20);
        hes.addActionListener(this);
        
        sıf = new JButton("Sıfırla");
        sıf.setBounds(245, 490, 100, 20);
        sıf.addActionListener(this);
        
        this.add(milUz);this.add(mil_Uz);this.add(kuvSay);this.add(kuvSay);this.add(kuv_Say);this.add(sıf);this.add(by);
        this.add(motGuc);this.add(mot_Guc);this.add(devSay);this.add(dev_Say);this.add(hes);this.add(son1);this.add(son2);this.add(son3);this.add(son4);this.add(son5);this.add(kabul6);
        this.add(p);this.add(p1);this.add(p2);this.add(p3);this.add(kabul);this.add(kabul1);this.add(kabul2);this.add(kabul3);this.add(kabul4);this.add(kabul5);this.add(son6);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 700);
        this.setTitle("Mil ve Yatak Hesaplayıcı");
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.repaint();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == kuv_Say){
            String kss = (String)kuv_Say.getSelectedItem();
            
            switch (kss){
                
                case "Tek Kuvvet":
                    p.setVisible(false);
                    p1.setVisible(true);
                    p2.setVisible(false);
                    p3.setVisible(false);
                    break;
                
                case "Çift Kuvvet":
                    p.setVisible(false);
                    p1.setVisible(false);
                    p2.setVisible(true);
                    p3.setVisible(false);
                    break;
                    
                case "Üç Kuvvet":
                    p.setVisible(false);
                    p1.setVisible(false);
                    p2.setVisible(false);
                    p3.setVisible(true);
                    break;
            }
            
        }
        
        double motGuci = Double.parseDouble(mot_Guc.getText());
        double devSayi = Double.parseDouble(dev_Say.getText());
        double milUzi = Double.parseDouble(mil_Uz.getText());
        
        double s = 1.5;
        double malBur = 180/s;
        double malEg = 250/s;
        int capList [] = {10,12,15,17,20,25,30,35,40,45,50,55,60,65,70};
        double cList [][] = {{4.55, 6, 8.15},{5.1,6.95,9.65},{5.6,7.8,11.4},{6,9.5,11.4},{9.3,12.7,16},{10,14,22.4},{12.7,19.3,29},{16,25.5,33.5},{16.6,29,42.5},{20,31,53},{20.8,36.5,62},
            {28.5,43,76.5},{29,52,81.5},{30.5,60,93},{38,62,104}}; 
        int rulmanList [][] = {{6000,6200,6300},{6001,6201,6301},{6002,6202,6302},{6003,6203,6303},{6004,6204,6304},{6005,6205,6305},{6006,6206,6306},{6007,6207,6307},{6008,6208,6308},
            {6009,6209,6309},{6010,6210,6310},{6011,6211,6311},{6012,6212,6312},{6013,6213,6313},{6014,6214,6314}};
        

        
        if (e.getSource() == hes && (String)kuv_Say.getSelectedItem() == "Tek Kuvvet"){
            
            double p1x1i = Double.parseDouble(p1x1.getText());
            double p1y1i = Double.parseDouble(p1y1.getText());
            double p1z1i = Double.parseDouble(p1z1.getText());
            double p1uzai = Double.parseDouble(p1uza.getText());
            
            double mes2x = ((p1x1i*p1uzai)/milUzi)*-1;
            double mes2y = ((p1y1i*p1uzai)/milUzi)*-1;
            double mes2z = ((p1z1i*p1uzai)/milUzi)*-1;
            
            double mes1x = (p1x1i + mes2x)*-1;
            double mes1y = (p1y1i + mes2y)*-1;
            double mes1z = (p1z1i + mes2z)*-1;
            
            double nok1x = mes1x * p1uzai;
            double nok1y = mes1y * p1uzai;
            double nok1z = mes1z * p1uzai;
            
            nok1 = Math.sqrt(Math.pow(nok1x, 2)+Math.pow(nok1y, 2)+Math.pow(nok1z, 2));
            
            double mes1 = Math.sqrt(Math.pow(mes1x, 2)+Math.pow(mes1y, 2)+Math.pow(mes1z, 2));
            double mes2 = Math.sqrt(Math.pow(mes2x, 2)+Math.pow(mes2y, 2)+Math.pow(mes2z, 2));
            
            burulma = (motGuci*9550)/devSayi;
            
            burulma = burulma*s;
            
            milCap = Math.pow((16*burulma*1000)/(Math.PI*malBur), 0.33333);
            
            double temp = milCap%5;
            milCap = milCap + (5-temp);
            
            double rulmanCap = milCap + 5;
            double disliCap = milCap + 10;
            
            double egilme = (nok1*32)/(Math.PI*Math.pow(disliCap, 3));
            
            double malBurulma = (burulma*16000)/(Math.PI*Math.pow(disliCap, 3));
            
            Guv =  malEg / (malBurulma*Math.pow(3, 0.5) + egilme) ;
            
            double L = 43800*60*devSayi/1000000;
            double C1 = mes1*Math.pow(L, 0.33333)/1000;
            double C2 = mes2*Math.pow(L, 0.33333)/1000;
            
            for(int i=0; i < capList.length; i++){
                
                if (capList[i] == rulmanCap){
                    
                    for (int j = 0; j <3; j++){
                    
                        if(cList[i][j] > C1){
                            
                            rull = rulmanList[i][j];
                            
                        }
                    
                    }
                    for (int j = 0; j <3; j++){
                    
                        if(cList[i][j] > C2){
                            
                            rull2 = rulmanList[i][j];
                            
                        }
                    }
                }
                
            }
            
            
            son1.setText(son1.getText() + Math.round(milCap));
            if(rull == 0){
                son2.setText(son2.getText() + "Bu standartlara uygun rulman bulunamamaktadır.");
            }
            else{
            son2.setText(son2.getText() + (rull));
            }
            if(rull2 == 0){
                son3.setText(son3.getText() + "Bu standartlara uygun rulman bulunamamaktadır.");
            }
            else{
            son3.setText(son3.getText() + (rull2));
            }
            son4.setText(son4.getText() + Math.round((nok1/1000)*100)/100.0);
            son5.setText(son5.getText() + Math.round(burulma*100)/100.0);
            if (Guv >= 1){
                son6.setText(son6.getText() + Math.round(Guv*100)/100.0);
            }
            else if (Guv < 1){
                son6.setText(son6.getText() + Math.round(Guv*100)/100.0 + " Riskli mil!");
            }
            
        }
        
        else if (e.getSource() == hes && (String)kuv_Say.getSelectedItem() == "Çift Kuvvet"){
            
            double p2x1i = Double.parseDouble(p2x1.getText());
            double p2y1i = Double.parseDouble(p2y1.getText());
            double p2z1i = Double.parseDouble(p2z1.getText());
            double p2uza1i = Double.parseDouble(p2uza1.getText());
            double p2x2i = Double.parseDouble(p2x2.getText());
            double p2y2i = Double.parseDouble(p2y2.getText());
            double p2z2i = Double.parseDouble(p2z2.getText());
            double p2uza2i = Double.parseDouble(p2uza2.getText());
            
            double mes2x = (((p2x1i*p2uza1i)/milUzi)+(p2x2i*p2uza2i/milUzi))*-1;
            double mes2y = (((p2y1i*p2uza1i)/milUzi)+(p2y2i*p2uza2i/milUzi))*-1;
            double mes2z = (((p2z1i*p2uza1i)/milUzi)+(p2z2i*p2uza2i/milUzi))*-1;
            
            double mes1x = (p2x1i + mes2x + p2x2i)*-1;
            double mes1y = (p2y1i + mes2y + p2y2i)*-1;
            double mes1z = (p2z1i + mes2z + p2z2i)*-1;
            
            double nok1x = mes1x * p2uza1i;
            double nok1y = mes1y * p2uza1i;
            double nok1z = mes1z * p2uza1i;
            
            double nok2x = mes2x * Math.abs(milUzi-p2uza2i);
            double nok2y = mes2y * Math.abs(milUzi-p2uza2i);
            double nok2z = mes2z * Math.abs(milUzi-p2uza2i);
            
            double nok1 = Math.sqrt(Math.pow(nok1x, 2)+Math.pow(nok1y, 2)+Math.pow(nok1z, 2));
            double nok2 = Math.sqrt(Math.pow(nok2x, 2)+Math.pow(nok2y, 2)+Math.pow(nok2z, 2));
            
            if(nok1 > nok2){
            
                nok3 = nok1;
            }
            
            else{
                
                nok3 = nok2;
            }
            
            double mes1 = Math.sqrt(Math.pow(mes1x, 2)+Math.pow(mes1y, 2)+Math.pow(mes1z, 2));
            double mes2 = Math.sqrt(Math.pow(mes2x, 2)+Math.pow(mes2y, 2)+Math.pow(mes2z, 2));
            
            burulma = (motGuci*9550)/devSayi;
            
            burulma = burulma*s;
            
            milCap = Math.pow((16*burulma*1000)/(Math.PI*malBur), 0.33333);
            
            double temp = milCap%5;
            milCap = milCap + (5-temp);
            
            double rulmanCap = milCap + 5;
            double disliCap = milCap + 10;
            
            double egilme = (nok3*32)/(Math.PI*Math.pow(disliCap, 3));
            
            double malBurulma = (burulma*16000)/(Math.PI*Math.pow(disliCap, 3));
            
            Guv = malEg / (malBurulma*Math.pow(3, 0.5) + egilme) ;
            
            double L = 43800*60*devSayi/1000000;
            double C1 = mes1*Math.pow(L, 0.33333)/1000;
            double C2 = mes2*Math.pow(L, 0.33333)/1000;
            
            for(int i=0; i < capList.length; i++){
                
                if (capList[i] == rulmanCap){
                    
                    for (int j = 0; j < 3; j++){
                    
                        if(cList[i][j] > C1){
                            
                            rull = rulmanList[i][j];
                            
                        }
                    
                    }
                    for (int j = 0; j < 3; j++){
                    
                        if(cList[i][j] > C2){
                            
                            rull2 = rulmanList[i][j];
                            
                        }
                    }
                }
                
            }
            
            son1.setText(son1.getText() + Math.round(milCap));
            if(rull == 0){
                son2.setText(son2.getText() + "Bu standartlara uygun rulman bulunamamaktadır.");
            }
            else{
            son2.setText(son2.getText() + (rull));
            }
            if(rull2 == 0){
                son3.setText(son3.getText() + "Bu standartlara uygun rulman bulunamamaktadır.");
            }
            else{
            son3.setText(son3.getText() + (rull2));
            }
            son4.setText(son4.getText() + Math.round((nok3/1000)*100)/100.0);
            son5.setText(son5.getText() + Math.round(burulma*100)/100.0);
            if (Guv >= 1){
                son6.setText(son6.getText() + Math.round(Guv*100)/100.0);
            }
            else if (Guv < 1){
                son6.setText(son6.getText() + Math.round(Guv*100)/100.0 + " Riskli mil!");
            }
            
        }
        
        else if (e.getSource() == hes && (String)kuv_Say.getSelectedItem() == "Üç Kuvvet"){
            
            double p3x1i = Double.parseDouble(p3x1.getText());
            double p3y1i = Double.parseDouble(p3y1.getText());
            double p3z1i = Double.parseDouble(p3z1.getText());
            double p3uza1i = Double.parseDouble(p3uza1.getText());
            double p3x2i = Double.parseDouble(p3x2.getText());
            double p3y2i = Double.parseDouble(p3y2.getText());
            double p3z2i = Double.parseDouble(p3z2.getText());
            double p3uza2i = Double.parseDouble(p3uza2.getText());
            double p3x3i = Double.parseDouble(p3x3.getText());
            double p3y3i = Double.parseDouble(p3y3.getText());
            double p3z3i = Double.parseDouble(p3z3.getText());
            double p3uza3i = Double.parseDouble(p3uza3.getText());
            
            double mes2x = (((p3x1i*p3uza1i)/milUzi)+(p3x2i*p3uza2i/milUzi)+(p3x3i*p3uza3i/milUzi))*-1;
            double mes2y = (((p3y1i*p3uza1i)/milUzi)+(p3y2i*p3uza2i/milUzi)+(p3y3i*p3uza3i/milUzi))*-1;
            double mes2z = (((p3z1i*p3uza1i)/milUzi)+(p3z2i*p3uza2i/milUzi)+(p3z3i*p3uza3i/milUzi))*-1;
            
            double mes1x = (p3x1i + mes2x + p3x2i + p3x3i)*-1;
            double mes1y = (p3y1i + mes2y + p3y2i + p3y3i)*-1;
            double mes1z = (p3z1i + mes2z + p3z2i + p3z3i)*-1;
            
            double nok1x = mes1x * p3uza1i;
            double nok1y = mes1y * p3uza1i;
            double nok1z = mes1z * p3uza1i;
            
            double nok2x = (mes1x * p3uza1i) - p3x1i * Math.abs(p3uza1i-p3uza2i);
            double nok2y = (mes1y * p3uza1i) - p3y1i * Math.abs(p3uza1i-p3uza2i);
            double nok2z = (mes1z * p3uza1i) - p3z1i * Math.abs(p3uza1i-p3uza2i);
            
            double nok3x = mes2x * Math.abs(milUzi-p3uza3i);
            double nok3y = mes2y * Math.abs(milUzi-p3uza3i);
            double nok3z = mes2z * Math.abs(milUzi-p3uza3i);
            
            double nok1 = Math.sqrt(Math.pow(nok1x, 2)+Math.pow(nok1y, 2)+Math.pow(nok1z, 2));
            double nok2 = Math.sqrt(Math.pow(nok2x, 2)+Math.pow(nok2y, 2)+Math.pow(nok2z, 2));
            double nok3 = Math.sqrt(Math.pow(nok3x, 2)+Math.pow(nok3y, 2)+Math.pow(nok3z, 2));
            
            if(nok1 > nok2 && nok1 > nok3){
            
                nok4 = nok1;
            }
            
            else if (nok2 > nok1 && nok2 > nok3){
                
                nok4 = nok2;
            }
            else{
            
                nok4 = nok3;
            }
            
            double mes1 = Math.sqrt(Math.pow(mes1x, 2)+Math.pow(mes1y, 2)+Math.pow(mes1z, 2));
            double mes2 = Math.sqrt(Math.pow(mes2x, 2)+Math.pow(mes2y, 2)+Math.pow(mes2z, 2));
            
            burulma = (motGuci*9550)/devSayi;
            
            burulma = burulma*s;
            
            milCap = Math.pow((16*burulma*1000)/(Math.PI*malBur), 0.33333);
            
            double temp = milCap%5;
            milCap = milCap + (5-temp);
            
            double rulmanCap = milCap + 5;
            double disliCap = milCap + 10;
            
            double egilme = (nok4*32)/(Math.PI*Math.pow(disliCap, 3));
            
            double malBurulma = (burulma*16000)/(Math.PI*Math.pow(disliCap, 3));
            
            Guv = malEg / (malBurulma*Math.pow(3, 0.5) + egilme) ;
            
            double L = 43800*60*devSayi/1000000;
            double C1 = mes1*Math.pow(L, 0.33333)/1000;
            double C2 = mes2*Math.pow(L, 0.33333)/1000;
            
            for(int i=0; i < capList.length; i++){
                
                if (capList[i] == rulmanCap){
                    
                    for (int j = 0; j <3; j++){
                    
                        if(cList[i][j] > C1){
                            
                            rull = rulmanList[i][j];
                            
                        }
                    
                    }
                    for (int j = 0; j <3; j++){
                    
                        if(cList[i][j] > C2){
                            
                            rull2 = rulmanList[i][j];
                            
                        }
                    }
                }
                
            }
            
            son1.setText(son1.getText() + Math.round(milCap));
            if(rull == 0){
                son2.setText(son2.getText() + "Bu standartlara uygun rulman bulunamamaktadır.");
            }
            else{
            son2.setText(son2.getText() + (rull));
            }
            if(rull2 == 0){
                son3.setText(son3.getText() + "Bu standartlara uygun rulman bulunamamaktadır.");
            }
            else{
            son3.setText(son3.getText() + (rull2));
            }
            son4.setText(son4.getText() + Math.round((nok4/1000)*100)/100.0);
            son5.setText(son5.getText() + Math.round(burulma*100)/100.0);
            if (Guv >= 1){
                son6.setText(son6.getText() + Math.round(Guv*100)/100.0);
            }
            else if (Guv < 1){
                son6.setText(son6.getText() + Math.round(Guv*100)/100.0 + " Riskli mil!");
            }
            
        }
        
        else if (e.getSource() == sıf){
            
            milCap = 0;
            rull = 0;
            rull2 = 0;
            burulma = 0;
            Guv = 0;
            nok1 = 0;
            nok3 = 0;
            nok4 = 0;
            
            son1.setText("Mil çapı = ");
            son2.setText("Birinci yatak kodu = ");
            son3.setText("İkinci yatak kodu = ");
            son4.setText("Max eğilme momenti = ");
            son5.setText("Max burulma momenti = ");
            son6.setText("Güvenlik katsayısı = ");
            
            }
        }
        
    }
