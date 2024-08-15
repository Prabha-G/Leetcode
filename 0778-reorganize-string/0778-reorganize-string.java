class Solution {
    public String reorganizeString(String s) {
        int hash[] = new int[26];
        for (char c : s.toCharArray()) {
            hash[c - 'a']++ ;
        }

        int sz = s.length();
        Comparator<Integer> comp = (a, b) -> hash[b] - hash[a];
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);

        for (int i = 0; i < 26; i++) {
            if (hash[i] > (sz + 1) / 2) {
                return "";
            }
            if (hash[i] > 0) {
                pq.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (pq.size() >= 2) {
            int id1 = pq.poll();
            int id2 = pq.poll();
            char c1 = (char) (id1 + 'a');
            char c2 = (char) (id2 + 'a');
            sb.append(c1);
            sb.append(c2);
            hash[id1]--;
            hash[id2]--;
            if (hash[id1] > 0) {
                pq.add(id1);
            }
            if (hash[id2] > 0) {
                pq.add(id2);
            }
        }

        if (pq.size() > 0) {
            int id = pq.poll();
            sb.append((char) (id + 'a'));
        }

        return sb.toString();
    }
}
