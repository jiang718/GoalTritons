<template>
  <div>
    <h1>Interview Prep</h1>
    <p id="opening">In this page, Go Tritons will walk you through how to prepare for the interview—the most
      nerve-racking part of job application. You will learn various interview questions, answer structures, and the
      entire interview process. You will also receive a wealth of advices and materials on how to master an interview.
      Let’s get started!</p>





    <div id="resume-vs-cv">
      <h2>Why Interview?</h2>

      <img src="../assets/whyInterview.svg" width="80%" alt="Why Interview?">

    </div>

    <div id="resume-breakdown">
      <h2>Interview Question Types</h2>

      <div>

        <p>Question Types</p>

        <span>Define Yourself</span>
        <span>Behavioral</span>
        <span>Technical</span>

      </div>

      <hr>

      <div>
        <h3>Define Yourself</h3>

        <p>“Define Yourself” type of questions helps the company to evaluate whether you are a <strong>good fit</strong> through learning about <strong>YOU</strong>.</p>

        <img src="../assets/sampleQ1.svg">
        <div>
          <h3>Tips</h3>
          <p>Point 1</p>
          <span>Research about the company/position</span>
          <div>
            <img src="../assets/researchEmoji.png">
            <dl>
              <dt>What to research?</dt>
              <dd>The company’s missions, recent challenges, products, customers, and your intended position’s responsibilities, etc.</dd>
            </dl>
          </div>

          <p>Point 2</p>
          <span>Practice on pitching yourself</span>
          <div>
            <img src="../assets/speachEmoji.png">
            <dl>
              <dt>What to pitch?</dt>
              <dd>Your background/accomplishments/interests/passion (refer to your Resume)</dd>
            </dl>
            <p>How to pitch? </p>
            <ul>
              <li>Reflect on what you are excel at and why you want to apply for this position in this company.</li>
              <li>Design a cohesive story of you in a past-present-future structure (your career trajectory & your career goal?)</li>
              <li>Connect your past experiences with what the company is looking for in the position.</li>
            </ul>
          </div>


        </div>
      </div>

      <hr>

      <div>
        <h3>Behavioral Questions</h3>
        <p>Bevaioral questions help the company to learn about how you would behave and deal with tough situations in
          the real workplace so that they can anticipate your performance. These are usually about soft skills
          (e.g. leadership) and personal attributes (e.g. persistency).</p>

        <img src="../assets/behaviorQ.svg">

        <div style="text-align: right">
          <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank" style="text-decoration: none; color: #1E4460">
            <p class ="link" style="display: inline; opacity: 80%">See More Sample Q&A under “More Resources”</p>
            &nbsp;
            <img src="../assets/arrow.png" width=22px style="vertical-align: middle">
          </a>
        </div>
      </div>

      <hr>

      <div>
        <h3>Technical Questions:</h3>
        <p>This part can vary a lot by different professions. Technical questions are usually specific to the topics in
          your fields. They help the company to evaluate your ability, skillset, professional level, and your potential
          to contribute to this specific position. </p>

        <img src="../assets/sampleQ2.svg">
        <div>
          <h3>Tips</h3>
          <p>Point 1</p>

          <span>Search online or read some interview guides for your specific professions.</span>
        </div>
      </div>
    </div>


    <div id="more-resources">
      <h2>More Resources</h2>

      <p class="ulTitle">Resume:</p>
      <ul>
        <li>Free Online Resume Builder: <a class="moreRes" href="//www.resume.com/" target="_blank">Resume Builder</a></li>

        <li>Resume Summary Examples: <a class="moreRes" href="//zety.com/blog/resume-summary#:~:text=Here's%20how%20to%20write%20a,can%20deliver%20results%20when%20hired" target="_blank">Professional Resume Summary Examples (25+ Statements)</a></li>
        <li>Resume Skills Examples: <a class="moreRes" href="//resumegenius.com/blog/resume-help/skills-for-resume" target="_blank"> Best Skills for Your Resume (Examples + How to List)</a></li>
        <li>Career Center: Create a Resume</li>
      </ul>
      <p class="ulTitle">CV:</p>

      <ul>
        <li>More examples for CV formatting: <a class="moreRes" href="//resumegenius.com/blog/cv-help/cv-format#conferences" target="_blank">Curriculum Vitae (CV) Format: Samples & Formatting Tips</a></li>
        <li>Cover Letter:</li>
        <li>Paraphrasing Tool: <a class="moreRes" href="//quillbot.com/" target="_blank">Paraphrasing Tool</a></li>
      </ul>
      <p class="ulTitle">More Articles for tips:</p>

      <ul>
        <li><a class="moreRes" href="//www.themuse.com/advice/how-to-quantify-your-resume-bullets-when-you-dont-work-with-numbers" target="_blank">Tips on quantifying your accomplishments</a></li>
        <li><a class="moreRes" href="//www.themuse.com/advice/4-ways-to-make-sure-your-resume-is-selling-you-as-the-one-for-the-job" target="_blank">4 Ways to Make Sure Your Resume Is Selling You as the One for the Job</a></li>
      </ul>
    </div>

  </div>
