package com.example.urldetectioninlongstring

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.text.util.Linkify
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var text:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text=findViewById(R.id.text)

        // Sample paragraph with a URL
        val paragraphString = "lly unchanged. It was popularised in the 1960s with https://github.com/VaibhavShitole1303/Bumble_colne/blob/main/D_app/components/BumbleCardview.swift the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
                "\n" +
                "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n" +
                "\n" +
                "Where does it come from?\n" +
                "Contrary to popular https://www.bing.com/search?q=wakelock&form=ANNTH1&refig=d84a727e48774f96a3529563cbcfec08&pc=U531 belief, Lorem Ipsum is not simply random text. It has roots in a piece https://freakycoder.com/android-notes-29-how-to-create-multiple-clickable-links-in-textview-8c6c7ff475cc of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                "\n" +
                "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.\n" +

                "ipsum dolor sit amet...'\nCheck out this website: https://www.example.com for more information."

        // Set the text of the TextView
        text.text = paragraphString

        // Automatically detect URLs and make them clickable
        Linkify.addLinks(text, Linkify.WEB_URLS)

        // Enable link movement
        text.movementMethod = android.text.method.LinkMovementMethod.getInstance()

    }
}