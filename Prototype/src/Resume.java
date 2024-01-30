public class Resume implements Cloneable {
    private String name;
    private String phone;
    private boolean experience;
    private String education;

    public Resume(String name, String phone, boolean experience, String education){
        this.name = name;
        this.phone = phone;
        this.experience = experience;
        this.education = education;
    }

    private Resume(Resume resume){
        this.name = resume.name;
        this.phone = resume.phone;
        this.experience = resume.experience;
        this.education = resume.education;
    }

    @Override
    public Resume clone() {
        return new Resume(this);
    }
}