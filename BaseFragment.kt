#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import com.deshipay.base.view.BaseFragment
import com.deshipay.base.viewmodel.BaseViewModel

class ${NAME} : BaseFragment<${Fragment_Binding_Class}>() {
    override fun layoutId(): Int = R.layout.${layoutId}

    override fun getViewModel(): BaseViewModel? = null

    override fun initOnCreateView() {
        
    }

    override fun onShow() {
    }
}
