package chapter3;

import java.util.ArrayList;

public class SequentialSearchSST<Key,Value> {
    private Node first;
    private class Node{
        //链表节点的定义
        Key  key;
        Value val;
        Node next;

        public Node(Key key,Value val,Node node){
            this.key  = key;
            this.val = val;
            this.next = next;
        }
    }
    public Value getKey(Key key){
        //查给给定的键，返回其相关联的值
        for (Node x = first;x!=null;x = x.next)
            if(key.equals(x.key))
                return x.val; //命中
            return null;      //未命中
    }
    public void putKey(Key key,Value val){
        //查找给定的键，如果存在则更行其值，如果不存在，则在链表中新建节点
        for (Node x = first;x!=null;x = x.next)
            if (key.equals(x.key)){
                x.val=val;    //若命中，则直接将节点值进行更行
                return;
            }
        first = new Node(key,val,first);  //若未命中，则新建一个节点
    }
    public int size(){
        int count = 0;
        for (Node x = first;x!=null;x=x.next){
            count++;
        }
        return count;
    }
    public ArrayList<Key> keys(){
        //返回链表所有节点的键集
        ArrayList<Key> list = new ArrayList<Key>();
        for (Node x = first;x!=null;x=x.next){
            list.add(x.key);
        }
        return list;
    }
    public void delete(Key key){
        //判断头节点是否是要删除的节点，如果不是则直接跳出循环，如果是则那么就头节点删除掉；
        while(first != null){
            if (first.key == key) break;
            first = first.next;
        }
        //如果走到这一步来了，那说明头节点不是我们要删除的节点，那么设置一个节点用于记录当前节点的前节点，
        //方便更好的实现删除操作
        Node cur = first;
        Node pre = first;
        while(cur!=null){
            if (cur.key == key){
                    pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
    }



}
