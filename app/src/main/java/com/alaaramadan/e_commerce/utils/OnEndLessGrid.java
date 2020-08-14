package com.alaaramadan.e_commerce.utils;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class OnEndLessGrid extends RecyclerView.OnScrollListener {


    private boolean loading = true; // True if we are still waiting for the last set of data to load.
    private int visibleThreshold; // The minimum amount of items to have below your current scroll position before loading more.
    public int firstVisibleItem, visibleItemCount, totalItemCount;

    public int previousTotal = 0; // The total number of items in the dataset after the last load
    public int current_page = 1;
    public int previous_page = 1;

    private GridLayoutManager gridLayoutManager;

    public OnEndLessGrid(GridLayoutManager linearLayoutManager, int visibleThreshold) {
        this.gridLayoutManager = linearLayoutManager;
        this.visibleThreshold = visibleThreshold;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        visibleItemCount = recyclerView.getChildCount();
        totalItemCount = gridLayoutManager.getItemCount();
        firstVisibleItem = gridLayoutManager.findFirstVisibleItemPosition();

        if (loading) {
            if (totalItemCount > previousTotal) {
                loading = false;
                previousTotal = totalItemCount;
            }
        }

        if (!loading && (totalItemCount - visibleItemCount)
                <= (firstVisibleItem + visibleThreshold)) {
            // End has been reached


            // Do something
            current_page++;
            onLoadMore(current_page);
            loading = true;
        }
    }

    public abstract void onLoadMore(int current_page);
}
