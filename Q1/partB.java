public int dogWalkShift(int startHour, int endHour) {
    int amtEarned = 0;

    for (int hour = startHour; hour <= endHour; hour++) {
        int dogsWalked = walkDogs(hour);

        amtEarned += dogsWalked * 5;

        if (dogs == maxDogs || (hour >= 9 && hour <= 17)) {
            amtEarned += 3;
        }
    }
    return amtEarned;
}
