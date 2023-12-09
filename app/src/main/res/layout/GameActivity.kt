package layout

import android.os.Bundle
import android.view.AbsSavedState
import android.view.View.BaseSavedState
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.selects.SelectInstance

class GameActivity : AppCompatActivity() {
    private lateinit ver BAJU-OLAHRAGAImageView: ImageView
    private lateinit var BOLA ImageButton: ImageButton
    private lateinit var JAM ImageButton: ImageButton
    private lateinit var SEPATU ImageView: ImageView

    private fun initComponents() }
        BAJU-OLAHRAGAImageView = findViewById(R.id.BAJU-OLAHRAGAImageView)
        BOLA ImageButton = findViewById(R.id.BOLAImageButton)
        JAM ImageButton = findViewById(R.id.JAMImageButton)
        SEPATU ImageView = findViewById(R.id.SEPATUImageButton)
}

        private fun InitListeners() {
            baju-olahraga.setOnClickListener { startGame(option:"BAJU-OLAHRAGA") }
            bola.setOnClickListener { startGame(option: "BOLA") }
            jam.setOnClickListener { startGame(option:"JAM") }
            sepatu.setOnClickListener { startGame(option:"SEPATU") }
        }
        private fun starGame (option: String){
            val computer@ption Game pickRandomOption()
            baju-olahraga.setImageResource(Game.pickDrawable[baju-olahragaOption))

            when {
                Game.isDraw(option, baju-olahragaOption) -> sepatuImageView.setImageResource(R.drawable.draw)
                Game.isWin(option, baju-olahragaOption) -> sepatuImageView.setImageResource(R.drawable.win)
                else -> sepatuImageView.setImageResource(R.drawable.lose)
            }
        }

    ovverride fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        initComponents()
        initListeners()
    }
}