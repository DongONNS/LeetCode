package letecodePractice.tree;

public class BinarySearchTree2<T extends Comparable> {
    private Node<T> root = null;
    private TreeNode treeNode = null;
    private final boolean isKV;

    public BinarySearchTree2(boolean isKV) {
        this.isKV = isKV;
    }

    public void insert(int key, T val) {
        if (isKV) {
            insertKV(key, val);
        } else {
            throw new ClassCastException("request V ,Not K and V");
        }
    }

    public void insert(int key) {
        if (!isKV) {
            insertVal(key);
        } else {
            throw new ClassCastException("request k and v ");
        }
    }

    private void insertVal(int key) {
        // 如果是空树，则插入的节点为根节点
        if (treeNode == null) {
            treeNode = new TreeNode(key);
            return;
        }
        TreeNode cur = treeNode;
        TreeNode parent = treeNode;
        boolean isLeftNode = true;
        while (cur != null) {//直到找到该插入的位置
            parent = cur;
            if (key < cur.key) { // 如果小于当前节点的值，往左子树查找
                cur = cur.left;
                isLeftNode = true;
            } else { // 如果大于当前节点的值，往右子树查找
                cur = cur.right;
                isLeftNode = false;
            }
        }
        TreeNode newNode = new TreeNode(key);
        if (isLeftNode) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    private void insertKV(int key, T val) {
        // 如果是空树，则插入的节点为根节点
        if (root == null) {
            root = new Node<T>(key, val);
            return;
        }
        Node cur = root;
        Node parent = root;
        boolean isLeftNode = true;
        while (cur != null) {//直到找到该插入的位置
            parent = cur;
            if (key < cur.key) { // 如果小于当前节点的值，往左子树查找
                cur = cur.left;
                isLeftNode = true;
            } else { // 如果大于当前节点的值，往右子树查找
                cur = cur.right;
                isLeftNode = false;
            }
        }
        Node newNode = new Node(key, val);
        if (isLeftNode) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    /**
     * @param key 节点的key值
     * @return 是否成功删除
     */
    public boolean delete(int key) {
        Node cur = root;
        Node parent = root;
        boolean isLeftChild = true;

        /**
         * 找到要删除的节点，并把当前结点定位到要删除的节点
         */
        while (cur.key != key) {
            parent = cur;
            if (key < cur.key) { //如果删除的元素在左子树
                isLeftChild = true;
                cur = cur.left;
            } else { //如果删除的元素在右子树
                isLeftChild = false;
                cur = cur.right;
            }
            if (cur == null) {
                return false;
            }
        }

        /**
         * 删除节点
         */
        if (cur.left == null && cur.right == null) {//当前结点是叶子节点的时候
            if (cur == root) { //是根节点，且根节点没有叶子节点的时候
                root = null; // 树为空树
            } else if (isLeftChild) {// 当前结点是左孩子节点
                parent.left = null; //父节点的左孩子设为空
            } else {// 当前结点是右孩子节点
                parent.right = null;//父节点的左孩子设为空
            }
        } else if (cur.right == null) {//当前结点没有右孩子，只有左孩子
            if (cur == root) { //当前结点为根
                root = cur.left;//左子树上移
            } else if (isLeftChild) { // 当前结点是其父节点的左孩子
                parent.left = cur.left;
            } else { // 当前结点是其父节点的右孩子
                parent.right = cur.left;
            }
        } else if (cur.left == null) {//当前结点没有左孩子，只有右孩子
            if (cur == root) { //当前结点为根
                root = cur.right;//左子树上移
            } else if (isLeftChild) { // 当前结点是其父节点的左孩子
                parent.left = cur.right;
            } else { // 当前结点是其父节点的右孩子
                parent.right = cur.right;
            }
        } else {//当前结点有左孩子，也有右孩子,需要对树进行翻转gi
            Node<T> successor = getSuccessor(cur);
            if (cur == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = cur.left;
        }
        return true;
    }

    /**
     * 将要删除节点为根节点的树
     * 进行旋转操作
     * 策略是找到待删除节点的右子树最小节点替换待删除节点，再递归删除右子树的最小节点
     * @param delNode 要删除的节点
     * @return 旋好的子树
     */
    private Node<T> getSuccessor(Node delNode) {
        Node<T> successorParent = delNode;
        Node<T> successor = delNode;
        Node<T> cur = delNode.right;
        /**
         * 找到我们的待删除节点中的最小
         */
        while (cur != null) {
            successorParent = successor;
            successor = cur;
            //二叉搜索树的最小节点在左子树上;
            cur = cur.left;
        }
        //实现节点的翻转，将继承节点的右子节点设为其父节点的左子节点
        //将继承节点放到待删除节点的位置，他的右子节点为原待删除节点的右子节点
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }


    public void scanPreOrder(BinarySearchTree2 obj) {
        if (obj.isKV == true) {
            scanPreOrder(root);
        } else {
            scanPreOrder(treeNode);
        }
    }

    private void scanPreOrder(Node<T> parentNode) {
        if (parentNode == null) {
            return;
        }
        scanPreOrder(parentNode.left);
        System.out.print(parentNode.key + ":" + parentNode.val + "  ");
        scanPreOrder(parentNode.right);
    }

    private void scanPreOrder(TreeNode parentNode) {
        if (parentNode == null) {
            return;
        }
        scanPreOrder(parentNode.left);
        System.out.print(parentNode.key + "  ");
        scanPreOrder(parentNode.right);
    }
}
