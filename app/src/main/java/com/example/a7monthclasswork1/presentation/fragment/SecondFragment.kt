package com.example.a7monthclasswork1.presentation.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.a7monthclasswork1.R
import com.example.a7monthclasswork1.databinding.FragmentSecondBinding
import com.example.domain.model.Note
import com.example.a7monthclasswork1.presentation.base.BaseFragment
import com.example.a7monthclasswork1.presentation.viewmodel.SecondViewModel

class SecondFragment : BaseFragment(R.layout.fragment_second) {
//2 эдиттекста и кнопка сохранения(форма)

    private val binding by viewBinding(FragmentSecondBinding::bind)
    private val secondViewModel: SecondViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     /* Инициализация нажатий
     binding.btnSave.setOnClickListener{
     viewModel.createNote(
      Note(
          title = binding.etTitle.text.toString,
          createAt = System.currentTimeMillis(),
          description = "desc"  ) ) }  */

      var note = Note(title = "title", createAt = System.currentTimeMillis(), description = "desc")

       //create
        secondViewModel.createNote(note)
        secondViewModel.createNoteState.collectState(
            onLoading = {
                //TODO show progress bar
            },
            onError = {

            },
            onSuccess = {
                //TODO set list to adapter
            }
        )

        //edit
        secondViewModel.editNote(note)
        secondViewModel.editNoteState.collectState(
            onLoading = {
                //TODO show progress bar
            },
            onError = {

            },
            onSuccess = {
                //TODO set list to adapter
            }
        )
    }

}
//При редактировании
//FindNavController.navigateUp()