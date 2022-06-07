#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

#parse("File Header.java")
class ${NAME} :
    PagingDataAdapter<${Model_Class}, ${NAME}.${ViewHolder_Class}>(
        DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${ViewHolder_Class} {
        val layoutInflater = LayoutInflater.from(parent.context)
        val bindingView =  ${Item_Binding_Class}.inflate(layoutInflater, parent, false)
        return ${ViewHolder_Class}(bindingView)
    }

    override fun onBindViewHolder(holder: ${ViewHolder_Class}, position: Int) {
        holder.bind(getItem(position), position)
    }

    inner class ${ViewHolder_Class}(val binding:  ${Item_Binding_Class}) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(item: ${Model_Class}, position: Int){
            TODO("not yet implemented")
        }
    }
    
    companion object {
            val DiffCallBack: DiffUtil.ItemCallback<${Model_Class}> =
                object : DiffUtil.ItemCallback<${Model_Class}>() {
                    override fun areItemsTheSame(
                        oldItem: ${Model_Class},
                        newItem: ${Model_Class},
                    ): Boolean {
                        //return oldItem.voucherId === oldItem.voucherId
                        TODO("not yet implemented")
                    }

                    override fun areContentsTheSame(
                        oldItem: ${Model_Class},
                        newItem: ${Model_Class},
                    ): Boolean {
                        return oldItem == newItem
                    }
                }
    }
}
