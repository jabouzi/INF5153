package org.example.semaine6.builder.travel.itinerary;

import org.example.semaine6.builder.travel.components.flights.Flight;
import org.example.semaine6.builder.travel.components.hotels.Hotel;
import org.example.semaine6.builder.travel.components.transportation.CarTransportation;

import static org.example.semaine6.builder.travel.components.flights.FlightClass.ECONOMY;
import static org.example.semaine6.builder.travel.components.hotels.HotelRating.TOURIST;
import static org.example.semaine6.builder.travel.components.transportation.CarType.SMALL;
import static org.example.semaine6.builder.travel.components.transportation.TransmissionType.MANUAL;

public class BudgetTravelItineraryBuilder implements TravelItineraryBuilder {
    private TravelItinerary travelItinerary = new TravelItinerary();

    @Override
    public TravelItineraryBuilder reset() {
        travelItinerary = new TravelItinerary();
        return this;
    }

    @Override
    public TravelItineraryBuilder withFlight(String departure, String arrival) {
        travelItinerary.setFlight(new Flight(ECONOMY, departure, arrival));
        return this;
    }

    @Override
    public TravelItineraryBuilder withHotel(String hotelCity) {
        travelItinerary.setHotel(new Hotel(TOURIST, hotelCity));
        return this;
    }

    @Override
    public TravelItineraryBuilder withTransportation() {
        travelItinerary.setTransportation(new CarTransportation(SMALL, MANUAL));
        return this;
    }

    @Override
    public TravelItinerary build() {
        return travelItinerary;
    }
}
