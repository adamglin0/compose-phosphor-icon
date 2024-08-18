package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Paypal-logo-fill`: ImageVector
    get() {
        if (`_paypal-logo-fill` != null) {
            return `_paypal-logo-fill`!!
        }
        `_paypal-logo-fill` = Builder(name = "Paypal-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.12f, 93.54f)
                arcToRelative(55.8f, 55.8f, 0.0f, false, false, -20.19f, -16.18f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 144.0f, 24.0f)
                lineTo(84.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 68.48f, 36.12f)
                lineToRelative(-36.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f)
                horizontalLineToRelative(27.5f)
                lineToRelative(-3.0f, 12.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 232.0f)
                horizontalLineToRelative(31.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 135.0f, 219.88f)
                lineTo(144.0f, 184.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 44.14f, -90.46f)
                close()
                moveTo(48.0f, 184.0f)
                lineTo(84.0f, 40.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 39.3f, 32.49f)
                arcTo(57.0f, 57.0f, 0.0f, false, false, 176.0f, 72.0f)
                lineTo(120.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.53f, 12.12f)
                lineTo(79.52f, 184.0f)
                lineTo(48.0f, 184.0f)
                close()
                moveTo(214.77f, 137.7f)
                arcTo(39.94f, 39.94f, 0.0f, false, true, 176.0f, 168.0f)
                lineTo(144.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.52f, 12.12f)
                lineToRelative(-9.0f, 35.88f)
                lineTo(88.0f, 216.0f)
                lineToRelative(20.0f, -80.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(55.9f, 55.9f, 0.0f, false, false, 54.0f, -41.39f)
                arcToRelative(40.2f, 40.2f, 0.0f, false, true, 9.48f, 8.77f)
                arcTo(39.73f, 39.73f, 0.0f, false, true, 214.78f, 137.7f)
                close()
            }
        }
        .build()
        return `_paypal-logo-fill`!!
    }

private var `_paypal-logo-fill`: ImageVector? = null
