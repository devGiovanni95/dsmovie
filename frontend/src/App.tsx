import {ReactComponent as GithubIcon } from './assets/img/github.svg';

function App() {
  return(
    <header>
      <nav>
        <div>
          <h1>DSMovie</h1>
          <a href="https://github.com/devGiovanni95">
            <div>
              <GithubIcon/>
              <p>/devGiovanni95</p>
            </div>
            </a>
        </div>
      </nav>
    </header>
    );
}

export default App; 
