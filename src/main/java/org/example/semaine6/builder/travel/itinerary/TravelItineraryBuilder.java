package org.example.semaine6.builder.travel.itinerary;

public interface TravelItineraryBuilder {
    TravelItineraryBuilder reset();

    TravelItineraryBuilder withFlight(String departure, String arrival);

    TravelItineraryBuilder withHotel(String hotelCity);

    TravelItineraryBuilder withTransportation();

    TravelItinerary build();
}
