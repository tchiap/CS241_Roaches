/**
 *  Name: Stuart Hansen
 *  Course: CSCI 241 - Computer Science I
 *  Section: 001 or 002
 *  Assignment Number: 5
 *
 *  Project/Class Description
 *     This class tests the Cockroach population class
 *
 *  Known Bugs:
 *     A few cockroaches, but nothing else
 */
public class TestCockroachPopulation
{
    public static void main (String [ ] args)
    {
        CockroachPopulation roaches = new CockroachPopulation(1000);
        
        System.out.println ("Current roach population: " + roaches.getCockroachCount());
        
        roaches.applyTypeA();
        
        System.out.println ("Current roach population: " + roaches.getCockroachCount());
        
        roaches.applyTypeB();
        roaches.applyTypeB();

        System.out.println ("Current roach population: " + roaches.getCockroachCount());
        
        roaches.nuclearWar();
        
        System.out.println ("Current roach population: " + roaches.getCockroachCount());

        roaches.growPopulation();
        roaches.growPopulation();
        roaches.growPopulation();
        roaches.growPopulation();

        System.out.println("Roach population 4 months after nuclear war: " + roaches.getCockroachCount());
    }
}
