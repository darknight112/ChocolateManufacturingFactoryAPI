package com.Hisham.Task3.RequestObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetOrderRequestObject {
    Long productId;
    int quantity;
    String shipping_address;
}
