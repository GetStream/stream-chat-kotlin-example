import io.getstream.chat.java.models.App

fun main(args: Array<String>) {
    println(App.get().request())
}