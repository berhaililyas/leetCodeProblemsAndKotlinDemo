//    =========== Safe Calls =====================
//
//    someThing?.otherThing does not throw an NPE if someThing is null.
//
//    Safe calls are useful in chains.
//    For example, an employee may be assigned to a department (or not).
//    That department may in turn have another employee as a department head,
//    who may or may not have a name, which we want to print:
//
//    fun printDepartmentHead(employee: Employee) {
//        println(employee.department?.head?.name)
//    }
//
//    To print only for non-null values, you can use the safe call operator together with let:
//
//    employee.department?.head?.name?.let { println(it) }
//
//    =========== Unsafe Calls =====================
//
//    The not-null assertion operator (!!) converts any value to a non-null type
//    and throws an NPE exception if the value is null.
//
//    fun printDepartmentHead(employee: Employee) {
//        println(employee.department!!.head!!.name!!)
//    }
//
//    Please, avoid using unsafe calls!
