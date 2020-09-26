# CBR-Prototype-COVID
A Prototype of a Case Based Reasoning System that may be useful to determine allocation of resources during the COVID pandemic

!!! Important Disclaimer: The dataset used in this project has been fabricated. It is NOT real. This project is a mere demonstration of the potential of case based reasoning in allocating resources in the COVID wards.

Case Based Reasoning is an Artificial Intelligence method that shows which of the known situations is the most similar to a new (previously unseen) case. By way of a literature survey, I've created a prototype of a CBR system to determine which patient is most similar to an incoming patient using various medical readings. Using this, we can determine the probability of how severely COVID will affect the incoming patient. If the most similar case died of COVID, then we know that the incoming patient is at high risk. Limited resources in a hospital can therefore be allocated to the most severe cases, in times of resource suffocation/lack of adequate resources.

Many, many thanks to the open source project at: <br>[https://github.com/wguilen/red-wine-quality-cbr](https://github.com/wguilen/red-wine-quality-cbr) for the skeletal structure of the CBR and for the Java Swing component.

CBR Systems typically comprise of the following 4 stages:

1. RETRIEVAL:
- Find the most similar cases from a database of previous cases. Any relevant cases must be considered.
- For each case considered, we need to observe:
  - Case details
  - Solution and its outcome – did the solution work or not
2. REUSE
- Mapping the previous case to this case. Draw similarities and differences.
For any difference in the case, we must consider how the solution will be affected.
3. REVISE
- Checking the solution and making any alterations to the result.
4. RETAIN
- Store the case details, solution and justification in the database for future reference.


References:

[1] http://theconversation.com/digital-diagnosis-intelligent-machines-do-a-better-job-than-humans-53116
<br>[2] https://emerj.com/ai-sector-overviews/machine-learning-medical-diagnostics-4-current-applications/
<br>[3] http://www.praxisemr.com/concept-processing.htm
<br>[4] Holt, Alec & Bichindaritz, Isabelle & Schmidt, Rainer & Perner, Petra. (2005). Medical applications in case-based reasoning. Knowledge Eng. Review. 20. 289-292. 10.1017/S0269888906000622
<br>[5] Choudhury, Nabanita & Ara, Shahin. (2016). A Survey on Case-based Reasoning in Medicine. International Journal of Advanced Computer Science and Applications. 7. 10.14569/IJACSA.2016.070820.
<br>[6] Holt, Alec & Bichindaritz, Isabelle & Schmidt, Rainer & Perner, Petra. (2005). Medical applications in case-based reasoning. Knowledge Eng. Review. 20. 289-292. 10.1017/S0269888906000622
<br>[7] M. U. Ahmed, S. Begum, P. Funk, N. Xiong, and B. Von Schéele, “Case-based reasoning for diagnosis of stress using enhanced cosine and fuzzy similarity,” Transactions on Case-Based Reasoning for Multimedia Data, vol. 1, no. 1, pp. 3-19, 2008.
<br>[8] S. Begum, M. U. Ahmed, P. Funk, N. Xiong, and B. Von Schéele, “A case‐based decision support system for individual stress diagnosis using fuzzy similarity matching,” Computational Intelligence, vol. 25, no. 3, pp. 180-195, 2009.
<br>[9] Machine Learning for Medical Diagnosis: History, State of the Art and Perspective Igor Kononenko
<br>[10] https://pdfs.semanticscholar.org/1bea/b7983a1aa6c37ef2fbf19462faa974604d5e.pdf
<br>[11] Corchado, J. M.; Bajo, J.; and Abraham, A. 2008. GERAmI: Improving the delivery of health care. In journal of IEEE Intelligent Systems. Special Issue on Ambient Intelligence. pp. 19-25
<br>[12] Begum, Shahina & Ahmed, Mobyen & Funk, Peter & Xiong, N & von Schéele, Bo. (2009). A Case-Based Decision Support System for Individual Stress Diagnosis Using Fuzzy Similarity Matching. Computational Intelligence. 25. 180-195. 10.1111/j.1467-8640.2009. 00337.x
<br>[13] https://thehealthcareblog.com/blog/2016/03/30/the-case-for-case-based-reasoning/
<br>[14] http://www.learninghealthcareproject.org/LHS_Report_2015.pdf
<br>[15] Foley, TJ, Vale, L.  What role for learning health systems in quality improvement within healthcare providers? Learn Health Sys.  2017. https://doi.org/10.1002/lrh2.10025
<br>[16] http://www.learninghealthcareproject.org/section/evidence/1/63/site-visit-to-geisinger-health-system
<br>[17] Machine Learning for Medical Diagnosis: History, State of the Art and Perspective Igor Kononenko
<br>[18] http://www.learninghealthcareproject.org/LHS_Report_2015.pdf
<br>[19] https://apps.who.int/iris/bitstream/handle/10665/37650/WHO_PHP_34.pdf?sequence=17
<br>[20] https://www.england.nhs.uk/wp-content/uploads/2015/01/nxt-steps-risk-strat-glewis.pdf
