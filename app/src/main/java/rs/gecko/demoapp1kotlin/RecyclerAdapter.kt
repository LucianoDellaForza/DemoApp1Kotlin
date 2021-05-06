package rs.gecko.demoapp1kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_dog.view.*

class RecyclerAdapter (
        var dogs: List<Dog>
        ) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_dog, parent, false
        )
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.apply {
            val dog = dogs[position]
            dogIv.setImageResource(dog.image)
            dogBreedTv.text = dog.breed
            dogHeightTv.text = dog.height.toString()
            dogWEightTv.text = dog.weight.toString()
        }
    }

    override fun getItemCount(): Int {
        return dogs.size
    }
}