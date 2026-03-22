# Notas de versão

## v4.00.14

### ⚠️ Breaking Change — Reorganização dos packages de schemas JAXB

Os packages de schemas gerados via JAXB foram completamente reorganizados. Se você usa esta biblioteca como dependência, **é necessário atualizar os imports** nos seus projetos.

#### Packages anteriores (removidos)

```
br.com.swconsultoria.cte.schema_100.*          (e todos os sub-packages)
br.com.swconsultoria.cte.schema_400.cte.*
br.com.swconsultoria.cte.schema_400.cteOS.*
br.com.swconsultoria.cte.schema_400.evento.*
br.com.swconsultoria.cte.schema_400.retCte.*
br.com.swconsultoria.cte.schema_400.*.<demais sub-packages>
```

#### Novos packages (flat, sem sub-pastas)

| Package novo | Conteúdo |
|---|---|
| `br.com.swconsultoria.cte.schema_400` | Classes do CT-e, CT-eOS e tipos básicos (83 classes) |
| `br.com.swconsultoria.cte.schema_400_eventos` | Classes dos eventos de CT-e (59 classes) |

#### Como migrar

Substitua todos os imports antigos pelos novos packages. Exemplos:

```java
// ANTES
import br.com.swconsultoria.cte.schema_400.cte.TCTe;
import br.com.swconsultoria.cte.schema_400.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_400.evento.evCancCTe.TEvento;
import br.com.swconsultoria.cte.schema_100.cte.TCTe;

// DEPOIS
import br.com.swconsultoria.cte.schema_400.TCTe;
import br.com.swconsultoria.cte.schema_400.TCTeOS;
import br.com.swconsultoria.cte.schema_400_eventos.TEvento;
```

> **Regra geral:** qualquer classe relacionada a **eventos** vai para `schema_400_eventos`; todo o restante vai para `schema_400`.

#### Motivo da mudança

Os schemas XSD do CT-e e dos eventos definem tipos compartilhados (ex: `TModTransp`) no mesmo namespace, causando conflito quando gerados juntos. A separação em dois packages flat elimina os conflitos e simplifica a estrutura, reduzindo de 28+ sub-packages para apenas 2 packages.

---

### Novidades v4.00.14

- Atualização dos schemas XSD para versão 4.00 (novos schemas SEFAZ)
- Suporte à **Reforma Tributária — IBS/CBS**: novo utilitário `IbsCbsUtil` para cálculo e preenchimento automático do grupo `IBSCBS` no CT-e e CT-eOS
- Novos DTOs: `CstDTO`, `ClassificacaoTributariaDTO`, `DocumentoCteEnum`
- Atualizado Cacert e certificados Java
