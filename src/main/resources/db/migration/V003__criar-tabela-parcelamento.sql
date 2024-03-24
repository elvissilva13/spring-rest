 create table parcelamento(
    id bigint not null,
    cliente_id bigint not null,
    descricao varchar(20) not null,
    valor_total decimal(10,2) not null,
    quantidades_parcelas tinyint,
    data_criacao datetime not null,

    primary key (id)
 );

 alter table parcelamento add constraint fk_parcelamento_cliente foreign key(cliente id) references cliente (id);