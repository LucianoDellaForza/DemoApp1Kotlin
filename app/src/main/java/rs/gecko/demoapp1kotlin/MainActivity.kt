package rs.gecko.demoapp1kotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dogsList = mutableListOf(
                Dog(R.drawable.bulldog, "Bulldog", 0.5, 20.0),
                Dog(R.drawable.chihuahua, "Chihuahua", 0.22, 7.0),
                Dog(R.drawable.dachshund, "Dachshund", 0.6, 25.0),
                Dog(R.drawable.german_shepard, "German shepard", 0.6, 30.0),
                Dog(R.drawable.golden_retriever, "Golden retriever", 0.6, 30.0),
                Dog(R.drawable.great_dane, "Great dane", 0.8, 40.0),
                Dog(R.drawable.greyhound, "Greyhound", 0.4, 25.0),
                Dog(R.drawable.husky, "Husky", 0.7, 30.0),
                Dog(R.drawable.labrador, "Labrador", 0.6, 30.0),
                Dog(R.drawable.rottweiler, "Rottweiler", 0.4, 20.0),
        )

        val myAdapter = RecyclerAdapter(dogsList)
        dogRv.apply {
            adapter = myAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }
}