package hu.bme.aut.android.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import hu.bme.aut.android.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      H2PGRB
        binding.btnHighScores.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                getString(R.string.toast_highscore),
                Toast.LENGTH_LONG
            ).show()
        }

        binding.btnStart.setOnClickListener {
            startActivity(Intent(this@MainActivity, GameActivity::class.java))
        }

        binding.btnAbout.setOnClickListener {
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }

    }
}