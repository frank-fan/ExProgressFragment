package me.fanxu.progressfragment.ex.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EFragment;
import com.googlecode.androidannotations.annotations.UiThread;
import me.fanxu.progressfragment.ex.ExProgressFragment;

/**
 * by fanxu
 */
@EFragment
public class ExampleExProgressFragment extends ExProgressFragment {

    @Override
    public View onCreateContentEmptyView(LayoutInflater inflater) {
        return inflater.inflate(R.layout.sample_custom_empty, null);
    }

    @Override
    public View onCreateContentView(LayoutInflater inflater) {
        return inflater.inflate(R.layout.sample_custom_content, null);
    }

    @Override
    public View onCreateContentErrorView(LayoutInflater inflater) {
        return inflater.inflate(R.layout.sample_custom_error, null);
    }

    @Override
    public View onCreateProgressView(LayoutInflater inflater) {
        return inflater.inflate(R.layout.sample_custom_progress, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnReloadClicked();
    }

    @UiThread(delay = 2000)
    void showContent() {
        showContent(true);
    }
    @UiThread(delay = 5000)
    void showEmpty() {
        showEmpty(true);
    }
    @UiThread(delay = 8000)
    void showError() {
        showError(true);
    }

    @Click
    void btnReloadClicked() {
        showProgress(false);
        showContent();
        showEmpty();
        showError();
    }
}
