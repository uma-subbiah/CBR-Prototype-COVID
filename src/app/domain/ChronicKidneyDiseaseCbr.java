package app.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChronicKidneyDiseaseCbr 
{

    private List<Case> baseCases;
    
    public ChronicKidneyDiseaseCbr() 
    {
        baseCases = null;
    }
   
    public void loadBaseCases() throws IOException
    {
        if (null == baseCases)
        {
            baseCases = new Database().load();
        }
    }
    
    public List<CaseSimilarity> process(Case newCase, CaseAttributeWeight weight) throws IOException
    {        
        loadBaseCases();
        
        List<CaseSimilarity> similarCases = new ArrayList<>();
        baseCases.stream().forEach((baseCase) ->
        {
            similarCases.add(calculateCaseSimilaty(newCase, baseCase, weight));
        });
        
        Collections.sort(similarCases, (c1, c2) ->
        {
            return c1.getSimilarity() >= c2.getSimilarity() ? -1 : 1;
        });
        
        return similarCases;
    }
    
    private CaseSimilarity calculateCaseSimilaty(Case newCase, Case baseCase, CaseAttributeWeight weight)
    {
        double nearestNeighboorCalc = 0.0;
        
        nearestNeighboorCalc += weight.getId() * calculateAttributeSimilarity(baseCase.getId(), newCase.getId(), 0, 399);
        nearestNeighboorCalc += weight.getAge() * calculateAttributeSimilarity(baseCase.getAge(), newCase.getAge(), 2, 90);
        nearestNeighboorCalc += weight.getBp() * calculateAttributeSimilarity(baseCase.getBp(), newCase.getBp(), 50, 180);
        nearestNeighboorCalc += weight.getSg() * calculateAttributeSimilarity(baseCase.getSg(), newCase.getSg(), 1.005, 1.025);
        nearestNeighboorCalc += weight.getAl() * calculateAttributeSimilarity(baseCase.getAl(), newCase.getAl(), 0, 5);
        nearestNeighboorCalc += weight.getSu() * calculateAttributeSimilarity(baseCase.getSu(), newCase.getSu(), 0, 5);
        nearestNeighboorCalc += weight.getRbc() * calculateAttributeSimilarity(baseCase.getRbc(), newCase.getRbc(), 0, 1);
        nearestNeighboorCalc += weight.getPc() * calculateAttributeSimilarity(baseCase.getPc(), newCase.getPc(), 0, 1);
        nearestNeighboorCalc += weight.getPcc() * calculateAttributeSimilarity(baseCase.getPcc(), newCase.getPcc(), 0, 1);
        nearestNeighboorCalc += weight.getBa() * calculateAttributeSimilarity(baseCase.getBa(), newCase.getBa(), 0, 1);
        nearestNeighboorCalc += weight.getBgr() * calculateAttributeSimilarity(baseCase.getBgr(), newCase.getBgr(), 22, 490);
        nearestNeighboorCalc += weight.getBu() * calculateAttributeSimilarity(baseCase.getBu(), newCase.getBu(), 1.5, 391);
        nearestNeighboorCalc += weight.getSc() * calculateAttributeSimilarity(baseCase.getSc(), newCase.getSc(), 0.4, 76);
        nearestNeighboorCalc += weight.getSod() * calculateAttributeSimilarity(baseCase.getSod(), newCase.getSod(), 4.5, 163);
        nearestNeighboorCalc += weight.getPot() * calculateAttributeSimilarity(baseCase.getPot(), newCase.getPot(), 2.5, 47);
        nearestNeighboorCalc += weight.getHemo() * calculateAttributeSimilarity(baseCase.getHemo(), newCase.getHemo(), 3.1, 17.8);
        nearestNeighboorCalc += weight.getPcv() * calculateAttributeSimilarity(baseCase.getPcv(), newCase.getPcv(), 9, 54);
        nearestNeighboorCalc += weight.getWc() * calculateAttributeSimilarity(baseCase.getWc(), newCase.getWc(), 2200, 26400);
        nearestNeighboorCalc += weight.getRc() * calculateAttributeSimilarity(baseCase.getRc(), newCase.getRc(), 2.1, 8);
        nearestNeighboorCalc += weight.getHtm() * calculateAttributeSimilarity(baseCase.getHtm(), newCase.getHtm(), 0, 1);
        nearestNeighboorCalc += weight.getDm() * calculateAttributeSimilarity(baseCase.getDm(), newCase.getDm(), 0, 1);
        nearestNeighboorCalc += weight.getCad() * calculateAttributeSimilarity(baseCase.getCad(), newCase.getCad(), 0, 1);
        nearestNeighboorCalc += weight.getAppet() * calculateAttributeSimilarity(baseCase.getAppet(), newCase.getAppet(), 0, 1);
        nearestNeighboorCalc += weight.getPe() * calculateAttributeSimilarity(baseCase.getPe(), newCase.getPe(),0, 1);
        nearestNeighboorCalc += weight.getAne() * calculateAttributeSimilarity(baseCase.getAne(), newCase.getAne(), 0, 1);
        
        return new CaseSimilarity(baseCase, nearestNeighboorCalc / weight.getTotal());
    }
    
    private double calculateAttributeSimilarity(double baseCaseAttributeValue, double newCaseAttributeValue,
    		double minValue,double maxValue
    		)
    {
    		
        return 1.0 - Math.abs(baseCaseAttributeValue - newCaseAttributeValue) / (maxValue - minValue);
    }
    
}
