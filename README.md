# Golf Stay Package Calculator

![Java](https://img.shields.io/badge/Java-console_application-ED8B00?style=flat-square&logo=openjdk&logoColor=white)

A Java command-line calculator for hotel and golf packages. It combines the applicable room, meal, guest, and golf-round charges for three package tiers.

## Package codes

| Code | Package | Inputs |
|---|---|---|
| `RO` | Room only | Room charge |
| `RM` | Room plus meals | Room charge and number of guests |
| `SP` | Stay and play | Room, guests, and golf rounds |

## Run locally

Requires Java 11 or newer.

```bash
javac "Main.java"
java Main
```

## Implementation note

The package menu uses intentional `switch` fall-through: `SP` accumulates golf, guest, and room charges; `RM` accumulates guest and room charges; and `RO` adds only the room charge.

## Limitations

- Package codes are case-sensitive.
- Negative guest and round counts are not rejected.
- Pricing values are embedded in source code.

This repository is retained as a focused Java control-flow exercise.

## License

No license has been selected for this educational project.
