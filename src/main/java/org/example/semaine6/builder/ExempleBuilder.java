package org.example.semaine6.builder;

import org.example.semaine6.builder.travel.TravelAgency;
import org.example.semaine6.builder.travel.itinerary.BudgetTravelItineraryBuilder;
import org.example.semaine6.builder.travel.itinerary.DeluxeTravelItineraryBuilder;
import org.example.semaine6.builder.travel.itinerary.TravelItinerary;
import org.example.semaine6.builder.travel.itinerary.TravelItineraryBuilder;

public class ExempleBuilder {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(new DeluxeTravelItineraryBuilder());

        System.out.println("Deluxe Travel options...");

        TravelItinerary fullPackageDeluxeTravelItinerary = travelAgency.createFullPackageItinerary("JFK", "LAX");
        System.out.println("Full Package Deluxe Travel Itinerary: " + fullPackageDeluxeTravelItinerary);

        TravelItinerary flightsOnlyDeluxeTravelItinerary = travelAgency.createFlightsOnlyItinerary("JFK", "LAX");
        System.out.println("Flights Only Deluxe Travel Itinerary: " + flightsOnlyDeluxeTravelItinerary);

        TravelItinerary flightsAndHotelDeluxeItinerary = travelAgency.createFlightsAndHotelItinerary("JFK", "LAX");
        System.out.println("Flights and Hotel Deluxe Travel Itinerary: " + flightsAndHotelDeluxeItinerary);


        travelAgency = new TravelAgency(new BudgetTravelItineraryBuilder());
        System.out.println("Budget Travel options...");

        TravelItinerary fullPackageBudgetTravelItinerary = travelAgency.createFullPackageItinerary("JFK", "LAX");
        System.out.println("Full Package Budget Travel Itinerary: " + fullPackageBudgetTravelItinerary);

        TravelItinerary flightsOnlyBudgetTravelItinerary = travelAgency.createFlightsOnlyItinerary("JFK", "LAX");
        System.out.println("Flights Only Budget Travel Itinerary: " + flightsOnlyBudgetTravelItinerary);

        TravelItinerary flightsAndHotelBudgetItinerary = travelAgency.createFlightsAndHotelItinerary("JFK", "LAX");
        System.out.println("Flights and Hotel Budget Travel Itinerary: " + flightsAndHotelBudgetItinerary);

    }

    public static void main2(String[] args) {
        final TravelItinerary travelItineraryBuilder = new DeluxeTravelItineraryBuilder()
                .reset()
                .withFlight("JFK", "LAX")
                .withHotel("LAX")
                .withTransportation()
                .build();
    }
}
