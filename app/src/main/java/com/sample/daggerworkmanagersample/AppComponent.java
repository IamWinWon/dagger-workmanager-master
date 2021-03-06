package com.sample.daggerworkmanagersample;


import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class, WorkingBindingModule.class})
public interface AppComponent {
    void inject(LoggerModelImpl loggerModel);
    SimpleWorkerFactory factory();

}
