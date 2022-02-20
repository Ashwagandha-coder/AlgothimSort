/*fun main() {

    var sort: QuickSort = QuickSort()
    println(sort.quick_sort(sort.massive))
}

class QuickSort {

    public var massive = listOf(10,2,5,7,9,3,6,1,0)

    get() {
        return this.massive

    }

    fun quick_sort(massive: List<Int>): List<Int> {


        var pivot = massive[massive.count()/2]

        if (massive.size == 0)
            return massive
        val equals = massive.filter { it == pivot }
        val left = massive.filter { it < pivot }
        val right = massive.filter { it > pivot }

        return quick_sort(left) + equals + quick_sort(right)


    }
}

 */
fun quicksort(items:List<Int>):List<Int>{
    if (items.count() < 2){
        return items
    }
    val pivot = items[items.count()/2]

    val equal = items.filter { it == pivot }


    val less = items.filter { it < pivot }


    val greater = items.filter { it > pivot }


    return quicksort(less) + equal + quicksort(greater)
}
fun main(args: Array<String>) {

    val numbers = listOf<Int>(2, 4, 7, 3, 6, 9, 5, 1, 0)
    println(numbers)

    val ordered =  quicksort(numbers)
    println(ordered)
}