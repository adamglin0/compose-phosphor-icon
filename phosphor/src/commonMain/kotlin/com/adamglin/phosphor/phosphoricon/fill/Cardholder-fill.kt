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

public val FillGroup.`Cardholder-fill`: ImageVector
    get() {
        if (`_cardholder-fill` != null) {
            return `_cardholder-fill`!!
        }
        `_cardholder-fill` = Builder(name = "Cardholder-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 72.0f)
                lineTo(24.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(208.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(232.0f, 72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 48.0f)
                close()
                moveTo(152.0f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(40.0f, 112.0f)
                lineTo(40.0f, 96.0f)
                lineTo(216.0f, 96.0f)
                verticalLineToRelative(16.0f)
                lineTo(160.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 120.0f)
                close()
                moveTo(48.0f, 64.0f)
                lineTo(208.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(40.0f, 80.0f)
                lineTo(40.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_cardholder-fill`!!
    }

private var `_cardholder-fill`: ImageVector? = null
