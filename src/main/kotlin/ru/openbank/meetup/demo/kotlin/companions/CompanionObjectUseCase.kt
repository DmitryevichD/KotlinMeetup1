package ru.openbank.meetup.demo.kotlin.companions

class TheUseCase {

    companion object {
        private const val REAL_IP_HEADER_NAME = "X-Real-IP"
        const val ROOT_PATH = "/api/public/universal-application"

        @ClassRule
        @JvmField
        var wireMockRule = WireMockRule(9056)
    }
}

// from Kotlin official documentation
interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object TheObject : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}

fun doSomething() = TheUseCase.ROOT_PATH
fun doSomethingToo() = MyClass.TheObject.create()
fun doSomethingSame() = MyClass.create()
