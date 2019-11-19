package com.ctnphrae.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val titleArr = arrayOf(
        "AETHER LENS",
        "VANGUARD",
        "BLACK KING BAR",
        "DIFFUSAL BLADE",
        "ECHO SABREู",
        "NECRONOMICON",
        "AEON DISK",
        "MONKEY KING BAR",
        "AGHANIM'S SCEPTER",
        "SPIRIT VESSEL",
        "LOTUS ORB",
        "HAND OF MIDAS",
        "ETHEREAL BLADE"
        ,
        "ASSAULT CUIRASS",
        "DIVINE RAPIER",
        "HEART OF TARRASQUE",
        "SOLAR CREST",
        "MJOLLNIR",
        "EYE OF SKADI",
        "BUTTERFLY"
    )
    val detailArr = arrayOf(
        "ขัดเกลาด้วยมนตร์จากลมหายใจสุดท้ายของเขา ของขวัญจากที่นักเวทที่กำลังสิ้นลมหายใจมอบให้แก่บุตรชายของเข",
        "โล่อันแข็งแกร่งที่สามารถปกป้องผู้ถือแม้กระทั่งจากการโจมตีที่ร้ายกาจที่สุด",
        "คทาอันทรงพลังที่เต็มไปด้วยพละกำลังของยักษ์ ",
        "ดาบต้องมนต์ที่สามารถฟาดฟันวิญญาณของศัตรูได้โดยตรง",
        "ดาบพลิ้วไหวลวงตาที่ถูกซึมซับด้วยเวทมตร์อันก้องกังวาน ",
        "พลังชั่วร้ายมหาศาลถูกกักขังอยู่ในหน้าหนังสือเล่มนี้ มันถูกนับเป็นเหมือนสุดยอดแห่งศาสตร์ด้านความตายและปีศาจ ",
        "ตามที่หลายคนเชื่อกัน สิ่งประดิษฐ์อันทรงพลังนี้ถูกลักลอบนำออกจาก Ivory Incubarium เมื่อนานมาแล้ว ",
        "พลองอันทรงพลังที่ถูกใช้โดยนักรบระดับปรมาจารย์ ",
        "คทาของจอมเวทซึ่งมีพลังเข้าใกล้พลังของเทพเจ้า ",
        "หลอมขึ้นโดยพระเจ้าเพื่อกักขังดวงวิญญาณของพระเจ้าองค์อื่น",
        "อัญมณีที่ใจกลางยังคงสะท้อนภาพอันขุ่นมัวของผู้ที่สร้างมันขึ้นมา ",
        "ถูกถนอมไว้ด้วยเวทที่ลึกลับ The Hand of Midas เป็นอาวุธแห่งความโลภที่ยอมสังเวยชีวิตสัตว์เพื่อเงินในกระเป๋าของผู้ใช้ ",
        "ดาบที่ส่องประกายแห่งความสยดสยอง สามารถสร้างความเสียหายได้ทั้งในโลกเวทมนตร์และโลกกายภาพ ",
        "ถูกหลอมขึ้นในขุมนรกที่ยากจะหยั่งถึง เกราะจากนรกโลกันตร์นี้สามารถมอบพลังป้องกันและความเร็วในการโจมตีให้กับทั้งกองทัพได้ ",
        "ทรงพลังจนไม่สามารถมีเจ้าของได้เพียงแค่คนเดียว ",
        "หัวใจของสัตว์ประหลาดที่สูญพันธุ์ไปแล้วแต่ยังคงสภาพเดิม มันสามารถเพิ่มความแข็งแกร่งของผู้ถืออย่างมหาศาล",
        "เครื่องรางที่หลอมสร้างมาเพื่อเป็นเกียรติแก่ท้องฟ้ายามตะวันฉาย",
        "ค้อนเวทมนตร์ของ Thor ถูกสร้างเพื่อเขาโดยเฉพาะ โดยคนแคระ Brok และ Eitri",
        "สิ่งประดิษฐ์ที่หายาก ได้รับการปกป้องโดยเหล่ามังกรฟ้า",
        "เฉพาะนักรบที่แข็งแกร่งและมากประสบการณ์ที่สุดเท่านั้นที่สามารถใช้ Butterfly ได้ โดยอาวุธนี้จะเพิ่มความคล่องแคล่วในการต่อสู้อย่างยิ่งยวด "
    )

    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Item Dota 2")
        val mAdapter = ArrayAdapter(
            context,
            android.R.layout.simple_list_item_1,
            titleArr
        )

        lv_province.adapter = mAdapter

        lv_province.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(
                context,
                "ข้อความ = ${titleArr[position]} , ข้อมูล = ${detailArr[position]}"
                , Toast.LENGTH_LONG
            ).show()


        }
    }
}