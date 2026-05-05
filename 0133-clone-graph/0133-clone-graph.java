/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        return clone(node, new HashMap<>());
    }
    Node clone(Node n, Map<Node, Node> m){
        if(n == null) return null;
        if(m.containsKey(n)) return m.get(n);
        Node c = new Node(n.val);
        m.put(n,c);
        for(Node neig: n.neighbors)
            c.neighbors.add(clone(neig, m));
        return c;
    }
}