</template>

<script>
export default {
  name: "Interview"
}
</script>

<style scoped>
  .scrollbar-demo-item {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 50px;
    margin: 10px;
    text-align: center;
    border-radius: 4px;
    background: var(--el-color-primary-light-9);
    color: var(--el-color-primary);
  }
  .downloadTemplate{
    font-family: Inter;
    font-style: normal;
    font-weight: 600;
    font-size: 16px;
    width: 220px;
    height: 40px;
    border-radius: 0.5rem;
    padding: 0.5rem 1rem;
    background-color: #1E4460;
    border: hidden;
    margin-top: 5%;
    color: white;
    box-shadow: 0 4px 4px rgb(30 68 96 / 0.25);
  }
  .downloadTemplate:hover{
    background-color: #F4CE71;
    color: darkblue;
    border: hidden;
  }

  a{
    color: #1E4460;
  }

  .link:hover {
    text-decoration: underline;
  }


  .moreRes {
    color: #116FFC;
  }
  div{
    text-align: center;
  }

  h1, h2, h3{
    text-align: left;
  }

  .buttondiv{
    text-align: right;
    margin-bottom: 82px;
  }

  .resumecomp{
    display: flex;
    text-align: left;
  }
  .resumecomp > p{
    padding-top: 1rem;
  }

  .resumecomp > pre{
    padding-top: 1rem;
  }

  h3{
    margin-bottom: 50px;
    font-family: Inter;
    font-weight: 700;
    font-size: 16px;
    font-style: normal;
  }
  h1{
    margin-bottom: 100px;
    color: #1E4460;
    font-weight: 700;
    font-size: 26px;
    font-family: "Work Sans";
  }

  h2{
    font-family: "Work Sans";
    font-style: normal;
    font-size: 18px;
    font-weight: 700;
    color: #182B49;
    margin-bottom: 82px;
    margin-top: 95px;
    border-top: 1px solid black;
    border-bottom: 1px solid black;
    padding-top: 15px;
    padding-bottom: 15px;
  }

  #sample-resumes a{
    margin-right: 50px;
  }


  ul{
    text-align: left;
    margin-right: 15vw;
    margin-left: 15vw;
    font-family: Inter;
    font-size: 16px;
    font-weight: 400;
    font-style: normal;
  }

  #opening{
    font-family: Inter;
    font-size: 16px;
    font-style: normal;
    font-weight: 400;
    line-height: 19px;
    text-align: left;
    margin-right: 13vw;
    margin-left: 13vw;
  }
  .inlinePara{
    margin-bottom: 20px;
    margin-top: 50px;
  }
  .ulTitle{
    font-family: Inter;
    font-size: 16px;
    font-weight: 400;
    font-style: normal;
    text-align: left;
    margin-left: 13vw;
    margin-bottom: 0;
  }

  .headerWithLink{
    display: grid;
    grid-template-columns: 1fr 1fr;
    text-align: right;
  }


  .card {
    position: relative;
    display: inline-block;
    margin: 50px;
  }
  .card .img-top {
    display: none;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 99;
  }
  .card:hover .img-top {
    display: inline;
  }

  .img-bot {
    box-shadow: 0 4px 4px rgb(0 0 0 / 0.25);
  }

  #sample-resumes{
    display: grid;
    grid-auto-rows: auto auto;
    grid-template-columns: repeat(4, 1fr);
  }

  .resumeTemplate{
    grid-row: 2;
  }

  #resumeComponentHeader{
    grid-column-start: 1;
    grid-column-end: span 4;
    margin-top: 82px;
  }

  .sampleResumeTitle{
    font-family: Inter;
    font-size: 16px;
    font-weight: 550;
    font-style: normal;
    border-radius: 1rem;
    border: 1px solid black;
    width: auto;
    margin: auto;
    width: 185px;
    background-color: #1E4460;
    color: #F4CE71;
  }

  #polishVerbs{
    display: flex;
    text-align: center;
    margin: auto;
    width: 68vw;
  }

  #polishVerbs dl{
    border: 1px solid #e0ac79;
    margin-right: 10px;
    width: 100px;
    text-align: left;
  }
  #polishVerbs dt{
    text-align: center;
    font-size: 13px;
    border-bottom: 1px solid black;
    background-color: #F4CE71;
  }

  #polishVerbs dd{
    padding-left: 2px;
    font-size: 12px;
  }
</style>