package it.prova.csvmigrationmaven.dao.nuovo;

import it.prova.csvmigrationmaven.model.Assicurato;
import it.prova.csvmigrationmaven.model.NotProcessed;

public interface NuovoDAO {

    public int insertAssicurato(Assicurato input) throws Exception;

    public int insertNotProcessed(NotProcessed input) throws Exception;
}
