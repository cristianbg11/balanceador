package com.pucmm.dockeraltadisponibilidad.cornelia;

public class entidadPublica {
    public Integer resultado1;
    public Integer resultado2;
    public Integer resultado3;
    public Integer resultado4;
}

  /*cornelia2-service:
          restart: always
          image: repdom/docker-cornelia-app
          environment:
          - SERVER_PORT=8081
          networks:
          - cornelia
          depends_on:
          - mariadb
          ports:
          - "8081"
          cornelia3-service:
          restart: always
          image: repdom/docker-cornelia-app
          environment:
          - SERVER_PORT=8082
          networks:
          - cornelia
          depends_on:
          - mariadb
          ports:
          - "8082"
          ha-proxy:
          restart: always
          networks:
          - cornelia
          depends_on:
          - cornelia-service
          - cornelia2-service
          - cornelia3-service
          image: haproxy:2.0.2
          volumes:
          - ./etc:/usr/local/etc/haproxy
          ports:
          - "81:80"*/
