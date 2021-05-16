/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasMoreEntries()) {
            LogEntry entry = reader.nextEntry();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }
    /**
     * Retorna o número de acessos registrados no log arquivo.
     */
    public int numberOfAccesses(){
        int total = 0;
        //Adiciona o valor em cada elemento de hourCounts ao total.
        for(int hour = 0; hour < hourCounts.length; hour++){
            total += hourCounts[hour];
        }
        return total;
    }
    /**
     * Retorna a hora mais ocupada (A que mais teve logs/acessos)
     */
    public int busiestHour(){
        //variável para armazenar a hora com a maior quantia atual de logs
        int busiestHour = 0;
        //variável para armazenar a maior quantia atual de logs
        int logs = hourCounts[0];
        
        for(int hour = 1; hour < hourCounts.length; hour++){
            if(hourCounts[hour] > logs){
                logs = hourCounts[hour];
                busiestHour = hour;
            }
        }
        return busiestHour;
    }
    /**
     * Retorna a hora menos ocupada (A que menos teve logs/acessos)
     */
    public int quietestHour(){
        //variável para armazenar a hora com a menor quantia atual de logs
        int quietestHour = 0;
        //variável para armazenar a menor quantia atual de logs
        int logs = hourCounts[0];
        for(int hour = 1; hour < hourCounts.length; hour++){
            if(hourCounts[hour] < logs){
                logs = hourCounts[hour];
                quietestHour = hour;
            }
        }
        return quietestHour;
    }
    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        int hour = 0;
        while(hour < hourCounts.length){
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
