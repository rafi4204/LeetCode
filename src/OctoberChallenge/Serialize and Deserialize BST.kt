
package OctoberChallenge
/*
import java.lang.Integer.max
import java.lang.StrictMath.abs
import java.util.concurrent.CopyOnWriteArrayList


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Codec() {
    // Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        if(root==null) return ""
        var res=""
      val value=recur2(root)
        return (root?.`val`.toString()+" "+value)



    }
    private fun recur2 (root : TreeNode?):String{
        if(root==null) return ""
        var res=""
        if(root.left!=null){
            res= root.left?.`val`.toString()+" "
        }
        else
            res="null "
        if(root.right!=null){
            res+= root.right?.`val`.toString()+" "
        }
        else
            res+="null "
        return res+recur2(root.left)+recur2(root.right)
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val arr=data.split(",")
        var ar = arrayListOf<String>()
        arr.forEach {
            ar.add(it)
        }
        for( i in ar.size-1 downTo  0){
            if(ar[i]=="null" || ar[i].trim(' ')=="")
                ar.remove(ar[i])
        }
        return if(ar.isEmpty()) {
            val root:TreeNode?=null
            root
        } else {

            var root = TreeNode(ar[0].toInt())
            println(ar)
            recur(ar,1,root)
            recur(ar,2,root)
            root
        }

    }

    fun maxProduct(nums: IntArray): Int {
        var mx : Int= -2147483647.toInt()
        var mn=2147483647.toInt()
        nums.sort()
        var num = CopyOnWriteArrayList<Int>()
        var num2= CopyOnWriteArrayList<Int>()
        num.add(nums.first())
        num2.add(nums.first())
        if(mx<nums.first())
            mx=nums.first()
        for(i in 1 until nums.size){
            num.add(Math.max(num[i-1]*nums[i],Math.max(num2[i-1]*nums[i],nums[i])))
            num2.add(Math.min(num2[i-1]*nums[i],nums[i]))

            if(Math.max(num[i-1]*nums[i],Math.max(num2[i-1]*nums[i],nums[i]))>mx)
                mx=Math.max(num[i-1]*nums[i],Math.max(num2[i-1]*nums[i],nums[i]))


        }

        return mx
    }


    private fun recur(ar: List<String>, i: Int, root: TreeNode?) {
        if(i>=ar.size||ar[i]=="null")
            return
        if(i%2==0)
            root?.right= TreeNode(ar[i].toInt())
        else
            root?.left= TreeNode(ar[i].toInt())
        println(i.toString() + " "+ar[i]+" "+root)
        recur(ar,2*i+1, root?.left)
        recur(ar,2*i+2, root?.right)

    }
}

fun main() {
    val ser = Codec()
    val deser = Codec()
    val root = TreeNode(null)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    val tree: String = ser.serialize(root)
    val ans = deser.deserialize(tree)
    println("[${ans?.left?.`val`},${ans?.`val`},${ans?.right?.`val`}]")
}
*/
/**
 * Your Codec object will be instantiated and called as such:
 * val ser = Codec()
 * val deser = Codec()
 * val tree: String = ser.serialize(root)
 * val ans = deser.deserialize(tree)
 * return ans
 */
