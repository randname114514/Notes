---
description: "Agent guidance for this legacy Android Notes codebase"
---

# Agent Guide

## Scope
- This is a legacy, pre-Android Studio project (no Gradle/Maven build files found).
- Package root: `net.micode.notes` in `src/net/micode/notes/`.

## Where Things Live
- Data layer (ContentProvider + SQLite): `src/net/micode/notes/data/`
- UI activities/widgets: `src/net/micode/notes/ui/`, `src/net/micode/notes/widget/`
- Sync/remote (Google Tasks): `src/net/micode/notes/gtask/`
- Models and utilities: `src/net/micode/notes/model/`, `src/net/micode/notes/tool/`
- Android resources: `res/`

## Key Entry Points
- Launcher activity: `src/net/micode/notes/ui/NotesListActivity.java`
- ContentProvider gateway: `src/net/micode/notes/data/NotesProvider.java`
- DB schema/versioning: `src/net/micode/notes/data/NotesDatabaseHelper.java`

## Conventions / Notes
- ContentProvider authority: `micode_notes` (see `Notes.java`).
- Localization folders: `res/values-zh-rCN/`, `res/values-zh-rTW/`.
- Database version is tracked in `NotesDatabaseHelper`.

## Docs
- Architecture survey report: docs/软件体系结构风格调研报告.md
