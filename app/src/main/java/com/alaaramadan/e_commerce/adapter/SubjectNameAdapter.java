package com.alaaramadan.e_commerce.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubjectNameAdapter extends RecyclerView.Adapter <SubjectNameAdapter.SubjectNameViewHolder>{
    @NonNull
    @Override
    public SubjectNameAdapter.SubjectNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectNameAdapter.SubjectNameViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SubjectNameViewHolder extends RecyclerView.ViewHolder {
        public SubjectNameViewHolder(@NonNull View itemView) {
            super( itemView );
        }
    }
}
