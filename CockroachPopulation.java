/**
 * Tom Chiapete
 * October 25, 2005
 * Section 1 - CSCI 241
 * 
 * Class Description
 * This class keeps track of a cockroach population.
 * Methods can grow the population, eradicating percentages of
 * the population using insecticide, results after a nuclear war.
 * 
 * Known Bugs:  None that I'm aware of.
 * Matches results from TestCockroachPopulation class.
 * 
 */

public class CockroachPopulation
{

    private int population;  // Total Cockroach Population
    private int typeBTimesApplied; // Number of times type B
                                   // is applied
    
    // A constant which is the initial decrement percentage
    private static final double INI_DECREMENT_PERCENT = .10;
    
    /**
     * CockroachPopulation() constructor
     * Set the population instance variable to whatever was in 
     * the population parameter.
     * Set the initial value of typeBTimesApplied to 0.
     */
    public CockroachPopulation(int population)
    {
        this.population = population;
        typeBTimesApplied = 0;
    }
    
    /**
     * getCockroachCount() method
     * Returns the value of population. (int)
     */
    public int getCockroachCount()
    {
        return population;   
    }
    
    /**
     * growPopulation() method
     * Grows the population by multiplying the current 
     * population by 16.
     */
    public void growPopulation()
    {
        population = population * 16;
    }
    
    /**
     * applyTypeA() method
     * Eradicate half the population by using Type A insecticide.
     * If population prior to using Type A is even, divide by 2.
     * If population prior to using Type A is odd, divide by 2 
     * and add 1.
     */
    public void applyTypeA()
    {
        if(population % 2 == 0)
            population = population / 2;
        else
            population = population / 2 + 1;
    }
    
    /**
     * applyTypeB() method
     * Eradicate 90% of the population by using Type B insecticide 
     * the first time, 80% the second time, 70% the third, and 
     * so on.
     * If population prior to using Type B is even, calculate 
     * normally.
     * If population prior to using Type B is odd, calculate, 
     * then add 1.
     * This method doesn't return anything.
     * 
     */
    public void applyTypeB()
    {
        // Local variable effectivePercentage
        // Calculated by taking .9 minus the value of 
        // .1 times the times type B has been applied.
        double effectivePercentage = .9 - 
            (INI_DECREMENT_PERCENT * typeBTimesApplied);
        
        // If population is even, take the population minus the
        // value of population times effectivePercentage.
        if (population % 2 == 0)
        {
            population = population - (int)(population * 
                effectivePercentage);
        }
        
        // If population is odd, take the population minus the 
        // value of population times effectivePercentage plus 1.
        else
        {
            population = population - (int)(population * 
                effectivePercentage)+1;
        }
        typeBTimesApplied++; // increment typeBTimesApplied
    }

    /**
     * nuclearWar() method
     * Sets the population after a nuclear war.
     * If the population is currently 0, the population stays 0.
     * If the population is anything other than 0, 
     * the population is 2.
     */
    public void nuclearWar()
    {
        if(population != 0)   
            population = 2;   
    }
}
