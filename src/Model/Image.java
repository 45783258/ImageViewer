package Model;

public interface Image {
    byte[] bitmap();
    Image next();
    Image prev();
}
