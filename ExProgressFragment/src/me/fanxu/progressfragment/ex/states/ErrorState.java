package me.fanxu.progressfragment.ex.states;

import me.fanxu.progressfragment.ex.R;

/**
 * by fanxu
 */
public class ErrorState extends AbstractShowState {
    @Override
    public void show(boolean animate) {
        showViewById(R.id.epf_error, animate);
    }

    @Override
    public void dismiss(boolean animate) {
        dismissViewById(R.id.epf_error, animate);
    }
}
