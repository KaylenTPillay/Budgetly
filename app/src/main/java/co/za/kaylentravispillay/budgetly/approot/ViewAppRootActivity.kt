package co.za.kaylentravispillay.budgetly.approot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.za.kaylentravispillay.budgetly.approot.listener.OnAppRootToolbarListener
import co.za.kaylentravispillay.budgetly.databinding.AppRootLayoutBinding
import co.za.kaylentravispillay.budgetly.shared.toolbar.model.UIModelSharedToolbar

class ViewAppRootActivity : AppCompatActivity(), OnAppRootToolbarListener {

    private var binding: AppRootLayoutBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initialiseBinding()
        setContentView(binding?.root)
    }

    override fun onRenderAppRootToolbar(model: UIModelSharedToolbar) {
        binding?.appRootToolbar?.renderWithModel(model)
    }

    private fun initialiseBinding() {
        binding = AppRootLayoutBinding.inflate(layoutInflater)
    }

}
