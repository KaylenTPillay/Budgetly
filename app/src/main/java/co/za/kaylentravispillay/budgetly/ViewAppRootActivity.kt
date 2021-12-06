package co.za.kaylentravispillay.budgetly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.za.kaylentravispillay.budgetly.databinding.AppRootLayoutBinding

class ViewAppRootActivity : AppCompatActivity() {

    private var binding: AppRootLayoutBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initialiseBinding()
        setContentView(binding?.root)
    }

    private fun initialiseBinding() {
        binding = AppRootLayoutBinding.inflate(layoutInflater)
    }

}
