import java.util.*;

class Edge{
    private Integer father;
    private Integer son;
    public Edge(){}
    public Edge(Integer father, Integer son){
        this.father = father;
        this.son = son;
    }
    public Integer getFather() {
        return father;
    }
    public Integer getSon() {
        return son;
    }
    @Override
    public boolean equals(Object obj) {
        Edge edge = (Edge) obj;
        return this.getFather().equals(edge.getFather()) && this.getSon().equals(edge.getSon()) ;
    }
}

class Node{
    private Integer value;
    private Integer timeStamp;
    private Integer distToRoot;
    public Node(){}
    public Node(Integer value,Integer distToRoot,Integer timeStamp){
        this.value = value;
        this.distToRoot = distToRoot;
        this.timeStamp = timeStamp;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getTimeStamp() {
        return timeStamp;
    }

    public Integer getDistToRoot() {
        return distToRoot;
    }
}
public class test3 {
    private Map<Integer, Boolean> hasFather = new HashMap<>();
    private LinkedHashMap<Integer, Integer> timeStamp = new LinkedHashMap<>();
    private LinkedHashMap<Integer, Integer> distToRoot = new LinkedHashMap<>();
    private Map<Integer, List<Integer>> tree = new HashMap<>();
    private  List<Edge>  numberPairs;

    private List<Edge> edges = new ArrayList<>();

    public test3(List<Edge>  numberPairs){
        this.numberPairs = numberPairs;
    }

    public void numberPairsToTree(){

        Integer tm = 0;

        for (Iterator<Edge> iterator = numberPairs.iterator(); iterator.hasNext();){

            Edge currEdge = iterator.next();
            int father =currEdge.getFather();
            int son =currEdge.getSon();
            if (edges.contains(currEdge)){
                continue;
            }
            edges.add(currEdge);
            if ( !timeStamp.containsKey(father) ){
                timeStamp.put(father,tm);
                tm +=1;
            }
            if ( !timeStamp.containsKey(son)){
                timeStamp.put(son,tm);
                tm +=1;
            }
            hasFather.put(son, true);

            if (!tree.containsKey(father)){
                tree.put(father,new ArrayList<>());
            }

            tree.get(father).add(son);
        }
        int root = -1;
        for (Iterator<Integer> iterator = timeStamp.keySet().iterator();iterator.hasNext();){
            int key = iterator.next();
            if (!hasFather.containsKey(key)){
                root = key;
                break;
            }
        }

        if (root == -1){
            System.out.println("Not a tree");
            return;
        }else {
            int[] res = bfs(root);
            if (res.length == 0){
                System.out.println("Not a tree");
            }else if (res.length < timeStamp.keySet().size()){
                System.out.println("Not a tree");
            }else {
                StringBuffer stringBuffer = new StringBuffer();
                for(int re:res)
                    stringBuffer.append(re+",");
                String s = stringBuffer.toString();
                System.out.println(s.substring(0,s.length()-1));
            }
        }
    }


    public int[] bfs(int root){

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        distToRoot.put(root,0);
        while (queue.size()>0){
            int t = queue.poll();
            for (int ver:tree.get(t)){
                if (distToRoot.containsKey(ver)){
                    System.out.println("Not a tree");
                    return null;
                }
                distToRoot.put(ver, distToRoot.get(t) + 1);
                if (tree.containsKey(ver)){
                    queue.offer(ver);
                }
            }
        }


        List<Node> nodeList = new ArrayList<>();
        for (int node:distToRoot.keySet()){
            nodeList.add(new Node(node,distToRoot.get(node),timeStamp.get(node)));
        }

        Collections.sort(nodeList, new Comparator<Node>() {
            public int compare(Node o1, Node o2) {
                int x = o1.getDistToRoot() - o2.getDistToRoot();
                int y = o1.getTimeStamp() - o2.getTimeStamp();
                if (x==0){
                    return y;
                }
                return x;
            }
        });

        int[] res = new int[nodeList.size()];
        int i = 0;
        for (Node node:nodeList){
            res[i] = node.getValue();
            i++;
        }


        return  res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Edge> numberPairs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            try {
                String[] ss = s.split(",");
                numberPairs.add(new Edge(Integer.valueOf(ss[0]),Integer.valueOf(ss[1])));
            }catch (Exception e){
                i--;
                System.out.println("数据输入格式有问题，请按照以下格式输入：\n 1,2 \n");
            }
            finally {
            }

        }
        test3 numberPairsToTree = new test3(numberPairs);
        numberPairsToTree.numberPairsToTree();
    }
}

