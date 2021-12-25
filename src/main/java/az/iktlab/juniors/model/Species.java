package az.iktlab.juniors.model;

public enum Species {
    DOG(false,(byte)4,true),
    CAT(false,(byte)4,true),
    PIGEON(true,(byte)2,true);

    private final boolean canFly;
    private final byte numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, byte numberOfLegs, boolean hasFur){
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public byte getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
