package com.example.psikodiyetapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.psikodiyetapp.Fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView



class InfoContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_contact_activity)
        supportFragmentManager.beginTransaction().replace(R.id.framelayout,
            IletisimFragment()
        ).commit()
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomnavview)
        bottomNav.setOnNavigationItemSelectedListener { p0 ->
            when(p0.itemId){
                R.id.navigation_iletisim -> {
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,
                        IletisimFragment()
                    ).commit()
                }
                R.id.navigation_biz_kimiz -> {
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,
                        BizKimizFragment()
                    ).commit()
                }
                R.id.navigation_psikolog -> {
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,
                        PsikologFragment()
                    ).commit()
                }
                R.id.navigation_diyetisyen -> {
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,
                        DiyetisyenFragment()
                    ).commit()
                }
                R.id.navigation_hekim -> {
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,
                        HekimFragment()
                    ).commit()
                }
            }
            true
        }


    }

}
