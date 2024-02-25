package chris.이어붙인수

fun solution(num_list: IntArray): Int {
  val even = num_list.filter { it % 2 == 0 }.joinToString("") { it.toString() }.toInt()
  val odd = num_list.filter { it % 2 != 0 }.joinToString("") { it.toString() }.toInt()
  
  val answer: Int = even + odd
  return answer
}
