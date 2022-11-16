package com.example;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        System.out.println("------------");
        ArrayList<Studente> studenti =new ArrayList<>();
        Studente s1=new Studente(1,"ciccio","bimbo","2022, 11, 16",75);
        Studente s2=new Studente(2,"ciccio","bimbo","2022, 11, 16",80);
        Studente s3=new Studente(3,"ciccio","bimbo","2022, 11, 16",65);
        Studente s4=new Studente(4,"ciccio","bimbo","2022, 11, 16",85);

        Studenti lStudenti=new Studenti("itismeucci");
        lStudenti.aggiungi(s1);
        lStudenti.aggiungi(s2);
        lStudenti.aggiungi(s3);
        lStudenti.aggiungi(s4);
                
        XmlMapper xmlMapper = new XmlMapper();
        
        //Serializzazione     
        xmlMapper.writeValue(new File("test.xml"), lStudenti);
        String myXml = xmlMapper.writeValueAsString(lStudenti);
        System.out.println("Oggetto serializzato:" + myXml);
        
        //Deserializzazione        
        
        

    }


}
