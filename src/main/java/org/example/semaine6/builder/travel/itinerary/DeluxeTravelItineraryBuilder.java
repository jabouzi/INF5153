package org.example.semaine6.builder.travel.itinerary;


import org.example.semaine6.builder.travel.components.flights.Flight;
import org.example.semaine6.builder.travel.components.hotels.Hotel;
import org.example.semaine6.builder.travel.components.transportation.CarTransportation;

import static org.example.semaine6.builder.travel.components.flights.FlightClass.FIRST;
import static org.example.semaine6.builder.travel.components.hotels.HotelRating.LUXURY;
import static org.example.semaine6.builder.travel.components.transportation.CarType.PREMIUM;
import static org.example.semaine6.builder.travel.components.transportation.TransmissionType.AUTOMATIC;

public class DeluxeTravelItineraryBuilder implements TravelItineraryBuilder {
    private TravelItinerary travelItinerary = new TravelItinerary();

    @Override
    public TravelItineraryBuilder reset() {
        travelItinerary = new TravelItinerary();
        return this;
    }

    @Override
    public TravelItineraryBuilder withFlight(String departure, String arrival) {
        travelItinerary.setFlight(new Flight(FIRST, departure, arrival));
        return this;
    }

    @Override
    public TravelItineraryBuilder withHotel(String hotelCity) {
        travelItinerary.setHotel(new Hotel(LUXURY, hotelCity));
        return this;
    }

    @Override
    public TravelItineraryBuilder withTransportation() {
        travelItinerary.setTransportation(new CarTransportation(PREMIUM, AUTOMATIC));
        return this;
    }

    @Override
    public TravelItinerary build() {
        return travelItinerary;
    }
}
