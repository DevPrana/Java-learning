package graphTheory;

public class floydAlgorithm {
    public static void main(String[] args) {
        // floyd algo
            int INF = 9999; // this is infinity

            int graph[][] = { 
                { 0, 3, INF, 5 }, 
                { 2, 0, INF, 4 }, 
                { INF, 1, 0, INF }, 
                { INF, INF, 2, 0 }
            };
            for (int k = 0; k < graph.length; k++) {
                for (int i = 0; i < graph.length; i++) {
                    for (int j = 0; j < graph.length; j++) {
                        if(graph[i][j] > graph[i][k] + graph[k][j]){
                            graph[i][j] = graph[i][k] + graph[k][j];
                        }
                    }
                }
            }

            // display
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph.length; j++) {
                    if (graph[i][j] == INF) {
                        System.out.printf("INF\t");
                    }
                    System.out.print(graph[i][j] + "    ");
                }
                System.out.println();
            }
    }
    
}
