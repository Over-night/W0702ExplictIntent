package kr.ac.kumoh.s20180864.w0702explictintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180864.w0702explictintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        binding.btnExplicitIntent.setOnClickListener {
            val intent = Intent(this,
                ImageActivity::class.java)
            startActivity(intent)
        }
        binding.btnImplicitIntent.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnText.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/results?search_query=" + binding.editText.text.toString())
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}