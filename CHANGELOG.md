# Notas de versão

## v4.00.15

### ⚠️ Breaking Change — Atualização dos tipos da Reforma Tributária (DFeTiposBasicos)

As classes geradas a partir do `DFeTiposBasicos_v1.00.xsd` foram regeneradas conforme o schema atual da SEFAZ. Algumas alterações do schema mudam a API das classes, nos packages `schema_400` e `schema_400_eventos`:

| Classe | Antes | Depois |
|---|---|---|
| `TIS` | `getPISEspec()` / `setPISEspec(String)` | `getAdRemIS()` / `setAdRemIS(String)` |
| `TCompraGovReduzido` | `Object getRefDFeAnt()` / `setRefDFeAnt(Object)` | `List<String> getRefDFeAnt()` |
| `TTribNFGas` | `getGIBSCBSMono()` / `setGIBSCBSMono(TMonofasia)` | removido |
| `TTribNFe`, `TTribNFCe` | `gIBSCBS` do tipo `TCIBS` | `gIBSCBS` do tipo `TCIBSNFe` |
| `TPagAntecipado` | classe existente | removida (tipo não existe mais no schema; usar `TPagRef`) |

#### Como migrar

```java
// ANTES
compraGovReduzido.setRefDFeAnt(chave);
is.setPISEspec("1.0000");

// DEPOIS
compraGovReduzido.getRefDFeAnt().add(chave);
is.setAdRemIS("1.0000");
```

---

### Novidades v4.00.15

- Atualização dos schemas XSD do CT-e (`cteTiposBasico_v4.00.xsd`) e inclusão de `evVincPgto_v4.00.xsd` e `evCancVincPgto_v4.00.xsd`
- Novo campo `ISUFEmit` (inscrição do emitente na Suframa) no grupo `emit` de `TCTe`, `TCTeOS`, `TCTeSimp` e `TGTVe`
- Novos campos `tpPagAnt` e `gPagAntecipado` (com a lista `chDFePagAnt`) no grupo `ide` de `TCTe`, `TCTeOS` e `TCTeSimp`, para pagamento antecipado
- `procEmi` do CT-e e CT-e Simplificado aceita o valor `4` (emissão por Provedor de Autorização e Assinatura - PAA)
- Novas classes geradas nos packages `schema_400` e `schema_400_eventos`: `TALCZFMCBS`, `TALCZFMCBSNFe`, `TCIBSNFe`, `TPagRef`, `TTotalSN`, `TTribItemSN`
- `TCIBS`: novo grupo `gALCZFMCBS`
- `TCompraGov`: novo campo `refDFeAnt`
- `TDevTrib` (`schema_400_eventos`): novo campo `pDevTrib`, alinhado com o `schema_400`

---

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
