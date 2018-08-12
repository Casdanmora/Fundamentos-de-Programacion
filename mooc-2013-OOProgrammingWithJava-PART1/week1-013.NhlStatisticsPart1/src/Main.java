
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner (System.in);
        
        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 players based on penalty amount");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics for Sydney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Statistics for Philadelphia Flyers");   
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        System.out.println("Statistics for Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
    }
    
  
    
    
    
    
//NHLStatistics.sortByPoints();     // orders the players by points
//NHLStatistics.sortByGoals();      // orders the players by goals
//NHLStatistics.sortByAssists();    // orders the players by assists
//NHLStatistics.sortByPenalties();  // orders the players by penalty minutes 
    
//NHLStatistics.searchByPlayer("Jaromir Jagr");  // prints stats of Jaromir Jagr
//NHLStatistics.searchByPlayer("Koivu");         // prints stats of Mikko Koivu and Saku Koivu
//NHLStatistics.searchByPlayer("Teemu");         // prints stats of all players named Teemu
    
//Print the top ten players based on goals
//Print the top 25 players based on penalty amounts
//Print the statistics for Sidney Crosby
//Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
//Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
    
}
