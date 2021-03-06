package com.jeff.movieviewer.main.seatmap.view

import com.hannesdorfmann.mosby.mvp.MvpView
import com.jeff.movieviewer.database.local.Photo
import com.jeff.movieviewer.database.local.Schedule
import com.jeff.movieviewer.database.local.SeatMap

interface SeatMapView : MvpView {
     fun generateSeatMap(seatMap: SeatMap)
     fun setSchedule(schedule: Schedule)
    fun showMessage(message: String)
    fun showProgressBar()
    fun hideProgressBar()
}