package bean;
// Generated 04/12/2024 10:52:45 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PedidosProdutos generated by hbm2java
 */
@Entity
@Table(name="pedidos_produtos"
    ,catalog="aulas"
)
public class PedidosProdutos  implements java.io.Serializable {


     private Integer idpedidosProdutos;
     private Pedidos pedidos;
     private Produtos produtos;
     private Integer quantidade;
     private BigDecimal valorUnitario;

    public PedidosProdutos() {
    }

    public PedidosProdutos(Pedidos pedidos, Produtos produtos, Integer quantidade, BigDecimal valorUnitario) {
       this.pedidos = pedidos;
       this.produtos = produtos;
       this.quantidade = quantidade;
       this.valorUnitario = valorUnitario;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idpedidos_produtos", unique=true, nullable=false)
    public Integer getIdpedidosProdutos() {
        return this.idpedidosProdutos;
    }
    
    public void setIdpedidosProdutos(Integer idpedidosProdutos) {
        this.idpedidosProdutos = idpedidosProdutos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pedidos")
    public Pedidos getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="produtos")
    public Produtos getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    
    @Column(name="quantidade")
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    @Column(name="valorUnitario", precision=10)
    public BigDecimal getValorUnitario() {
        return this.valorUnitario;
    }
    
    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }




}


