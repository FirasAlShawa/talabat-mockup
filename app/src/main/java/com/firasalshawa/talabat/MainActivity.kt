package com.firasalshawa.talabat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        getWindow().setFlags(
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//        );

        var adapter = GroupItemAdapter(GroupItemSetup());
        groupRV.adapter = adapter
    }

    fun GroupItemSetup():MutableList<GroupItem>{
        var GroupItems:MutableList<GroupItem> = ArrayList()
        GroupItems.add(GroupItem("الأكثر مبيعا"))
        GroupItems.add(GroupItem("المقبلات"))
        GroupItems.add(GroupItem("المعجنات"))
        GroupItems.add(GroupItem("الحلويات العربية"))
        GroupItems.add(GroupItem("الكيك"))
        GroupItems.add(GroupItem("الشوكولاتة"))
        GroupItems.add(GroupItem("الكنافة"))
        GroupItems.add(GroupItem("بيتى فور"))
        GroupItems.add(GroupItem("حلا القهوة"))
        GroupItems.add(GroupItem("المكسرات"))
        GroupItems.add(GroupItem("الإيس كريم"))
        GroupItems.add(GroupItem("القهوة"))
        return GroupItems
    }

}