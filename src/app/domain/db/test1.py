import numpy as np
import pandas as pd 
from sklearn import preprocessing
df = pd.read_csv("/Users/umasubbiah/Documents/Eclipse/JAva/CBR3/src/app/domain/db/kidney_disease-3.csv")
df_copy = df.copy()
sc = preprocessing.MinMaxScaler()
df_copy = sc.fit_transform(df_copy)
df_copy = df_copy.fillna(-1)
df_new = pd.DataFrame(df_copy, columns = df.columns)
df_new.to_csv("/Users/umasubbiah/Documents/Eclipse/JAva/CBR3/src/app/domain/db/kidney_disease-3.csv")