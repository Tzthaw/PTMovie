package com.ptut.ptmovie.di

import android.app.Application
import com.ptut.ptmovie.PTMovieApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(
  modules = [
    AppModule::class,
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    AssistedInjectModule::class
  ]
)
interface AppComponent {

  @Component.Builder
  interface Builder {
    @BindsInstance
    fun application(application: Application): Builder
    fun build(): AppComponent
  }

  fun inject(application: PTMovieApp)
  fun factory(): DaggerWorkerFactory

}