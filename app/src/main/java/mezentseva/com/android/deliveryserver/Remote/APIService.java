package mezentseva.com.android.deliveryserver.Remote;

import mezentseva.com.android.deliveryserver.Model.MyResponse;
import mezentseva.com.android.deliveryserver.Model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAGM3oxEo:APA91bFlu_WFIjPPzrbbJnJlTG35SeinmPh7YrpUDemlLyfyEy3ku2TsXzbYwk9WY-IsMFVHs5L8K-irByNZ2Xzd2hTVB8sTZMJuPxCbZL9oUGylCeAMpFXcdGQRm77oQCbR0KrakMyq"
            }


    )
    @POST("fcm/send")
    Call<MyResponse> sendNotifivation(@Body Sender body);
}
