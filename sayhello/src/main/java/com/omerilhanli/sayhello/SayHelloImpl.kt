package com.omerilhanli.sayhello

class SayHelloImpl : SayHello {

    override fun justSay(): String {
        return MESSAGE
    }

    companion object {
        private const val MESSAGE = "Hello New World!"
    }
}