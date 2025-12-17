# 🌍 My Multilingual App

**Activitat 5 – Internacionalització d’una app Android**

Aplicació Android multillenguatge desenvolupada en **Kotlin** amb **Android Studio**.
Forma part del mòdul **DAM0489 – Programació multimèdia i aplicacions mòbils**.

L’objectiu del projecte és aprendre a **internacionalitzar una aplicació Android**, separant correctament la lògica del codi i els recursos textuals, visuals i de disseny, seguint les bones pràctiques oficials d’Android.

---

## 🎯 Objectius del projecte

L’alumne ha d’aprendre a:

* Crear una aplicació Android multillenguatge
* Utilitzar **strings.xml** per gestionar textos
* Aplicar **Material Design 3**
* Treballar amb **ConstraintLayout**
* Implementar **tema Day/Night**
* Validar idiomes i mides de pantalla amb **Layout Validation**

---

## 🧠 Conceptes clau treballats (Teoria)

### 🌐 Internacionalització (i18n)

Android permet adaptar una app a diferents idiomes mitjançant **directoris de recursos**:

* `values/` → idioma per defecte
* `values-es/` → castellà
* `values-en/` → anglès
* `values-ca/` → català (opcional)

📌 Android selecciona automàticament l’idioma segons la configuració del dispositiu.

❗ **Mai** s’han d’escriure textos literals al codi ni als layouts.

---

### 🌓 Day / Night Theme

S’utilitza **Theme.Material3.DayNight**, que permet canviar colors i estils automàticament segons:

* tema clar
* tema fosc del sistema

Això es gestiona amb:

* `values/colors.xml`
* `values-night/colors.xml`

---

### 📐 ConstraintLayout

ConstraintLayout permet:

* dissenys flexibles
* adaptació a múltiples pantalles
* millor rendiment

És el layout recomanat per Android.

---

## 📂 Estructura del projecte

```
app/
└── src/
    └── main/
        ├── AndroidManifest.xml
        │
        ├── java/com/example/mymultilingualapp/
        │   └── MainActivity.kt
        │
        ├── res/
        │   ├── layout/
        │   │   └── activity_main.xml
        │   │
        │   ├── values/
        │   │   ├── strings.xml
        │   │   ├── colors.xml
        │   │   ├── dimens.xml
        │   │   ├── styles.xml
        │   │   └── themes.xml
        │   │
        │   ├── values-es/
        │   │   └── strings.xml
        │   │
        │   ├── values-en/
        │   │   └── strings.xml
        │   │
        │   ├── values-night/
        │   │   ├── colors.xml
        │   │   └── themes.xml
        │   │
        │   └── drawable/
```

---

## 🧩 Explicació del projecte

L’aplicació disposa d’una **pantalla principal** amb:

* Un **TextView** amb text multillenguatge
* Un botó **Informació** que mostra un Toast traduït
* Un botó **Sortir** que tanca l’app

Tots els textos s’obtenen mitjançant `getString()` des de `strings.xml`.

---

## 🛠️ Què ha de fer l’alumne (Pràctica obligatòria)

L’alumne ha de:

1. Crear una app Android amb **Kotlin**
2. Utilitzar **ConstraintLayout**
3. Definir **mínim 3 idiomes**
4. Centralitzar tots els textos a `strings.xml`
5. Mostrar un **Toast multillenguatge**
6. Aplicar **Material Design 3**
7. Implementar **Day/Night Theme**
8. Validar el disseny amb **Layout Validation**
9. Pujar el projecte a **GitHub**

📌 **Qualsevol text literal invalida l’activitat**

---

## ⭐ Pràctica extra (Ampliació – Punt extra)

L’alumne pot ampliar el projecte amb **UNA o més** opcions:

### 🔹 Opció A — Idioma manual

Permetre canviar l’idioma des de l’app amb botons o Spinner.

### 🔹 Opció B — Nous idiomes

Afegir un quart idioma i adaptar el disseny.

### 🔹 Opció C — Plurals

Utilitzar `plurals.xml` per gestionar quantitats.

### 🔹 Opció D — Accessibilitat

Millorar contrast, mida de text i `contentDescription`.

### 🔹 Opció E — Segona pantalla

Crear una segona Activity també multillenguatge.

---

## ✅ Avaluació

Es valorarà:

* ús correcte de recursos
* estructura del projecte
* absència de textos literals
* validació en diferents idiomes
* qualitat del codi
* implementació de pràctica extra

---

🧠 *“One app. Many languages. Zero excuses.”* 🌍📱