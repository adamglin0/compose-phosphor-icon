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

public val FillGroup.`Siren-fill`: ImageVector
    get() {
        if (`_siren-fill` != null) {
            return `_siren-fill`!!
        }
        `_siren-fill` = Builder(name = "Siren-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 16.0f)
                lineTo(120.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(200.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineToRelative(-8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f)
                close()
                moveTo(50.34f, 45.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 61.66f, 34.34f)
                lineToRelative(-8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 37.66f)
                close()
                moveTo(232.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 88.67f, -88.0f)
                curveToRelative(48.15f, 0.36f, 87.33f, 40.29f, 87.33f, 89.0f)
                verticalLineToRelative(31.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 176.0f)
                close()
                moveTo(134.68f, 87.89f)
                curveTo(153.67f, 91.08f, 168.0f, 108.32f, 168.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                curveToRelative(0.0f, -27.4f, -20.07f, -51.43f, -46.68f, -55.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -2.64f, 15.78f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(216.0f, 176.0f)
                lineTo(40.0f, 176.0f)
                verticalLineToRelative(24.0f)
                lineTo(216.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_siren-fill`!!
    }

private var `_siren-fill`: ImageVector? = null
