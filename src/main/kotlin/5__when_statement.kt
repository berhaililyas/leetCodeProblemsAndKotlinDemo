//    when (x) {
//        1 -> print("x == 1")
//        2 -> print("x == 2")
//        else -> {
//            print("x is neither 1 nor 2")
//        }
//    }
//
//    when returns, the same way that if does.
//
//    =====>
//
//    when {
//        x < 0 -> print("x < 0")
//        x > 0 -> print("x > 0")
//        else -> {
//            print("x == 0")
//        }
//    }
//
//    The condition can be inside of the branches.
//
//    ====================================================
//
//    fun serveTeaTo(customer: Customer) {
//        val teaSack = takeRandomTeaSack()
//
//        when (teaSack) {
//            is OolongSack -> error("We don't serve Chinese tea like $teaSack!")
//            in trialTeaSacks, teaSackBoughtLastNight ->
//                error("Are you insane?! We cannot serve uncertified tea!")
//        }
//
//        teaPackage.brew().serveTo(customer)
//    }
//
//    when can accept several options in one branch. else branch can be omitted if when block is used as a statement.

fun main() {
    println("======When statement========")
}