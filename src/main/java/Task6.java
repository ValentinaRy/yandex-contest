import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Task6 {
    private static class City {
        final int x;
        final int y;
        int minReachableRoads;
        public City(int x, int y, int max) {
            this.x = x;
            this.y = y;
            minReachableRoads = max;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 15);
        int n = Integer.parseInt(reader.readLine());
        int maxRoads = n + 5;
        City[] cities = new City[n];
        for (int i=0; i<n; i++) {
            String s = reader.readLine();
            String[] xy = s.split(" ");
            int cityX = Integer.parseInt(xy[0]);
            int cityY = Integer.parseInt(xy[1]);
            City city = new City(cityX, cityY, maxRoads);
            cities[i] = city;
        }
        int k = Integer.parseInt(reader.readLine()); // max length
        String s = reader.readLine();
        String[] xy = s.split(" ");
        int startCity = Integer.parseInt(xy[0]);
        int endCity = Integer.parseInt(xy[1]);
        reader.close();
        PriorityQueue<Integer> queue = new PriorityQueue<>(n, Comparator.comparingInt(id -> cities[id].minReachableRoads));
        System.out.println(possibleToTravel(cities, startCity - 1, endCity - 1, k, queue, maxRoads));
    }

    private static int possibleToTravel(City[] cities, int startCity, int endCity, int lengthLimit, PriorityQueue<Integer> queue, int maxRoads) {
        cities[startCity].minReachableRoads = 0;
        queue.add(startCity);
        while (!queue.isEmpty()) possibleToTravelRecursive(cities, lengthLimit, queue);
        if (cities[endCity].minReachableRoads == maxRoads) return -1;
        else return cities[endCity].minReachableRoads;
    }

    private static void possibleToTravelRecursive(City[] cities, int lengthLimit, PriorityQueue<Integer> queue) {
        int min = queue.poll();
        int curMin = cities[min].minReachableRoads + 1;
        for (int i=0; i<cities.length; i++) {
            if (i != min && reachable(cities, min, i, lengthLimit) && curMin < cities[i].minReachableRoads) {
                cities[i].minReachableRoads = curMin;
                queue.remove(i);
                queue.add(i);
            }
        }
    }

    private static boolean reachable(City[] cities, int start, int end, int lengthLimit) {
        int distance = Math.abs(cities[start].x - cities[end].x) + Math.abs(cities[start].y - cities[end].y);
        return distance <= lengthLimit;
    }
}
