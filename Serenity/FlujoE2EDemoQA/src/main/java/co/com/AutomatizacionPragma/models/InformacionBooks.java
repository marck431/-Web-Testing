package co.com.AutomatizacionPragma.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InformacionBooks {
    public String isbn;
    private String title;
    private String subTitle;
    private String author;
    private String publish_date;
    private String publisher;
    private String pages;
    private String description;
}
