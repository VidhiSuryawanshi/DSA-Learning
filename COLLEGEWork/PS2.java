// // PS1: In an undirected graph with n nodes and a list of edges, determine if there is a path between two given nodes start and end.

// // Sample:
// // n=6
// // edges = {(0,1),(0,2),(3,5),(5,4),(4,3)}
// // start = 0
// // end = 5

// // Output: false


// import java.util.*;

// public class PS1 {
//     public static boolean validPath(int n, int[][] edges, int start, int end) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

//         for(int[] edge : edges) {
//             adj.get(edge[0]).add(edge[1]);
//             adj.get(edge[1]).add(edge[0]);
//         }

//         boolean[] visited = new boolean[n];
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(start);
//         visited[start] = true;

//         while(!queue.isEmpty()) {
//             int node = queue.poll();
//             if(node == end) return true;
//             for(int neighbor : adj.get(node)) {
//                 if(!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     queue.add(neighbor);
//                 }
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         int n = 6;
//         int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
//         int start = 0, end = 5;
//         System.out.println(validPath(n, edges, start, end));
//     }
// }






// // PS2: In an undirected graph with n nodes and a list of edges, and a starting node start, return all nodes that are exactly k edges away from the starting node. the result can be returned in any order.

// // Sample:
// // n=6
// // edges = {(0,1),(0,2),(1,3),(2,4),(2,5)}
// // start = 0
// // k=2

// // output: [3,4,5]



// import java.util.*;

// public class PS2 {
//     public static List<Integer> nodesAtDistanceK(int n, int[][] edges, int start, int k) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

//         for(int[] edge : edges) {
//             adj.get(edge[0]).add(edge[1]);
//             adj.get(edge[1]).add(edge[0]);
//         }

//         Queue<Integer> queue = new LinkedList<>();
//         boolean[] visited = new boolean[n];
//         queue.add(start);
//         visited[start] = true;

//         int level = 0;
//         while(!queue.isEmpty() && level < k) {
//             int size = queue.size();
//             for(int i = 0; i < size; i++) {
//                 int node = queue.poll();
//                 for(int neighbor : adj.get(node)) {
//                     if(!visited[neighbor]) {
//                         visited[neighbor] = true;
//                         queue.add(neighbor);
//                     }
//                 }
//             }
//             level++;
//         }

//         return new ArrayList<>(queue);
//     }

//     public static void main(String[] args) {
//         int n = 6;
//         int[][] edges = {{0,1},{0,2},{1,3},{2,4},{2,5}};
//         int start = 0, k = 2;
//         System.out.println(nodesAtDistanceK(n, edges, start, k)); // Output: [3, 4, 5]
//     }
// }
