package it.prova.csvmigrationmaven.test;

import com.opencsv.bean.CsvToBeanBuilder;
import it.prova.csvmigrationmaven.model.CsvModel;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\test\\prova.csv";

        List<CsvModel> beans = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(CsvModel.class)
                .build()
                .parse();

        beans.forEach(System.out::println);
    }
}
