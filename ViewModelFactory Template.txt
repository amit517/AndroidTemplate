#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ${NAME}() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(${View_Model_Class}::class.java))
            return ${View_Model_Class}() as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
