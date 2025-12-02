public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private int counter;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        return (int) (Math.random() * 100) - 50;
    }

    public boolean simulate(){
        int sumHops = 0;
        int numHops = 0;
        while (sumHops < goalDistance && sumHops >= 0 && numHops < maxHops)
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
        counter = 0;
        for (int i = 0; i < num; i++)
        {
            if(simulate())
            {
                counter++;
            }
        }
        return (double) counter / num;
    }
}
