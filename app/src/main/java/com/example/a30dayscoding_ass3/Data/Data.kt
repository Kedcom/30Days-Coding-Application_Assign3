
package com.example.a30dayscoding_ass3.Data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30dayscoding_ass3.R

data class Data (
    val day: String,
    @DrawableRes val imageResourceId : Int,
    @StringRes val stringResourceId : Int,
    @StringRes val DescriptionResourceId : Int
)

val datas = listOf(
    Data("Day 1", R.drawable.html_logo_original, R.string.day_1a, R.string.day1_description),
    Data("Day 2", R.drawable.css_logo, R.string.day_2a, R.string.day2_description),
    Data("Day 3", R.drawable.javascript_logo, R.string.day_3a, R.string.day3_description),
    Data("Day 4", R.drawable.phython_logo, R.string.day_4a, R.string.day4_description),
    Data("Day 5", R.drawable.sql_logo, R.string.day_5a, R.string.day5_description),
    Data("Day 6", R.drawable.java_logo, R.string.day_6a, R.string.day6_description),
    Data("Day 7", R.drawable.c__logo, R.string.day_7a, R.string.day7_description),
    Data("Day 8", R.drawable.react_logo, R.string.day_8a, R.string.day8_description),
    Data("Day 9", R.drawable.node_js_logo, R.string.day_9a, R.string.day9_description),
    Data("Day 10", R.drawable.java_logo, R.string.day_10a, R.string.day10_description),
    Data("Day 11", R.drawable.php_logo, R.string.day_11a, R.string.day11_description),
    Data("Day 12", R.drawable.larvel_logo, R.string.day_12a, R.string.day12_description),
    Data("Day 13", R.drawable.c___logo, R.string.day_13a, R.string.day13_description),
    Data("Day 14", R.drawable.c___logo, R.string.day_14a, R.string.day14_description),
    Data("Day 15", R.drawable.data_structure_logo, R.string.day_15a, R.string.day15_description),
    Data("Day 16", R.drawable.algorithim_logog, R.string.day_16a, R.string.day16_description),
    Data("Day 17", R.drawable.git_github_logo, R.string.day_17a, R.string.day17_description),
    Data("Day 18", R.drawable.web_dev, R.string.day_18a, R.string.day18_description),
    Data("Day 19", R.drawable.react_logo, R.string.day_19a, R.string.day19_description),
    Data("Day 20", R.drawable.node_js_and_express, R.string.day_20a, R.string.day20_description),
    Data("Day 21", R.drawable.sql___nosql_logo, R.string.day_21a, R.string.day21_description),
    Data("Day 22", R.drawable.security, R.string.day_22a, R.string.day22_description),
    Data("Day 23", R.drawable.testin_g, R.string.day_23a, R.string.day23_description),
    Data("Day 24", R.drawable.performance_optimization, R.string.day_24a, R.string.day24_description),
    Data("Day 25", R.drawable.cload_computing_logo, R.string.day_25a, R.string.day25_description),
    Data("Day 26", R.drawable.devops_logo, R.string.day_26a, R.string.day26_description),
    Data("Day 27", R.drawable.react_logo, R.string.day_27a, R.string.day27_description),
    Data("Day 28", R.drawable.agile_dev_logo, R.string.day_28a, R.string.day28_description),
    Data("Day 29", R.drawable.soft_skills_logo, R.string.day_29a, R.string.day29_description),
    Data("Day 30", R.drawable.final_project_logo, R.string.day_30a, R.string.day30_description)
)
