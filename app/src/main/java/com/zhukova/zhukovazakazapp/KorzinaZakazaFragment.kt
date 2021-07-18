package com.zhukova.zhukovazakazapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class KorzinaZakazaFragment : Fragment() {

    companion object{
        const val PHONE_NUMBER_KEY = "PHONE_NUMBER"

        fun newInstance (phoneNumber: String) : KorzinaZakazaFragment {
            return KorzinaZakazaFragment().apply {
                arguments = bundleOf(
                    PHONE_NUMBER_KEY to phoneNumber
                )
            }
        }
    }

    var phoneNumber:String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_korzina_zakaza, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        phoneNumber = arguments?.getString(PHONE_NUMBER_KEY)
        val tvPhoneNumber = view.findViewById<TextView>(R.id.tvPhoneNumber)
        tvPhoneNumber.text = "Phone number : $phoneNumber"

        }



    }