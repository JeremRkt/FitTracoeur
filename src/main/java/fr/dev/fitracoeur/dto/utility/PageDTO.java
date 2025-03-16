package fr.dev.fitracoeur.dto.utility;

import java.util.List;

public class PageDTO<T> {
    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
}
