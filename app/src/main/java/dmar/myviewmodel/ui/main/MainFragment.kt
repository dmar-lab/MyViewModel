package dmar.myviewmodel.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dmar.myviewmodel.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var viewModel = ViewModelProvider(this)
            .get(MainViewModel::class.java)
        // toto: Using the ViewModel
        var number = 0

        val textView = view?.findViewById<TextView>(R.id.textView)
        textView?.text = number.toString()

        val button = view?.findViewById<Button>(R.id.button)
        button?.setOnClickListener {
            number++
            textView?.text = number.toString()
        }
    }

}