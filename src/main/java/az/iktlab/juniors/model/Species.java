package az.iktlab.juniors.model;

public enum Species {
    DOG(false,(byte)4,true),
    CAT(false,(byte)4,true),
    PIGEON(true,(byte)2,true),
    FISH(false,null,false),
    UNKNOWN(null,null,null);

    private final Boolean canFly;
    private final Byte numberOfLegs;
    private final Boolean hasFur;

    Species(Boolean canFly, Byte numberOfLegs, Boolean hasFur){
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public Boolean isCanFly() {
        return canFly;
    }

    public Byte getNumberOfLegs() {
        return numberOfLegs;
    }

    public Boolean isHasFur() {
        return hasFur;
    }
}
