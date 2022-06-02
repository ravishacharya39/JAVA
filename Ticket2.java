class Ticket2
{
private int ticketno;
private String arrivalplace;
private String departureplace;
private int nooftickets;

Ticket2(int ticketno)
{
this.ticketno=ticketno;
}

Ticket2(int ticketno,String arrivalplace)
{
this(int ticketno);
this.arrivalplace=arrivalplace;
}

Ticket2(int ticketno,String arrivalplace,String departureplace)
{
this(int ticketno,arrivalplace);
this.departureplace=departureplace;
}


Ticket2(int ticketno,String arrivalplace,String departureplace,int nooftickets)
{
this(int ticketno,String arrivalplace,String departureplace);
this.nooftickets=nooftickets;
}

public int getticketno()
{
return ticketno;
}

public String getarrivalplace()
{
return arrivalplace;
}

public String getdepartureplace()
{
return departureplace;
}

public int getnooftickets()
{
return nooftickets;
}

public void setticketno(int ticketno)
{
this.ticketno=ticketno;
}

public void setarrivalplace(String arrivalplace)
{
this.arrivalplace=arrivalplace;
}

public void setdepartureplace(String departureplace)
{
this.departureplace=departureplace;
}

public void intnooftickets(int nooftickets)
{
this.nooftickets=nooftickets;
}

