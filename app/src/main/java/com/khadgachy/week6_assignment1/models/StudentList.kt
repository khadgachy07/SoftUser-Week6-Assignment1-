        package com.khadgachy.week6_assignment1.models

import com.khadgachy.week6_assignment1.adapters.StudentAdapter
import com.khadgachy.week6_assignment1.fragments.ViewFragment

val listStudent: ArrayList<Students> =  ArrayList()
val adapter = StudentAdapter(listStudent, ViewFragment())

fun add(){ listStudent.add(Students("Khadga Chy",
        21,
        "Male",
        "Budhasanti,Jhapa",
        "https://scontent.fktm7-1.fna.fbcdn.net/v/t1.0-9/117584056_932000127277765_6911789296852874547_n.jpg?_nc_cat=104&ccb=2&_nc_sid=09cbfe&_nc_ohc=EnF1HbqcP1gAX8tHmHX&_nc_ht=scontent.fktm7-1.fna&oh=6c1ae537bfa80a72cbf32cf7f15f9010&oe=60288377"))
    listStudent.add(Students(
            "Amrit Tamang",
            22,"Male",
            "Birtamod",
            "https://scontent.fktm7-1.fna.fbcdn.net/v/t1.0-9/121310389_114663070411575_1673392049968155017_n.jpg?_nc_cat=110&ccb=2&_nc_sid=174925&_nc_ohc=_ZFgEVc95p0AX8UdltZ&_nc_ht=scontent.fktm7-1.fna&oh=86fb4637aecb02aae50402951ab6acb0&oe=6028E826"))
    listStudent.add(Students("Aakriti Shrestha",
            20,
            "Female",
            "Jhapa",
            "https://scontent.fktm7-1.fna.fbcdn.net/v/t1.0-9/133857523_2876927729258085_4040602675515614536_o.jpg?_nc_cat=105&ccb=2&_nc_sid=09cbfe&_nc_ohc=OaG9o4FKH3EAX84R3lJ&_nc_ht=scontent.fktm7-1.fna&oh=1b306515de35552b9023cadb349c29ce&oe=6026A79C"))}

