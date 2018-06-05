package mezentseva.com.android.deliveryserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mezentseva.com.android.deliveryserver.Interface.ItemClickListener;
import mezentseva.com.android.deliveryserver.R;

public class OrderViewHolder extends RecyclerView.ViewHolder{

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    public Button btnEdit,btnRemove,btnDetail,btnDirection;

    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
        btnDetail = (Button)itemView.findViewById(R.id.btnDetail);
        btnDirection = (Button)itemView.findViewById(R.id.btnDirection);

    }
}
