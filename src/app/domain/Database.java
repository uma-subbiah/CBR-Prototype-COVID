package app.domain;

import app.util.CsvReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database 
{

    public List<Case> load() throws IOException
    {
        List<Case> cases = new ArrayList<>();
        List<String[]> content = new CsvReader().read("/app/domain/db/kidney_disease-7.csv", true);
        int i=0;
        for (String[] tuple : content) 
        {
            Case rbcCase = new Case(
            		Double.valueOf(tuple[0]),
            		Double.valueOf(tuple[1]),
            		Double.valueOf(tuple[2]),
                    Double.valueOf(tuple[3]),
                    Double.valueOf(tuple[4]),
                    Double.valueOf(tuple[5]),
                    Double.valueOf(tuple[6]),
                    Double.valueOf(tuple[7]),
                    Double.valueOf(tuple[8]),
                    Double.valueOf(tuple[9]),
                    Double.valueOf(tuple[10]),
                    Double.valueOf(tuple[11]),
                    Double.valueOf(tuple[12]),
                    Double.valueOf(tuple[13]),
                    Double.valueOf(tuple[14]),
                    Double.valueOf(tuple[15]),
                    Double.valueOf(tuple[16]),
                    Double.valueOf(tuple[17]),
                    Double.valueOf(tuple[18]),
                    Double.valueOf(tuple[19]),
                    Double.valueOf(tuple[20]),
                    Double.valueOf(tuple[21]),
                    Double.valueOf(tuple[22]),
                    Double.valueOf(tuple[23]),
                    Double.valueOf(tuple[24]),
                    Double.valueOf(tuple[25])
            		);
            cases.add(rbcCase);
        }
        
        return cases;
    }
    
}
