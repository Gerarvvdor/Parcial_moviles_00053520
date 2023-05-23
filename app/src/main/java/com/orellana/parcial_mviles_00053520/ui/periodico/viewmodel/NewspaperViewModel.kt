package com.orellana.parcial_mviles_00053520.ui.periodico.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.orellana.parcial_mviles_00053520.data.model.NewspaperModel
import com.orellana.parcial_mviles_00053520.repositories.NewspaperRepository

class NewspaperViewModel(private val repository: NewspaperRepository) : ViewModel() {
    var name = MutableLiveData("")
    var pubYear = MutableLiveData("")
    var information = MutableLiveData("")

    fun getNews() = repository.getNews()

    fun addNews(newspaper: NewspaperModel) = repository.addNews(newspaper)

    fun createNews(){
        /*if (!validateData()){
            status.value = WRONG_INFORMATION
            return
        }*/
        val newspaper = NewspaperModel(
            name.value!!,
            pubYear.value!!,
            information.value!!,
        )
        addNews(newspaper)
        clearData()
        /*status.value = NEWSPAPER_CREATED*/
    }

    fun validateData():Boolean{
        when{
            name.value.isNullOrEmpty()->return false
            pubYear.value.isNullOrEmpty()->return false
            information.value.isNullOrEmpty()->return false
        }
        return true
    }
    fun clearData(){
        name.value =""
        pubYear.value =""
        information.value=""
    }
    /*fun clearStatus(){
        status.value = INACTIVE
    }*/

    companion object{

    }

    fun setSelectedNewspaper(newspaper: NewspaperModel){
        name.value = newspaper.name
        pubYear.value = newspaper.pubYear
        information.value = newspaper.information
    }
}