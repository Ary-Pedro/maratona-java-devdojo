package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        //pt-BR seguindo a ISO
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Itália: "+ df1.format(calendar.getTime()));
        System.out.println("País: " +localeItaly.getDisplayCountry());
        System.out.println(" ---------- ");

        System.out.println("Suiça: "+ df2.format(calendar.getTime()));  // detalhe, na Suiça é mostrado a vírgula
        System.out.println("País: " +localeCH.getDisplayCountry());
        System.out.println(" ---------- ");

        System.out.println("Índia: "+ df3.format(calendar.getTime()));
        System.out.println("País: " +localeIndia.getDisplayCountry());
        System.out.println(" ---------- ");

        System.out.println("Japão: "+ df4.format(calendar.getTime()));
        System.out.println("País: " +localeJapao.getDisplayCountry());
        System.out.println(" ---------- ");

        System.out.println("Holanda: "+ df5.format(calendar.getTime()));
        System.out.println("País: " +localeHolanda.getDisplayCountry());
        System.out.println(" ---------- ");

    }
}
