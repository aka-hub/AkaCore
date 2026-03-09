# AkaCore

**AkaCore** is a core mod that provides a shared creative tab for Aka mod series.  
**AkaCore**는 Aka 모드 시리즈가 공유하는 크리에이티브 탭을 제공하는 코어 모드입니다.

---

## Requirements / 요구사항

- Minecraft 1.21.1
- NeoForge

---

## What it does / 기능

- Registers a shared creative tab (`AkaQoL`) used by other Aka mods
- 다른 Aka 모드들이 사용하는 공용 크리에이티브 탭(`AkaQoL`)을 등록합니다

---

## For developers / 개발자용

Add AkaCore as a dependency in your `mods.toml`:

```toml
[[dependencies.yourmod]]
    modId = "akacore"
    type = "required"
    versionRange = "[1,)"
    ordering = "BEFORE"
    side = "BOTH"
```

Then register your items to the tab using the tab key:

```java
private static final ResourceKey<CreativeModeTab> CORE_TAB_KEY = ResourceKey.create(
    Registries.CREATIVE_MODE_TAB,
    ResourceLocation.fromNamespaceAndPath("akacore", "aka_qol_tab")
);
```

---

## Mods using AkaCore / 사용 모드

- [AkaRadarChart] 
- [AkaImage] 

---

## License
MIT
