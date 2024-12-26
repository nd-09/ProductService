package BuilderClass;

import lombok.Getter;

@Getter
public class BuilderClass {

    private String name;
    private int age;
    private String gender;
    private BuilderClass(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
    }
  public static Builder getBuilder(){
        return new Builder();
}
    public static class Builder{
        private String name;
        private int age;
        private String gender;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public BuilderClass build() {
            if (this.name != null && age > 18) {
                return new BuilderClass(this);
            } else {
                throw new RuntimeException("Please set valid name and age");
            }
        }
    }
}
