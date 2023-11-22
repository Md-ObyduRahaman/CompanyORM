package com.company.orm.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contact;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy ="customerModel")
    @JsonManagedReference
    private List<FeedbackModel> feedbacks;
}
