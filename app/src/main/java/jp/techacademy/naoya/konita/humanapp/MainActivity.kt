package jp.techacademy.naoya.konita.humanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro = Human("太郎", 30, "サイクリング")
        taro.say()
        taro.think()

        val hana = Human("花", 25, "ギター")
        hana.say()
        hana.think()
    }
}