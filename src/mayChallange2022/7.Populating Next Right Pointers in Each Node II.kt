package mayChallange2022

import java.util.LinkedList


class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}

/*
class Solution7 {
    fun connect(root: Node?): Node? {
           if(root == null) return root
        val q = LinkedList<Node>()
        q.add(root)
         while(q.isNotEmpty()){
             val node = q.poll()
             while(){
                 q.add(node.left)
             }
         }
    }
}*/
