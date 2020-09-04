package com.firasalshawa.talabat

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter : RowGroupAdapter = RowGroupAdapter(RowGroupItemSetup());
        MainRv.adapter = adapter;

        var adaptergroup = GroupItemAdapter(GroupItemSetup());
        groupRV.adapter = adaptergroup
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

    fun RowGroupItemSetup():MutableList<RowGroupItem>{
        var GroupItems:MutableList<RowGroupItem> = ArrayList()
        var rowItems:MutableList<RowItem>  =RowItemSetup();
        var array1:MutableList<RowItem> = ArrayList();
        var array2:MutableList<RowItem> = ArrayList();
        var array3:MutableList<RowItem> = ArrayList();
        var array4:MutableList<RowItem> = ArrayList();
        var array5:MutableList<RowItem> = ArrayList();
        var array6:MutableList<RowItem> = ArrayList();
        var array7:MutableList<RowItem> = ArrayList();
        var array8:MutableList<RowItem> = ArrayList();
        var array9:MutableList<RowItem> = ArrayList();
        var array10:MutableList<RowItem> = ArrayList();
        var array11:MutableList<RowItem> = ArrayList();
        var array12:MutableList<RowItem> = ArrayList();
        array1.add(rowItems[0])
        array2.add(rowItems[1])
        array3.add(rowItems[2])
        array4.add(rowItems[3])
        array5.add(rowItems[4])
        array6.add(rowItems[5])
        array7.add(rowItems[6])
        array8.add(rowItems[7])
        array9.add(rowItems[8])
        array10.add(rowItems[9])
        array11.add(rowItems[10])
        array12.add(rowItems[11])
        GroupItems.add(RowGroupItem("الأكثر مبيعا",array1))
        GroupItems.add(RowGroupItem("المقبلات",array2))
        GroupItems.add(RowGroupItem("المعجنات",array3))
        GroupItems.add(RowGroupItem("الحلويات العربية",array4))
        GroupItems.add(RowGroupItem("الكيك",array5))
        GroupItems.add(RowGroupItem("الشوكولاتة",array6))
        GroupItems.add(RowGroupItem("الكنافة",array7))
        GroupItems.add(RowGroupItem("بيتى فور",array8))
        GroupItems.add(RowGroupItem("حلا القهوة",array9))
        GroupItems.add(RowGroupItem("المكسرات",array10))
        GroupItems.add(RowGroupItem("الإيس كريم",array11))
        GroupItems.add(RowGroupItem("القهوة",array12))
        return GroupItems
    }

    fun RowItemSetup():MutableList<RowItem>{
        var GroupItems:MutableList<RowItem> = ArrayList()
        GroupItems.add(RowItem("بوكس بقلاوة مشكلة","س.ر 53.00",null));
        GroupItems.add(RowItem("صحن ورق عنب","السعر حسب الطلب",null));
        GroupItems.add(RowItem("بوكس كبة دجاج","السعر حسب الطلب",null));
        GroupItems.add(RowItem("أصابع بقلاوة بالأوريو","س.ر 95.00",null));
        GroupItems.add(RowItem("بوكس ماكرون مشكل صغير","س.ر 18.00",null));
        GroupItems.add(RowItem("بوكس شوكولاتة اوريو مشكل","السعر حسب الطلب",null));
        GroupItems.add(RowItem("كنافة جبنة بالتوت البري","س.ر 74.00",null));
        GroupItems.add(RowItem("بوكس بيتى فور موالح جديد","س.ر 50.00",null));
        GroupItems.add(RowItem("بوكس حلا القهوة ب 200","س.ر 85.00",null));
        GroupItems.add(RowItem("صحن مكسرات 10","س.ر 57.00",null));
        GroupItems.add(RowItem("أصابع الإيس كريم مشكل","س.ر 9.00",null));
        GroupItems.add(RowItem("علية قهوة بنكهة الكراميل 260 حرام","س.ر 33.00",null));
        return GroupItems
    }


}