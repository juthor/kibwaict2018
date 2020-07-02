#-*- coding:utf-8 -*-

from flask import Flask, render_template, redirect, url_for, request
from flask_bootstrap import Bootstrap

app = Flask(__name__)
Bootstrap(app) #the way to apply Bootstrap
@app.route('/', methods=['GET', 'POST'])
def login():
    error = None
    if request.method == 'POST':
        #if request.form['username'] != 'ks1' or request.form['password'] != 'ks1':
        #    error = 'Invalid Credentials. Please try again.'
        if request.form['username'] == 'ks2' and request.form['password']=='ks2':
            return redirect(url_for('Home'))
        elif request.form['username'] == 'ks1' and request.form['password']=='ks1':
            return redirect(url_for('Home'))
        elif request.form['username'] == 'kb1' and request.form['password']=='kb1':
            return redirect(url_for('Home'))
        else:
            error = 'Invalid Credentials. Please try again.'
    return render_template('index2.html', error=error)

@app.route('/Home')
def Home():
    return render_template('Home.html')
    
@app.route('/page1.html')
def page1():
    return render_template('page1.html')

@app.route('/cam.html')
def cam():
    return render_template('cam.html')

if __name__=="__main__":
    app.run(host='192.168.0.25', port=8888, debug=True)
 
