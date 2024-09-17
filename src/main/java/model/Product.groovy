package model

import javax.persistence.*

@Entity
@Table(name = "products")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id
    String name
    BigDecimal price
    LocalDateTime date = LocalDateTime.now()
}
