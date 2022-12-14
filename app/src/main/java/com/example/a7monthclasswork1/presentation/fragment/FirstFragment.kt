package com.example.a7monthclasswork1.presentation.fragment

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.a7monthclasswork1.R
import com.example.a7monthclasswork1.databinding.FragmentFirstBinding
import com.example.domain.model.Note
import com.example.a7monthclasswork1.presentation.adapter.FirstAdapter
import com.example.a7monthclasswork1.presentation.base.BaseFragment
import com.example.a7monthclasswork1.presentation.viewmodel.FirstViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstFragment : BaseFragment(R.layout.fragment_first) {
    //Список из заметок

    private val binding by viewBinding(FragmentFirstBinding::bind)
    private val firstViewModel: FirstViewModel by viewModels()
    private val list = mutableListOf<Note>()
    private val noteAdapter by lazy {  FirstAdapter(list)}

    override fun initialize() {
        binding.rvNotes.apply {
            layoutManager = LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )
            adapter = noteAdapter
        }
    }

    override fun setupRequests() {
        firstViewModel.getAllNotes()
        var note = Note(title = "title", createAt = System.currentTimeMillis(), description = "desc")

        firstViewModel.getAllNotesState.collectState(
            onLoading = {
                //TODO show progress bar
            },
            onError = {

            },
            onSuccess = {
                //TODO set list to adapter
            }
        )

        firstViewModel.deleteNote(note)
        firstViewModel.deleteNoteState.collectState(
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

    override fun setupClickListeners() {}
}


//            val sdf = SimpleDateFormat("'Date\n'dd-MM-yyyy '\n\nand\n\nTime\n'HH:mm:ss z")
//            val currentDateAndTime = sdf.format(Date())
//            binding.tvNotesTime.text = currentDateAndTime