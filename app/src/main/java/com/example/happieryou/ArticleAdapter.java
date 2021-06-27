package com.example.happieryou;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class ArticleAdapter extends FirebaseRecyclerAdapter <ArticlesClass, ArticleAdapter.ArticleViewHolder>{


        /**
         * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
         * {@link FirebaseRecyclerOptions} for configuration options.
         *
         * @param options
         */
        Context context;
        public ArticleAdapter(@NonNull FirebaseRecyclerOptions<ArticlesClass> options, Context context) {
            super(options);
            this.context=context;
        }

        @Override
        protected void onBindViewHolder(@NonNull ArticleViewHolder holder, int position, @NonNull ArticlesClass model) {
            holder.tvTitle.setText(model.getTitle());
            holder.tvDesc.setText(model.getDescription());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(model.Link));
                    context.startActivity(browserIntent);
                }
            });
        }

        @NonNull
        @Override
        public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            // Create a new instance of the ViewHolder, in this case we are using a custom
            // layout called R.layout.message for each item
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.article_layout, parent, false);

            return new ArticleViewHolder(view);
        }

        public class ArticleViewHolder extends RecyclerView.ViewHolder{
            TextView tvTitle, tvDesc;
            public ArticleViewHolder(@NonNull View itemView) {
                super(itemView);
                tvTitle=itemView.findViewById(R.id.tvTitle);
                tvDesc=itemView.findViewById(R.id.tvDesc);

            }

    }


}
