fun main() {

    // <<< 𝗧𝗥𝗔𝗡𝗦𝗙𝗢𝗥𝗠𝗔𝗧𝗜𝗢𝗡𝗦 >>>

    // 𝗺𝗮𝗽: Changes each item in a collection into something else
    println(
        listOf(1, 2, 3, 4).map { it * 2 }
    )
    println(
        listOf(1, null, 3, 4).mapNotNull { it }
    )

    println(
        listOf(1, 2, 3, 4).mapIndexed { index, value -> value * index }
    )

    println(
        listOf(
            listOf(1, 3, 5, 7),
            listOf(2, 4, 6, 8)
        ).flatMap { it.map { it * 2 } }
    )
    println(
        listOf(
            listOf(1, 3, 5, 7),
            listOf(2, 4, 6, 8)
        ).flatMapIndexed { index, numbers -> numbers.map { it + index } }
    )
    // <<< 𝗧𝗥𝗔𝗡𝗦𝗙𝗢𝗥𝗠𝗔𝗧𝗜𝗢𝗡𝗦 >>>

    // <<< 𝗙𝗜𝗟𝗧𝗘𝗥𝗦 >>>

    println(
        listOf(1, 2, 3, 4).filter { it % 2 == 0 }
    )

    println(
        listOf(1, 2, 3, 4).filterNot { it % 2 == 0 }
    )

    println(
        listOfNotNull(1, 2, null, 4)
    )

    val any: List<Any?> = listOf("Apple", "Grap", 1, 55, null)
    println(any.filterIsInstance<String>())

    // <<< 𝗙𝗜𝗟𝗧𝗘𝗥𝗦 >>>

    // 𝗮𝗹𝗹: Checks if every item meets a condition

    println(listOf(1, 2, 3).all { it == 1 })
    println(listOf(1, 1, 1).all { it == 1 })

    // 𝗮𝗻𝘆: Checks if at least one item meets a condition
    println(listOf(1, 2, 3).any { it == 1 })

    // 𝗻𝗼𝗻𝗲: Checks if no items meet a condition
    println(listOf(1, 2, 3).none { it == 1 })
    println(listOf(4, 2, 3).none { it == 1 })

    // 𝗰𝗼𝘂𝗻𝘁: Counts how many items meet a condition
    println(listOf(1, 2, 3).count { it == 1 })


    // 𝗿𝗲𝗱𝘂𝗰𝗲: Combines all the items into a single result using a specific operation
    println(
        listOf(1, 2, 3, 4, 5).reduce { acc, value -> acc + value }
    )


    // 𝗳𝗼𝗹𝗱: Combines all items into one result, starting with an initial value you provide

    println(
        listOf(1, 2, 3, 4, 5).fold(100) { acc, value -> acc + value }
    )
}












