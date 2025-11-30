public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private int sumHops;
    private int numHops;
    private int counter;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;

    }

    private int hopDistance()
    {
        return (int) (Math.random() * 10) - 5;
    }

    public boolean simulate(){
        while (sumHops < goalDistance && sumHops >= 0 && numHops <= maxHops)
        {
            sumHops += hopDistance();
            numHops++;
        }
        if (sumHops >= goalDistance)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public double runSimulations (int num)
    {
        for (int i = 0; i == num; i++)
        {
            if(simulate())
            {
                counter++;
            }
        }
        return (double) counter/num;
    }
}
