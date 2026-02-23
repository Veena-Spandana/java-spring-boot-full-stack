package com.social.media.model;

import jakarta.persistence.*;

@Entity
public class SocialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
//    @OneToOne(mappedBy = "socialProfile")
    @JoinColumn(name = "social_user")
    private SocialUser user;
}
