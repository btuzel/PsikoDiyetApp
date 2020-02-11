package com.example.psikodiyetapp.Fragments

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.psikodiyetapp.R





class BizKimizFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        var rootView = inflater.inflate(R.layout.biz_kimiz_fragment,container, false)
        val textView = rootView.findViewById<TextView>(R.id.textView7)
        val string = SpannableString("Text with clickable text")
        val clickableSpan = object : ClickableSpan(){
            override fun onClick(p0: View) {
                val newFragment = DiyetisyenFragment()
                val transaction = fragmentManager!!.beginTransaction().apply {
                    replace(R.id.navigation_biz_kimiz, newFragment)
                    addToBackStack(null)
                }
                transaction.commit();
            }
        }
        string.setSpan(clickableSpan,5,9,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = string
        textView.movementMethod = LinkMovementMethod.getInstance()

        return rootView

    }



}