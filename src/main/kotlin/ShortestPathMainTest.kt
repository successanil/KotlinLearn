
data class StringNode(val s: String) : Node

fun main() {
    val graph = listOf(
        Edge(StringNode("a"), StringNode("b"), 4),
        Edge(StringNode("a"), StringNode("c"), 2),
        Edge(StringNode("b"), StringNode("c"), 3),
        Edge(StringNode("c"), StringNode("b"), 1),
        Edge(StringNode("c"), StringNode("d"), 5),
        Edge(StringNode("b"), StringNode("d"), 1),
        Edge(StringNode("a"), StringNode("e"), 1),
        Edge(StringNode("e"), StringNode("d"), 4)
    )
    val result = findShortestPath(graph, StringNode("a"), StringNode("d"))

    println(result.shortestPath())

}