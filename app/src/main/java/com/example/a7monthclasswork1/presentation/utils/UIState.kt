package com.example.a7monthclasswork1.presentation.utils

sealed class UIState<T> {
    class Loading <T> : UIState<T>()
    class Error<T>(val message:String): UIState<T>()
    class Success <T> (val data:T): UIState<T>()
    class Empty<T> : UIState<T>()
}