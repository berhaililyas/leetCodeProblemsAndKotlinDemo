//    val notNullText: String = "Definitely not null"
//    val nullableText1: String? = "Might be null"
//    val nullableText2: String? = null
//
//    fun funny(text: String?) {
//        if (text != null)
//            println(text)
//        else
//            println("Nothing to print :(")
//    }
//
//    fun funnier(text: String?) {
//        val toPrint = text ?: "Nothing to print :("
//        println(toPrint)
//    }

//    Elvis operator ?:
//
//    If the expression to the left of ?: is not null, the Elvis operator returns it; otherwise, it returns the expression to the right.
//    Note that the expression on the right-hand side is evaluated only if the left-hand side is null.
//
//    fun loadInfoById(id: String): String? {
//        val item = findItem(id) ?: return null
//        return item.loadInfo() ?: throw Exception("...")
//    }
