#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil

#parse("File Header.java")
class ${NAME}(
private val ${Item_Click_Callback_Name}: (${Model_Class}?) -> (Unit),): RecyclerView.Adapter<${NAME}.${ViewHolder_Class}>(){

    private val differ = AsyncListDiffer(this, diffCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${NAME}.${ViewHolder_Class} =
        ${ViewHolder_Class}(
            ${Item_Binding_Class}.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        )


    override fun onBindViewHolder(holder: ${ViewHolder_Class}, position: Int) {
        holder.bind(differ.currentList[position], position)
        holder.itemView.setOnClickListener {
            ${Item_Click_Callback_Name}.invoke(differ.currentList[position])
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    fun submitData(newList: List<${Model_Class}>){
        differ.submitList(newList)
    }

    inner class ${ViewHolder_Class}
    (private val binding: ${Item_Binding_Class}
    ) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: ${Model_Class}, position: Int){
        TODO("not yet implemented")
    }
    }

    companion object {
        private val diffCallBack = object : DiffUtil.ItemCallback<${Model_Class}>(){

            override fun areItemsTheSame(oldItem: ${Model_Class}, newItem: ${Model_Class}): Boolean {
            TODO("not implemented")
        }
    
            override fun areContentsTheSame(oldItem: ${Model_Class}, newItem: ${Model_Class}): Boolean {
            return oldItem == newItem
        }
        }
    }
}