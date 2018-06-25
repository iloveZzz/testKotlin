package dmz.demo
data class User(val name:String,var age:Int,var sex:Char)
fun main(args: Array<String>) {
    val user = User("朱道明",28,'男')
}