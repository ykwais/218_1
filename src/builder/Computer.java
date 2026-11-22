package builder;

import java.util.Objects;

public class Computer {
  private final String processor;
  private final int ramGb;
  private final int storageGb;
  private final boolean graphicsCard;

  private Computer(Builder builder) {
    this.processor = builder.processor;
    this.ramGb = builder.ramGb;
    this.storageGb = builder.storageGb;
    this.graphicsCard = builder.graphicsCard;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "processor='" + processor + '\'' +
        ", ramGb=" + ramGb +
        ", storageGb=" + storageGb +
        ", graphicsCard=" + graphicsCard +
        '}';
  }

  public static class Builder {
    private final String processor;
    private int ramGb = 8;
    private int storageGb = 256;
    private boolean graphicsCard;

    public Builder(String processor) {
      this.processor = Objects.requireNonNull(processor, "Укажите процессор");
      if (processor.isBlank()) {
        throw new IllegalArgumentException("Укажите процессор");
      }
    }

    public Builder ramGb(int ramGb) {
      if (ramGb <= 0) {
        throw new IllegalArgumentException("Объём оперативной памяти должен быть больше нуля");
      }
      this.ramGb = ramGb;
      return this;
    }

    public Builder storageGb(int storageGb) {
      if (storageGb <= 0) {
        throw new IllegalArgumentException("Объём накопителя должен быть больше нуля");
      }
      this.storageGb = storageGb;
      return this;
    }

    public Builder graphicsCard(boolean graphicsCard) {
      this.graphicsCard = graphicsCard;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }
}
