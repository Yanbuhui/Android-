package com.example.middleexam.ui.theme

import java.util.*

data class Commodity(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int,
    val description: String
)

data class Equipment(
    val equipmentId: Int,
    val brand: String,
    val model: String,
    val capacity: Double,
    val condition: String
)

val commodityList = listOf(
    Commodity(1, "苹果", 1.5, 10, "新鲜水果"),
    Commodity(2, "香蕉", 0.8, 20, "香甜可口"),
    Commodity(3, "橙子", 2.0, 15, "多汁美味")
)

val equipmentList = listOf(
    Equipment(101, "品牌 A", "型号 X", 100.0, "良好"),
    Equipment(102, "品牌 B", "型号 Y", 200.0, "优秀"),
    Equipment(103, "品牌 C", "型号 Z", 150.0, "一般")
)