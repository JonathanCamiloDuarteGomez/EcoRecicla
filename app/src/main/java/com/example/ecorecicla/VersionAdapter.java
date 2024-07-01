package com.example.ecorecicla;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionViewHolder> {
    private final List<Version> versionList;

    public VersionAdapter(List<Version> versionList) {
        this.versionList = versionList;
    }

    @NonNull
    @Override
    public VersionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new VersionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionViewHolder holder, int position) {
        Version version = versionList.get(position);
        holder.bind(version);
    }

    @Override
    public int getItemCount() {
        return versionList.size();
    }

    public class VersionViewHolder extends RecyclerView.ViewHolder {
        private final TextView codeNameText;
        private final TextView versionText;
        private final TextView apiLevelText;
        private final TextView descriptionText;
        private final LinearLayout linearLayout;
        private final RelativeLayout expandableLayout;

        public VersionViewHolder(@NonNull View itemView) {
            super(itemView);
            codeNameText = itemView.findViewById(R.id.code_name);
            versionText = itemView.findViewById(R.id.version);
            apiLevelText = itemView.findViewById(R.id.api_level);
            descriptionText = itemView.findViewById(R.id.description);
            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Version version = versionList.get(getAdapterPosition());
                    version.setExpanded(!version.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }

        public void bind(Version version) {
            codeNameText.setText(version.getCodeName());
            versionText.setText(version.getVersion());
            apiLevelText.setText(version.getApiLevel());
            descriptionText.setText(version.getDescription());
            expandableLayout.setVisibility(version.isExpanded() ? View.VISIBLE : View.GONE);
        }
    }
}
