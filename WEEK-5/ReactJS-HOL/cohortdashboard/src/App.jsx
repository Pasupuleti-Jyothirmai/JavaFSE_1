import './App.css';
import CohortDetails from "./CohortDetails";

function App() {

  return (
      <div>

        <CohortDetails
            title="React Cohort"
            startedOn="10-Jul-2026"
            status="ongoing"
            coach="John"
            trainer="David"
        />

        <CohortDetails
            title="Java FSE Cohort"
            startedOn="01-Jun-2026"
            status="completed"
            coach="Smith"
            trainer="Alex"
        />

        <CohortDetails
            title="Angular Cohort"
            startedOn="15-Jul-2026"
            status="ongoing"
            coach="Williams"
            trainer="Robert"
        />

      </div>
  );
}

export default App;