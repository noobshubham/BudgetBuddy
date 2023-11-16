// Generated by view binder compiler. Do not edit!
package com.example.budgetbuddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.budgetbuddy.R;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomBottomSheetDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialAutoCompleteTextView autoCompleteText;

  @NonNull
  public final TextInputEditText dialogAmount;

  @NonNull
  public final ImageView dialogBack;

  @NonNull
  public final TextInputEditText dialogDate;

  @NonNull
  public final TextInputEditText dialogNote;

  @NonNull
  public final RadioGroup dialogPaymentMode;

  @NonNull
  public final MaterialRadioButton dialogPaymentModeCash;

  @NonNull
  public final MaterialRadioButton dialogPaymentModeOnline;

  @NonNull
  public final TextView dialogSave;

  private CustomBottomSheetDialogBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialAutoCompleteTextView autoCompleteText,
      @NonNull TextInputEditText dialogAmount, @NonNull ImageView dialogBack,
      @NonNull TextInputEditText dialogDate, @NonNull TextInputEditText dialogNote,
      @NonNull RadioGroup dialogPaymentMode, @NonNull MaterialRadioButton dialogPaymentModeCash,
      @NonNull MaterialRadioButton dialogPaymentModeOnline, @NonNull TextView dialogSave) {
    this.rootView = rootView;
    this.autoCompleteText = autoCompleteText;
    this.dialogAmount = dialogAmount;
    this.dialogBack = dialogBack;
    this.dialogDate = dialogDate;
    this.dialogNote = dialogNote;
    this.dialogPaymentMode = dialogPaymentMode;
    this.dialogPaymentModeCash = dialogPaymentModeCash;
    this.dialogPaymentModeOnline = dialogPaymentModeOnline;
    this.dialogSave = dialogSave;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomBottomSheetDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomBottomSheetDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_bottom_sheet_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomBottomSheetDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.auto_complete_text;
      MaterialAutoCompleteTextView autoCompleteText = ViewBindings.findChildViewById(rootView, id);
      if (autoCompleteText == null) {
        break missingId;
      }

      id = R.id.dialog_amount;
      TextInputEditText dialogAmount = ViewBindings.findChildViewById(rootView, id);
      if (dialogAmount == null) {
        break missingId;
      }

      id = R.id.dialog_back;
      ImageView dialogBack = ViewBindings.findChildViewById(rootView, id);
      if (dialogBack == null) {
        break missingId;
      }

      id = R.id.dialog_date;
      TextInputEditText dialogDate = ViewBindings.findChildViewById(rootView, id);
      if (dialogDate == null) {
        break missingId;
      }

      id = R.id.dialog_note;
      TextInputEditText dialogNote = ViewBindings.findChildViewById(rootView, id);
      if (dialogNote == null) {
        break missingId;
      }

      id = R.id.dialog_payment_mode;
      RadioGroup dialogPaymentMode = ViewBindings.findChildViewById(rootView, id);
      if (dialogPaymentMode == null) {
        break missingId;
      }

      id = R.id.dialog_payment_mode_cash;
      MaterialRadioButton dialogPaymentModeCash = ViewBindings.findChildViewById(rootView, id);
      if (dialogPaymentModeCash == null) {
        break missingId;
      }

      id = R.id.dialog_payment_mode_online;
      MaterialRadioButton dialogPaymentModeOnline = ViewBindings.findChildViewById(rootView, id);
      if (dialogPaymentModeOnline == null) {
        break missingId;
      }

      id = R.id.dialog_save;
      TextView dialogSave = ViewBindings.findChildViewById(rootView, id);
      if (dialogSave == null) {
        break missingId;
      }

      return new CustomBottomSheetDialogBinding((LinearLayout) rootView, autoCompleteText,
          dialogAmount, dialogBack, dialogDate, dialogNote, dialogPaymentMode,
          dialogPaymentModeCash, dialogPaymentModeOnline, dialogSave);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}