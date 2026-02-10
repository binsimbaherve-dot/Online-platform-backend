# Smoke Tests (Sprint 1) — Backend + Homepage

## Purpose
Fast checks to confirm the build is “alive” after every commit/PR.

## Manual smoke checklist (run in 2–5 minutes)

### Backend health
- Start the backend successfully (no crash on startup).
- GET `/api/v1/health` returns HTTP 200 and status shows UP (or expected response).

### Homepage
- Open `/` in the browser.
- Confirm page renders key sections (top bar, Business Overview, cards, footer).

### Static assets
- CSS loads (page is styled).
- JS loads (footer year updates).
- “Cloud Platform” button click shows the placeholder alert/message.

### Basic negative checks
- Open a nonsense URL like `/does-not-exist` → returns 404 (no stack trace shown to the user).
