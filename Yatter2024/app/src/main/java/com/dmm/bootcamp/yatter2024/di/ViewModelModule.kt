package com.dmm.bootcamp.yatter2024.di

import LoginViewModel
import MainViewModel
import PostViewModel
import com.dmm.bootcamp.yatter2024.ui.timeline.PublicTimelineViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val viewModelModule = module {
  viewModel { MainViewModel(get()) }
  viewModel { PublicTimelineViewModel(get()) }
  viewModel { PostViewModel(get(), get()) }
//  viewModel { RegisterAccountViewModel(get()) }
  viewModel { LoginViewModel(get()) }
}
