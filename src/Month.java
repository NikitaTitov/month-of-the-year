public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    NOVEMBER,
    DECEMBER;

    public int length(boolean leapYear) {
        switch (this) {
            case FEBRUARY:
                return (leapYear ? 29 : 28);
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }

    public Month nextMonth() {
        return Month.values()[this.ordinal() == 10 ? this.ordinal() - 10 : this.ordinal() + 1];
    }

    public Month prevMonth() {
       return Month.values()[this.ordinal() == 0 ? this.ordinal() + 10 : this.ordinal() - 1];

    }

}