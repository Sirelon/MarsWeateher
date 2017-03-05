package com.sirelon.marsweateher

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun initHeaderView() {
//        setupViewsForSetSol()
//
//        setupViewsForEarthDate()
//    }
//
//    private fun setupViewsForEarthDate() {
//        val calender = Calendar.getInstance(TimeZone.getDefault())
//        calender.clear()
//
//        val time = dateUtil.dateFromSol(queryRequest.sol)
//        updateDateEearthChoose(time)
//
//        calender.timeInMillis = time
//
//        val datePicker = DatePickerDialog(
//                this,
//                DatePickerDialog.OnDateSetListener
//                { datePicker, year, monthOfYear, dayOfMonth ->
//                    calender.clear()
//                    calender.set(year, monthOfYear, dayOfMonth)
//                    val chooseDateMil = calender.timeInMillis
//                    updateDateEearthChoose(chooseDateMil)
//                    loadDataBySol(dateUtil.solFromDate(chooseDateMil))
//                },
//                calender.get(Calendar.YEAR),
//                calender.get(Calendar.MONTH),
//                calender.get(Calendar.DAY_OF_MONTH))
//
//        datePicker.datePicker.maxDate = dateUtil.roverLastDate
//        datePicker.datePicker.minDate = dateUtil.roverLandingDate
//        dateEarthChoose.setOnClickListener {
//            // UPDATE TIME
//            val timeFromSol = dateUtil.dateFromSol(queryRequest.sol)
//
//            calender.timeInMillis = timeFromSol
//
//            datePicker.updateDate(
//                    calender.get(Calendar.YEAR),
//                    calender.get(Calendar.MONTH),
//                    calender.get(Calendar.DAY_OF_MONTH))
//
//            // Hide title. Need to set AFTER all
//            datePicker.setTitle("")
//            // SHOW DIALOG
//            datePicker.show()
//        }
//    }
//
//    private fun setupViewsForSetSol() {
//        val dialogView = layoutInflater.inflate(R.layout.view_choose_sol, null, false)
//
//        val dialog = AlertDialog.Builder(this)
//                .setView(dialogView)
//                .setNegativeButton("Cancel", null)
//                .setPositiveButton("Ok", {
//                    dialogInterface, i ->
//                    val sol = dialogView.solInput.text.toString().toLong()
//                    updateDateEearthChoose(dateUtil.dateFromSol(sol))
//                    loadDataBySol(sol)
//                }).create()
//
//        updateDateSolChoose()
//        dateSolChoose.setOnClickListener {
//            // Update views
//            dialogView.solSeekBar.max = rover.maxSol.toInt()
//            dialogView.solSeekBar.progress = queryRequest.sol.toInt()
//            val solStr = queryRequest.sol.toString()
//            dialogView.solInput.setText(solStr)
//            dialogView.solInput.setSelection(solStr.length)
//            // Show dialog
//            dialog.show()
//        }
//
//        val changeSubscription = Observable.create<CharSequence> {
//            // Some setup for seek and edittext
//            dialogView.solInput.addTextChangedListener(object : TextWatcher {
//                override fun afterTextChanged(p0: Editable?) {
//                }
//
//                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                }
//
//                override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                    it.onNext(text)
//                }
//            })
//        }
//                .filter { it.isNotEmpty() }
//                .filter { TextUtils.isDigitsOnly(it) }
//                .map { it.toString().toInt() }
//                .filter {
//                    if (it > rover.maxSol) {
//                        Toast.makeText(this, "The max sol for ${rover.name}'s rover is ${rover.maxSol}", Toast.LENGTH_SHORT).show()
//                        dialogView.solInput.setText("${rover.maxSol}")
//                        false
//                    } else {
//                        true
//                    }
//                }
//                .retry()
//                .subscribe({ dialogView.solSeekBar.progress = it }, { it.printStackTrace() })
//
//        subscriptions.add(changeSubscription)
//
//        dialogView.solSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
//            override fun onStartTrackingTouch(p0: SeekBar?) {
//            }
//
//            override fun onStopTrackingTouch(p0: SeekBar?) {
//            }
//
//            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
//                @Suppress("NAME_SHADOWING")
//                var progress = progress
//                if (progress <= 0) progress = 1
//                dialogView.solInput.setText("$progress")
//                dialogView.solInput.setSelection(dialogView.solInput.text.length)
//            }
//        })
//    }
//
//    private fun updateDateSolChoose() {
//        dateSolChoose.text = "Sol date: ${queryRequest.sol}"
//    }
//
//    private fun updateDateEearthChoose(time: Long) {
//        dateEarthChoose.text = "Earth date: ${dateUtil.parseTime(time)}"
//    }
//
//    private fun loadDataBySol(sol: Long) {
//        queryRequest.sol = sol
//        updateDateSolChoose()
//        // Clear adapter
//        (photosList.adapter as ViewTypeAdapter).clearAll()
//        loadFreshData()
//    }
}
