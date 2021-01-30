package januray2021Challange

import java.util.*

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 */
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}



class Solution6 {
    val treeMap = hashMapOf<Int, PriorityQueue<Pair<Int,Int>>>()
   class Compare {
       companion object : Comparator<Pair<Int, Int>> {

           override fun compare(a: Pair<Int, Int>, b: Pair<Int, Int>): Int = when {
               a.first != b.first -> a.first-b.first
               else -> a.second-b.second
           }
       }
   }
    fun verticalTraversal(root: TreeNode?): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        bfs(root, 0,0)

       val temp = treeMap.toSortedMap()
        temp.forEach {
            val t= it.value.sortedWith( kotlin.Comparator { o1, o2 ->
                when {
                    o1.first != o2.first -> o1.first-o2.first
                    else -> o1.second-o2.second

                }
            }
            )
            list.add(queueToList(t))
        }
       // print(list)
        return list
    }

    fun queueToList(queue: List<Pair<Int, Int>>): List<Int> {
        val list = mutableListOf<Int>()
        queue.filter {
            list.add(it.second)
        }
        return list
    }
    fun bfs(node: TreeNode?, x: Int,y:Int) {
        if (node == null) return
        if(treeMap[y].isNullOrEmpty()) {
          //  treeMap[y] = PriorityQueue<Pair<Int,Int>>(Compare)
            treeMap[y] = PriorityQueue<Pair<Int,Int>> (kotlin.Comparator { o1, o2 ->
                when {
                    o1.first != o2.first -> o1.first-o2.first
                    else -> o1.second-o2.second

                }
            })
            treeMap[y]?.add(Pair(x,node.`val`))
        }else{
            treeMap[y]?.add(Pair(x,node.`val`))
        }
        bfs(node.left, x + 1,y-1)
        bfs(node.right, x + 1,y+1)
    }
}

fun main() {
    val treeNode = TreeNode(1)
    treeNode.left = TreeNode(2)
    treeNode.right = TreeNode(3)
    treeNode.right!!.left = TreeNode(5)
    treeNode.right!!.right = TreeNode(7)
    treeNode.left!!.left = TreeNode(4)
    treeNode.left!!.right = TreeNode(6)
    val solution6 = Solution6()
    solution6.verticalTraversal(treeNode)

  /*val  a = PriorityQueue<Pair<Int,Int>> { o1, o2 ->
      when {
          o1.first != o2.first -> o1.first-o2.first
          else -> o1.second-o2.second

      }
  }*/
   /* a.add(Pair(0,1))
    a.add(Pair(2,6))
    a.add(Pair(2,5))
   val t= a.sortedWith { o1, o2 ->
        when {
            o1.first != o2.first -> o1.first - o2.first
            else -> o1.second - o2.second

        }
    }
    print(t)*/
}