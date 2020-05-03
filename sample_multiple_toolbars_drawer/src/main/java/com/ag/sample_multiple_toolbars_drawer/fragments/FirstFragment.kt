package com.ag.sample_multiple_toolbars_drawer.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.multiple_toolbars.setupToolbar
import com.ag.sample_multiple_toolbars_drawer.R
import com.ag.sample_multiple_toolbars_drawer.models.IterationFragmentArgs
import com.ag.sample_multiple_toolbars_drawer.utils.defAnim
import com.ag.sample_multiple_toolbars_drawer.utils.navigate
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar)

        btn.setOnClickListener {
            findNavController().navigate(
                R.id.iterationFragment,
                IterationFragmentArgs(R.style.FirstFragmentTheme, 0),
                defAnim
            )
        }
    }

}
