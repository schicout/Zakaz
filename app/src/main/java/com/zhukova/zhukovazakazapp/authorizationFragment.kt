package com.zhukova.zhukovazakazapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment

class authorizationFragment : Fragment() {
    companion object{
        const val COUNT_OF_NUMBERS_IN_RUS_PHONE = 10
    }

    private lateinit var btnStarter: Button
    private lateinit var etAuthPhone: EditText


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_authorization, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnStarter = view.findViewById(R.id.btnStarter)
        etAuthPhone = view.findViewById(R.id.etAuthPhoneNumb)
        configureStartBtn()
        configurePhoneField()
    }

    private fun configureStartBtn(){
         btnStarter.setOnClickListener {
             (activity as MainNavigation).openKorzinaZakazaFragment(etAuthPhone.text.toString())
        }
    }

    private fun configurePhoneField(){
        etAuthPhone.doOnTextChanged{text, start,before, count ->
            btnStarter.isEnabled = text?.length!! > COUNT_OF_NUMBERS_IN_RUS_PHONE

        }
    }

}