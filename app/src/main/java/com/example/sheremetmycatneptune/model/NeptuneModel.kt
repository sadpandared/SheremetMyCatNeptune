package com.example.sheremetmycatneptune.model

import androidx.lifecycle.ViewModel
import com.example.sheremetmycatneptune.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class NeptuneModel: ViewModel() {
    val cats = MutableStateFlow<List<Neptune>>(emptyList())

    fun getById(id: String) = cats.value.first { neptune -> neptune.id == id }

    init {
        cats.update {
            mutableListOf(
                Neptune(
                    id = "1",
                    name = "Serious Neptune",
                    breed = "Scottish fold",
                    sex = "male",
                    age = "8 month",
                    photo = R.drawable.nep1
            ),
            Neptune(
                id = "2",
                name = "Smart Neptune",
                breed = "Scottish fold",
                sex = "male",
                age = "4 month",
                photo = R.drawable.nep2
            ),
            Neptune(
                id = "3",
                name = "Spider Neptune",
                breed = "Scottish fold",
                sex = "male",
                age = "7 month",
                photo = R.drawable.nep3
            ),
            Neptune(
                id = "4",
                name = "Suprised Neptune",
                breed = "Scottish fold",
                sex = "male",
                age = "8 month",
                photo = R.drawable.nep4
            ),
                Neptune(
                    id = "5",
                    name = "Small Neptune",
                    breed = "Scottish fold",
                    sex = "male",
                    age = "2 month",
                    photo = R.drawable.nep5
                ),
            Neptune(
                id = "6",
                name = "Sleepy Neptune",
                breed = "Scottish fold",
                sex = "male",
                age = "9 month",
                photo = R.drawable.nep6
            ),
            Neptune(
                id = "7",
                name = "Cuty Neptune",
                breed = "Scottish fold",
                sex = "male",
                age = "10 month",
                photo = R.drawable.nep7
            ),
            Neptune(
                id = "8",
                name = "Lazy Neptune",
                breed = "Scottish fold",
                sex = "male",
                age = "10 month",
                photo = R.drawable.nep8
            )
            )
        }
    }
}
