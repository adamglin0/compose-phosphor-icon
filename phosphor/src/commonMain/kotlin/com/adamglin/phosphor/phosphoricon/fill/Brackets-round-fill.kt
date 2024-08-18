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

public val FillGroup.`Brackets-round-fill`: ImageVector
    get() {
        if (`_brackets-round-fill` != null) {
            return `_brackets-round-fill`!!
        }
        `_brackets-round-fill` = Builder(name = "Brackets-round-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(99.61f, 176.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.19f, 14.3f)
                arcTo(71.23f, 71.23f, 0.0f, false, true, 56.0f, 128.0f)
                arcTo(71.23f, 71.23f, 0.0f, false, true, 92.42f, 64.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.18f, 14.3f)
                curveTo(98.37f, 79.78f, 72.0f, 93.76f, 72.0f, 128.0f)
                reflectiveCurveTo(98.48f, 176.28f, 99.61f, 176.86f)
                close()
                moveTo(163.61f, 191.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -7.16f, -14.32f)
                curveToRelative(1.1f, -0.56f, 27.58f, -14.52f, 27.58f, -48.84f)
                reflectiveCurveToRelative(-26.48f, -48.28f, -27.61f, -48.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.19f, -14.3f)
                arcTo(71.23f, 71.23f, 0.0f, false, true, 200.0f, 128.0f)
                arcTo(71.23f, 71.23f, 0.0f, false, true, 163.58f, 191.16f)
                close()
            }
        }
        .build()
        return `_brackets-round-fill`!!
    }

private var `_brackets-round-fill`: ImageVector? = null
