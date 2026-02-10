# High-Level Test Strategy (Sprint 1) — Business Homepage

## Scope: Business homepage
**In scope (Sprint 1):**
- Homepage loads from the backend root URL (`/`) and renders the main sections:
  - Top bar (logo/company name + nav buttons)
  - “Business Overview” hero section
  - Customers & Partners logos strip
  - Cards/sections describing services (Who We Serve / How We Work / Product Categories)
  - Footer (with current year)
- Static asset delivery:
  - CSS loads correctly (page is styled)
  - JavaScript loads correctly (dynamic behaviors work)
- Basic client-side behaviors:
  - “Cloud Platform” button click shows the current placeholder message/alert
  - Footer year automatically shows the current year
- Basic non-functional checks for the homepage:
  - Responsive layout (desktop/tablet/mobile)
  - Basic accessibility (keyboard navigation + visible focus + headings make sense)
  - No obvious console errors on page load

**Out of scope (later sprints):**
- Real navigation/routing for menu buttons (Home/About/Products/Partner/Contact)
- Authentication/login flows behind “Cloud Platform”
- Product catalog, cart, checkout, payment flows, admin workflows
- Performance/load testing beyond basic “page loads” checks

**Objective:**
- Ensure the public business homepage is stable, usable, and consistently testable via automated smoke checks in CI.

---

## Smoke tests
Smoke tests are fast checks that run on every commit / PR to confirm the homepage is “alive”.

**Backend + routing**
- GET `/` returns HTTP 200
- Page content includes the expected headline/section text (example: “Business Overview”)

**Static assets**
- GET `/css/styles.css` returns HTTP 200
- GET `/js/main.js` returns HTTP 200

**UI behavior (minimal)**
- Page loads without obvious UI breakage (no blank page)
- “Cloud Platform” button is visible and clickable
- Clicking “Cloud Platform” triggers the expected placeholder message/alert
- Footer year displays the current year

**Basic responsiveness**
- On mobile width, the layout does not overflow horizontally (no side-scrolling)
- Cards stack into a single column (or otherwise remain readable)

---

## Critical user scenarios
These are the highest-value scenarios for the public homepage. They become Selenium UI tests later.

### P0 (must-pass)
1. **Visitor opens the homepage**
   - Given the backend is running
   - When the visitor opens `/`
   - Then the homepage loads and core sections are visible (top bar, Business Overview, cards, footer)

2. **Visitor understands what the business offers**
   - The Business Overview text is visible and readable
   - The service/category cards are visible with headings and bullet/number content

3. **Visitor can interact with navigation controls**
   - Nav buttons are visible and clickable (even if routing is not implemented yet)

4. **Visitor clicks “Cloud Platform”**
   - Clicking shows the expected placeholder message/alert (current Sprint 1 behavior)

5. **Visitor sees correct footer year**
   - Footer year matches the current year

6. **Mobile visitor can read the page**
   - On small screens the layout remains readable (no overlapping sections / no horizontal scrolling)

### P1 (important)
7. **No obvious frontend errors**
   - Opening the homepage does not produce obvious JS errors (basic stability)

8. **Keyboard-only navigation works**
   - User can tab to interactive elements (buttons/links)
   - Focus is visible while tabbing

---

## Entry / exit criteria
### Entry criteria (start testing when)
- The backend starts successfully
- The homepage is reachable at `/`
- Static files are present in the project and served correctly (CSS/JS reachable)

### Exit criteria (Sprint 1 “done” for homepage testing)
- All P0 scenarios pass
- Smoke tests pass consistently (locally and in CI when CI is enabled)
- No critical defects:
  - Homepage does not load
  - Broken/unreadable layout on desktop or mobile
  - Missing CSS/JS
  - “Cloud Platform” click does not work (placeholder behavior broken)
  - Footer year not showing correctly
