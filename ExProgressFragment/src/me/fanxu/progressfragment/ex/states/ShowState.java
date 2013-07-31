package me.fanxu.progressfragment.ex.states;

import android.view.View;
import android.view.animation.Animation;

/**
 * by fanxu
 */
public interface ShowState {

    /**
     * 显示该状态
     * @param animate 是否动画
     */
    public void show(boolean animate);

    /**
     * 隐藏该状态
     * @param animate 是否动画
     */
    public void dismiss(boolean animate);

    /**
     * 设置FragmentView
     * @param fragmentView
     */
    public void setFragmentView(View fragmentView);

    /**
     * 进入动画
     * @param in
     */
    public void setAnimIn(Animation in);

    /**
     * 退出动画
     * @param out
     */
    public void setAnimOut(Animation out);
}
