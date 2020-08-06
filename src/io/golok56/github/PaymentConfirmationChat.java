package io.golok56.github;

public class PaymentConfirmationChat extends Chat {
    private String orderNum;

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public Chat clone() {
        PaymentConfirmationChat paymentConfirmationChat = new PaymentConfirmationChat();
        paymentConfirmationChat.setOrderNum(orderNum);
        paymentConfirmationChat.setId(getId());
        return paymentConfirmationChat;
    }

    @Override
    public String getResponseText() {
        return "Udah yakin nih kak mau bayar pemesanan dengan nomer " + orderNum + "?";
    }
}