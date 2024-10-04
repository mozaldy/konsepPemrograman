class Reservation{
  public String reservationId;
  public Movie movie;
  public Seat seat;

  public Reservation(String reservationId, Movie movie, Seat seat){
    this.reservationId = reservationId;
    this.movie = movie;
    this.seat = seat;
  }

  public void reserveSeat(){
    seat.isAvailable = false;
  }
}