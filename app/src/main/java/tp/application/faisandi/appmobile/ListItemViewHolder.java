package tp.application.faisandi.appmobile;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListItemViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewName;
    private String name;

    public ListItemViewHolder(@NonNull View itemView,final NameItemListener nameItemListener) {
        super(itemView);
        CardView cardView = itemView.findViewById(R.id.itemViewCardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameItemListener.clickOnItem(name);
            }
        });

        ImageView imageView = itemView.findViewById(R.id.itemListImageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameItemListener.clickOnCloss(name);
            }
        });


        this.textViewName = itemView.findViewById(R.id.listeItem_text_name);
    }

    public void setContent(String name){
        this.name=name;
        textViewName.setText(name);
    }
}
