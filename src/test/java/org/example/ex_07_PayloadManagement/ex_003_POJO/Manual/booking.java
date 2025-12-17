package org.example.ex_07_PayloadManagement.ex_003_POJO.Manual;

public class booking {

    private String firstname;
    private String lastname;
    private Integer totalprice;
    private boolean depositpaid;
    private String additionalneeds;
    private bookingdates bookingdates;

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public bookingdates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(bookingdates bookingdates) {
        this.bookingdates = bookingdates;
    }


}
