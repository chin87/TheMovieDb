package com.chinmay.themoviedb.ui;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chinmay.themoviedb.BR;
import com.chinmay.themoviedb.R;
import com.chinmay.themoviedb.pojo.ListMovieDetailsResponse;

import java.util.ArrayList;


/**
 * Created by hp on 9/9/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesListBindingHolder> {

    private Context mContext;
    private ArrayList<ListMovieDetailsResponse> mStoryList;
    private IClick iClick;

    public MoviesAdapter(Context context, ArrayList<ListMovieDetailsResponse> storyList, IClick iClick) {
        mContext = context;
        mStoryList = storyList;
        this.iClick = iClick;
    }

    @Override
    public MoviesListBindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_item, parent,
                false);
        return new MoviesListBindingHolder(view);
    }

    @Override
    public void onBindViewHolder(MoviesListBindingHolder holder, int position) {
        final ListMovieDetailsResponse story = mStoryList.get(position);
        holder.getBinding().setVariable(BR.story, story);
        holder.getBinding().setVariable(BR.callback, this);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mStoryList.size();
    }

    public class MoviesListBindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;
        private ListMovieDetailsResponse storyResponse;

        public MoviesListBindingHolder(View rowView) {
            super(rowView);
            binding = DataBindingUtil.bind(rowView);
            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemCLicked(getStoryResponse());
                }
            });
        }

        public ViewDataBinding getBinding() {
            return binding;
        }

        private ListMovieDetailsResponse getStoryResponse() {
            return storyResponse;
        }

        private void setStoryResponse(ListMovieDetailsResponse storyResponse) {
            this.storyResponse = storyResponse;
        }
    }

    public interface IClick {
        public void clickedForUrl(long movieId);
    }

    public void update(int position, ListMovieDetailsResponse storyResponse) {
        mStoryList.set(position, storyResponse);
        notifyItemChanged(position);
    }

    public void itemCLicked(ListMovieDetailsResponse storyResponse) {
        Log.i("", "" + storyResponse.id);
        if (iClick != null) {
            iClick.clickedForUrl(storyResponse.id);
        }
    }
}
