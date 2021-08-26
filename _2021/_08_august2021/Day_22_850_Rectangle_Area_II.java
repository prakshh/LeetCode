public class Day_22_850_Rectangle_Area_II {

    class Solution {
        class Point {
            int x, y, count; // count used for vertical merge sort
            Point(int x, int y, int count) {
                this.x = x;
                this.y = y;
                this.count = count;
            }
        }
        public int rectangleArea(int[][] rectangles) {
            int mod = 1000000007;
            PriorityQueue<Point> pq = new PriorityQueue<>((a, b) -> (a.x == b.x) ? b.y - a.y : a.x - b.x);
            for (int[] r : rectangles) {
                pq.offer(new Point(r[0], r[1], 1));
                pq.offer(new Point(r[0], r[3], -1));
                pq.offer(new Point(r[2], r[1], -1));
                pq.offer(new Point(r[2], r[3], 1));
            }
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int preX = 0, preY = 0, result = 0;

            // O(n)
            while (!pq.isEmpty()) {
                Point p = pq.peek();
                while (!pq.isEmpty() && pq.peek().x == p.x) {
                    p = pq.poll();
                    map.put(p.y, map.getOrDefault(p.y, 0) + p.count);
                }
                // preX/preY=0 initialy; wait till 2nd cycle, because we ewant `p.x` to reference next x
                result += ((long)preY * (p.x - preX)) % mod;
                result %= mod;
                preY = calcHeightDiff(map);
                preX = p.x;
            }

            return result;
        }

        // Use TreeMap sort entry <Y-coordinate, count> by key by natrual order of Y-coordinate
        // merge interval vertically and produce a height
        // WHY not using a PQ to hold? The y values stays in map until later use; PQ will consume and drop the record.
        // O(nlogn)
        private int calcHeightDiff(TreeMap<Integer, Integer> map) {
            int height = 0, pre = 0, count = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (count > 0) height += e.getKey() - pre;
                count += e.getValue();
                pre = e.getKey();
            }
            return height;
        }
    }

}