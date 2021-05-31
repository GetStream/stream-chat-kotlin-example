import io.getstream.models.App

fun main(args: Array<String>) {
    println(App.get().request())
}