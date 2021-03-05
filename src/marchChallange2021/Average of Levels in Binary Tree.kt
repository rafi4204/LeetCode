package marchChallange2021

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution5 {
    val map1 = hashMapOf<Long, Long>()
    val map2 = hashMapOf<Long, Long>()
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val result = arrayListOf<Double>()
        traverseTree(root, 1)
        map1.forEach {
            result.add(1.0 * it.value / map2[it.key]!!)
        }
        return result.toDoubleArray()
    }

    private fun traverseTree(node: TreeNode?, i: Int) {
        if (node == null) return
        if (map1[i.toLong()] == null)
            map1[i.toLong()] = node.`val`.toLong()
        else
            map1[i.toLong()] = map1[i.toLong()]!! + node.`val`
        if (map2[i.toLong()] == null)
            map2[i.toLong()] = 1
        else
            map2[i.toLong()] = map2[i.toLong()]!! + 1
        traverseTree(node.left, i + 1)
        traverseTree(node.right, i + 1)
    }
}