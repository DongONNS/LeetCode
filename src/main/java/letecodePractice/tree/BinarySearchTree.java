package letecodePractice.tree;
//
//public class BinarySearchTree {
//    class Node<T extends Comparable >{
//        int key;       //数据域
//        T val;
//        Node<T> right;     //右子树
//        Node<T> left;      //左子树
//        public Node(){}
//        public Node(int key,T val){
//            this.key = key;
//            this.val = val;
//        }
//    }
//
//
//    //插入节点
//    public void insert(int key,T val) {
//        Node p = new Node();
//        p.data = key;
//        // 如果根节点为空，那么就直接将其当作根节点插入
//        if (root == null) {
//            root = p;
//            // 否则需要进一步找到插入位置
//        } else {
//            Node parent = new Node();
//            Node current = root;
//            while (true) {
//                parent = current;
//                if (key > parent.data) {
//                    current = current.right;
//                    if (current == null) {
//                        parent.right = p;
//                        return;
//                    }
//                } else {
//                    current = current.left;
//                    if (current == null) {
//                        parent.left = p;
//                        return;
//                    }
//                }
//            }
//        }
//    }
//    //从树中根据关键值查找节点
//    public Node find(int key2){
//        Node current = root;
//        while(current.data != key2){
//            if (key2 > current.data) current = current.right;
//            else current = current.left;
//            if (current == null) return null;
//        }
//        return current;
//    }
//    //搜索二叉树节点的删除
//    public void deleteKey(int key){
//        if (root == null) return;
//        Node cur = root;
//        Node parent = root;
//        boolean isLeftNode = true;
//        //搜先当当前节点定位到要删除的节点
//        while(cur.data != key){
//            parent = cur;
//            //如果删除的节点在左子树
//            if (key < cur.data){
//                isLeftNode = true;
//                cur = cur.left;
//            //如果删除的节点在右子树
//            }else{
//                isLeftNode = false;
//                cur = cur.right;
//            }
//            if (cur == null) return;
//        }
//        //情况1 待删除的节点是叶子节点
//        if(cur.left == null & cur.right == null){
//            if (cur == root){       //待删除节点是根节点
//                root = null;
//            }else if(isLeftNode){   //待删除节点是左子节点
//                parent.left = null;
//            }else {                 //待删除节点是右子节点
//                parent.right = null;
//            }
//        //情况2 待删除节点含有左子节点
//        }else if (cur.right == null){
//            if (cur == root){
//                root = cur.left;
//            }else if (isLeftNode){
//                parent.left = cur.left;
//            }else {
//                parent.right = cur.left;
//            }
//        //情况3 待删除节点只含有右子节点
//        }else if (cur.left == null){
//            if (cur == root){
//                root = cur.right;
//            }else if (isLeftNode){
//                parent.left = cur.right;
//            }else {
//                parent.right = cur.right;
//            }
//        //情况4 待删除节点既有左子节点又有右子节点
//        }else{
//            Node<T> successor = getSuccessor(cur);
//
//
//        }
//
//
//
//
//
//    }
//
//    /**
//     * 将要删除节点为根节点的树进行旋转操作
//     * @param delNode 待删除的节点
//     * @return  旋转完后的节点
//     */
//    private Node getSuccessor(Node delNode) {
//        Node<T> successorParent = delNode;
//        Node<T> successor = delNode;
//        Node<T> cur = delNode.right;
//        return null;
//    }
//
//    //前序遍历
//    public void preOrder(Node root){
//        if (root != null){
//            System.out.print(root.data+" ");
//            preOrder(root.left);
//            preOrder(root.right);
//        }
//    }
//    //中序遍历
//    public void inOrder(Node root){
//        if (root != null){
//            inOrder(root.left);
//            System.out.print(root.data+" ");
//            inOrder(root.right);
//        }
//    }
//    //后序遍历
//    public void postOrder(Node root){
//        if (root != null){
//            postOrder(root.left);
//            postOrder(root.right);
//            System.out.print(root.data+" ");
//        }
//    }
//
//}



