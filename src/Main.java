import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] City ={"istanbul","rize","kastamonu","afyon","trabzon","erzurum","hatay","muş","van","bolu"};
        int truecount=0;
        String estimated;
        char c;
        char[] emptycityname;

        Random rand = new Random();
        int rand_city_index = rand.nextInt(10);


        emptycityname = new char[City[rand_city_index].length()];
        for (int i = 0; i < City[rand_city_index].length(); i++) {
            emptycityname[i] = '-';
        }
        long starttime=System.currentTimeMillis();
        while(City[rand_city_index].length()!=truecount){
            estimated=JOptionPane.showInputDialog(null,"harf giriniz"+ Arrays.toString(emptycityname));
            if(estimated.length()>1)
                JOptionPane.showMessageDialog(null,"Lütfen sadece 1 tane harf girin");
            else{
                if(estimated.charAt(0)<97 || estimated.charAt(0)>122)
                    JOptionPane.showMessageDialog(null,"Lütfen sadece küçük harf girin");
                    else{
                    c = estimated.charAt(0);
                    for (int k = 0; k < City[rand_city_index].length(); k++)
                        if (c == City[rand_city_index].charAt(k)) {
                            truecount++;
                            emptycityname[k] = c;
                        }
                }

            }
    }
        long endtime=System.currentTimeMillis();
        long timetooktofindinsec=(endtime-starttime)/1000;

        JOptionPane.showMessageDialog(null,timetooktofindinsec+" bitirmeniz saniye sürdü");

        if(timetooktofindinsec>50)
            JOptionPane.showMessageDialog(null,"Bitirdiniz puanınız:0");
        if(timetooktofindinsec<50 && timetooktofindinsec>40)
            JOptionPane.showMessageDialog(null,"Bitirdiniz puanınız:30");
        if(timetooktofindinsec<40 && timetooktofindinsec>30)
            JOptionPane.showMessageDialog(null,"Bitirdiniz puanınız:60");
        if(timetooktofindinsec<30 && timetooktofindinsec>20)
            JOptionPane.showMessageDialog(null,"Bitirdiniz puanınız:80");
        if(timetooktofindinsec<20)
            JOptionPane.showMessageDialog(null,"Bitirdiniz puanınız:100");




    }
}