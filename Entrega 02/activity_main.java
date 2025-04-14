<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="24dp"
    android:background="@color/fundo">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/titulo"
        android:textSize="18sp"
        android:textColor="@color/texto"
        android:layout_marginBottom="16dp" />

    <EditText
        android:id="@+id/edtSalario"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="numberDecimal"
        android:hint="Ex: 2000.00"
        android:layout_marginBottom="16dp" />

    <RadioGroup
        android:id="@+id/rgPercentual"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/rb40"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/radio_40" />

        <RadioButton
            android:id="@+id/rb45"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/radio_45" />

        <RadioButton
            android:id="@+id/rb50"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/radio_50" />
    </RadioGroup>

    <Button
        android:id="@+id/btnCalcular"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/btn_calcular"
        android:backgroundTint="@color/verde_botao"
        android:textColor="@color/branco"
        android:layout_marginTop="24dp" />

    <TextView
        android:id="@+id/txtResultado"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/resultado"
        android:textSize="18sp"
        android:textColor="@color/texto"
        android:layout_marginTop="16dp" />
</LinearLayout>
