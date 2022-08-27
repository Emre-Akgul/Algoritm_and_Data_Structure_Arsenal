import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Dijkstra
 * 
 * This algorithm takes graph as adjaceny matrix in the data structure int[][].
 * Then calculates shortest path from first vertex to the each vertex in the graph.
 * Algorithm works in both directed and undirected graphs. 
 * Graph can include circles but cannot include negative edge length.
 * 
 * 
 */
public class Dijkstra {

    static int INF = 1000000;
    public static void main(String[] args) throws FileNotFoundException {

        int[][] graph = readIntegerFromFile("graph.txt");

        int numberFrom = 1;

        int[] distances = new int[200];
        boolean[] isFound = new boolean[200];

        for(int i = 0; i < distances.length; i++){
            distances[i] = INF;
        }

        isFound[numberFrom - 1] = true;
        distances[numberFrom - 1] = 0;



        for(int i = 0; i < graph.length - 1; i++){
            int[] minArr = findMin(graph, distances, isFound);
            isFound[minArr[0]] = true;
            distances[minArr[0]] = minArr[1];
            
        }


        printResults(distances,numberFrom);



    
    }

    private static void printResults(int[] distances, int numberFrom) {
        for(int i = 0; i < distances.length; i++){
            System.out.println("Distances from " + numberFrom + " to " + (i + 1) + " is : " + distances[i]);
        }
    }

    public static int[] findMin(int[][] graph, int[] distances, boolean[] isFound){

        int[] res = {0,INF};
        for(int i = 0; i < isFound.length; i++){
            if(isFound[i]){
                for(int j = 0; j < graph[i].length; j++){
                    if(!isFound[j] && graph[i][j] < INF){
                        int[] current = {j,distances[i] + graph[i][j]};
                        if(current[1] < res[1]){
                            res = current;
                        }
                    }
                }
            }            
        }

        return res;

    }



    public static void printGraph(int[][] arrs){
        
        for(int[] arr : arrs){
            System.out.println(Arrays.toString(arr));
        }

    }
    
    
    
    public static int[][] readIntegerFromFile(String fileName){
        int[][] result = new int[200][200];
        for(int i = 0; i < result.length ; i++){
            for(int j = 0; j < result[0].length ; j++){
                result[i][j] = INF;
            }
        }


        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int count = 0;
            while (myReader.hasNext()) {
                String str = myReader.next();
                
                if(isNumeric(str)){
                    count = Integer.parseInt(str) - 1;
                }
                else{
                    result[count][Integer.parseInt(str.substring(0,str.indexOf(",")))-1] = Integer.parseInt(str.substring(str.indexOf(",")+1));
                }


            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("Aga dosya yok");
        }
        return result;

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}