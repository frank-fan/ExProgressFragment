package me.fanxu.progressfragment.ex.states;

import me.fanxu.progressfragment.ex.R;

/**
 * by fanxu
 */
public class EmptyState extends AbstractShowState {
    @Override
    public void show(boolean animate) {
        showViewById(R.id.epf_empty, animate);
    }

    @Override
    public void dismiss(boolean animate) {
        dismissViewById(R.id.epf_empty, animate);
    }
}
