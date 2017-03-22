package com.fstyle.structure_android.screen.main;

import android.app.Activity;
import android.content.Context;
import com.fstyle.structure_android.data.source.UserRepository;
import com.fstyle.structure_android.utils.dagger.ActivityScope;
import com.fstyle.structure_android.utils.navigator.Navigator;
import com.fstyle.structure_android.utils.validator.Validator;
import com.fstyle.structure_android.widget.dialog.DialogManager;
import com.fstyle.structure_android.widget.dialog.DialogManagerImpl;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Sun on 3/18/2017.
 */

@Module
public class MainModule {

    private MainContract.View mView;

    public MainModule(MainContract.View view) {
        this.mView = view;
    }

    @ActivityScope
    @Provides
    public MainContract.Presenter providePresenter(UserRepository userRepository, Validator
            validator) {
        return new MainPresenter(mView, userRepository, validator);
    }

    @ActivityScope
    @Provides
    public Validator provideValidator(Context context) {
        return new Validator(context, mView);
    }

    @ActivityScope
    @Provides
    public DialogManager provideDialogManager() {
        return new DialogManagerImpl(mView);
    }

    @ActivityScope
    @Provides
    public Navigator provideNavigator() {
        return new Navigator((Activity) mView);
    }
}