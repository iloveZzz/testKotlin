package dmz.demo

class TestFnc {
}
fun testNull(string: Any) : Any? {
    if (string is String){
        return string;
    }else if(string is Int){
        return string;
    }
    return null;
}
fun sum(a:Int,b:Int): Int {
    return a+b;
}
fun sumNoBody(a:Int,b:Int)=a+b
fun testFor(ls:List<String>) {
    for (str in ls){
        println("str:${str}");
    }
}
fun testRange(a: Int){
    val range19 = 1..9;
    if(a in range19){
        println("fits in range")
    }
}
fun main(args: Array<String>){
    val c = sum(1,2);
    println("Hello, $c")
    println("Hello, ${sum(1,4)}")
    println("Hello, ${if (c>2) c else 0}")
    val helloStr = "Hello, ${sumNoBody(1,2)}";
    println(helloStr)
    val a:Int = 1;
    val aa = 1;
    val b:Int;
    b=11;
    println("val ${a} ${aa} ${b}")
    println("testNull ${testNull("asdas")}")

    testFor(listOf("aa","bb","cc"))
    testRange(1)

    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    val cc:(Int,Int)-> Int={x,y->x+y};
    val ccs={x:Int,y:Int->x+y}(1,8)
    println(cc(1,2));
    println(ccs)
    val ints = 1..4;
    val itc = ints.filter{
        val fl = it>2
        return@filter fl
    }
    println(itc)
}
