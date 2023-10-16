import java.util.Scanner;
class CricketPlayer{
    String pname;
    int totalRuns,pid;
    int inningsPlayed;
    int notOutTimes;
    double average;

    public CricketPlayer(int pid,String pname, int totalRuns, int inningsPlayed, int notOutTimes) 
    {
        this.pid=pid;
        this.pname=pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
        this.average=(double)totalRuns/(inningsPlayed - notOutTimes);
    }
}
public class slip7a{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF PLAYERS:");
        int n=scanner.nextInt();
        CricketPlayer[] players=new CricketPlayer[n];
        for( int i=0;i<n;i++)
        {
            System.out.println("**enter details**");
            System.out.print("plyaer ID:");
            int pid=scanner.nextInt();
            scanner.nextLine();

            System.out.print("Player Name: ");
            String pname = scanner.nextLine();

            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();

            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();

            System.out.print("Not Out Times: ");
            int notOutTimes = scanner.nextInt();

            players[i]=new CricketPlayer(pid, pname, totalRuns, inningsPlayed, notOutTimes);

        }
        double totalAverage=0;
        double maxAverage=players[0].average;
        int maxIndex=0;
        for (int i = 0; i < n; i++) {
           totalAverage += players[i].average;
           if (players[i].average>maxAverage)
           {
            maxAverage=players[i].average;
            maxIndex=i;
           } 
    }
    double overallAverage=totalAverage/n;
    for(CricketPlayer player:players)
    {
        System.out.println(player.pname+",Player ID:"+ player.pid + ", Average: " + player.average);
    }
    System.out.println("\nOverall Average of all Players: " + overallAverage);
        System.out.println("Player with Maximum Average: " + players[maxIndex].pname);
}
}