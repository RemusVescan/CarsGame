package org.example.competitor;

public interface Mobile {

    double accelerate(double speed, double durationInHours);

    double getTotalTravelDistance();

    boolean canMove();

    String getName();
}
