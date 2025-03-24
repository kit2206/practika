package com.example.myapplication

class ExamItem {
    var examName: String? = null
    var examDate: String? = null
    var examMessage: String? = null
    var examPic: Int? = null
    var examPic2: Int? = null

    constructor(examName:String, examDate:String, examMessage:String, examPic:Int, examPic2:Int){
        this.examName = examName
        this.examDate = examDate
        this.examMessage = examMessage
        this.examPic = examPic
        this.examPic2 = examPic2
    }

}
