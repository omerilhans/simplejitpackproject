package com.omerilhanli.simplejitpacksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omerilhanli.sayhello.SayHello
import com.omerilhanli.sayhello.SayHelloImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var sayHello: SayHello

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sayHello = SayHelloImpl()
    }

    fun justSay(v: View) {
        text_view.text = sayHello.justSay()
    }
}
