// Runtime: 100 ms, faster than 83.55% of Java online submissions for Design Underground System.
// Memory Usage: 56 MB, less than 81.02% of Java online submissions for Design Underground System.

class UndergroundSystem {
    
    Map<Integer, Pair<String, Integer>> checkInTime;
    Map<Pair<String, String>, Integer> tripTotalTime;
    Map<Pair<String, String>, Integer> tripCount;

    public UndergroundSystem() {
        checkInTime = new HashMap<>();
        tripTotalTime = new HashMap<>();
        tripCount = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkInTime.put(id, new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, String> stationPair = new Pair<>(checkInTime.get(id).getKey(), stationName);
        
        int time = tripTotalTime.getOrDefault(stationPair, 0) + (t - checkInTime.get(id).getValue());
        
        tripTotalTime.put(stationPair, time);
        tripCount.put(stationPair, tripCount.getOrDefault(stationPair, 0) + 1);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        Pair<String, String> stationPair = new Pair<>(startStation, endStation);
        return ((double) tripTotalTime.get(stationPair) / tripCount.get(stationPair));
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
