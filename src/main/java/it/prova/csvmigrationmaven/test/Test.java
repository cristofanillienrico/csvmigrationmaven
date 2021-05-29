package it.prova.csvmigrationmaven.test;


import com.opencsv.bean.CsvToBeanBuilder;
import it.prova.csvmigrationmaven.model.Assicurato;
import it.prova.csvmigrationmaven.model.CsvModel;
import it.prova.csvmigrationmaven.model.NotProcessed;
import it.prova.csvmigrationmaven.service.MyServiceFactory;
import it.prova.csvmigrationmaven.service.NuovoService;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Test {



    public static void main(String[] args) throws Exception {

        NuovoService nuovoService = MyServiceFactory.getNuovoService();

        String fileName = "C:\\test\\archivio.csv";

        List<CsvModel> beans = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(CsvModel.class)
                .build()
                .parse();

//        beans.forEach(System.out::println);


        for (CsvModel csvModelItem : beans) {


            if (csvModelItem.getNumeroSinistri() > 14) {
                NotProcessed notProcessed = new NotProcessed();
                notProcessed.setCodiceFiscale(csvModelItem.getCodiceFiscale());
                nuovoService.inserisciNotProcessed(notProcessed);

            } else {

                Assicurato assicurato = new Assicurato();
                assicurato.setNome(csvModelItem.getNome());
                assicurato.setCognome(csvModelItem.getCognome());
                assicurato.setCodiceFiscale(csvModelItem.getCodiceFiscale());
                assicurato.setData(csvModelItem.getData());
                assicurato.setNumeroSinistri(csvModelItem.getNumeroSinistri());
                nuovoService.inserisciAssicurato(assicurato);


            }
        }


    }
}
