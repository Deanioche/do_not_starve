package hello.hellospring.domain;

public class Member {
    private Long Id;
    private String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String spring) {
        this.name=spring;
    }
}
