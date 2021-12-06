package co.za.kaylentravispillay.budgetly.shared.toolbar

import android.content.Context
import android.util.AttributeSet
import co.za.kaylentravispillay.budgetly.shared.toolbar.model.UIModelSharedToolbar
import com.google.android.material.appbar.MaterialToolbar

class ViewSharedToolbar : MaterialToolbar {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        if (isInEditMode) renderEditMode()
    }

    fun renderWithModel(model: UIModelSharedToolbar) {
        title = model.title
    }

    private fun renderEditMode() {
        val editModeModel = UIModelSharedToolbar(title = "Example Title")
        renderWithModel(editModeModel)
    }

}
