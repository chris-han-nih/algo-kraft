package 이어붙인수

import chris.이어붙인수.solution
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionKtTest : BehaviorSpec({
 Given("num_list = [4, 3, 2, 1]") {
  val num_list = intArrayOf(4, 3, 2, 1)
  When("solution(num_list)") {
   val answer = solution(num_list)
   Then("return 73") {
    answer shouldBe 73
   }
  }
 }
 Given("num_list = [1, 2]") {
  val num_list = intArrayOf(1, 2)
  When("solution(num_list)") {
   val answer = solution(num_list)
   Then("return 3") {
    answer shouldBe 3
   }
  }
 }
})
