package id.ac.polinema.skorbasket.viewmodels;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class SharedScore extends AndroidViewModel {
    //Menambah Livedata
    private MutableLiveData<Integer> scoreHome;
    private MutableLiveData<Integer> scoreVisitor;
    private MutableLiveData<Boolean> winner;

    public SharedScore(@NonNull Application application) {
        super(application);
        scoreHome = new MutableLiveData<>();
        scoreVisitor = new MutableLiveData<>();
        winner = new MutableLiveData<>();
    }

    public MutableLiveData<Integer> getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(Integer score) {
        scoreHome.setValue(score);
    }

    public MutableLiveData<Integer> getScoreVisitor() {
        return scoreVisitor;
    }

    public void setScoreVisitor(Integer score) {
        scoreVisitor.setValue(score);
    }

    public MutableLiveData<Boolean> getWinner() {
        return winner;
    }

    public void setWinner(Boolean result) {
        winner.setValue(result);
    }
}
