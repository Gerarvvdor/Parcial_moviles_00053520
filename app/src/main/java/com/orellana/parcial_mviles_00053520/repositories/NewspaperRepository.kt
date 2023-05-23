package com.orellana.parcial_mviles_00053520.repositories

import com.orellana.parcial_mviles_00053520.data.model.NewspaperModel

class NewspaperRepository(private val newspapers: MutableList<NewspaperModel>) {
    //Getting newspapers
    fun getNews() = newspapers

    //Adding newspapers
    fun addNews(newspaper: NewspaperModel) = newspapers.add(newspaper)

}