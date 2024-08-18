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

public val FillGroup.`Cylinder-fill`: ImageVector
    get() {
        if (`_cylinder-fill` != null) {
            return `_cylinder-fill`!!
        }
        `_cylinder-fill` = Builder(name = "Cylinder-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                curveTo(87.63f, 16.0f, 56.0f, 35.33f, 56.0f, 60.0f)
                lineTo(56.0f, 196.0f)
                curveToRelative(0.0f, 24.67f, 31.63f, 44.0f, 72.0f, 44.0f)
                reflectiveCurveToRelative(72.0f, -19.33f, 72.0f, -44.0f)
                lineTo(200.0f, 60.0f)
                curveTo(200.0f, 35.33f, 168.37f, 16.0f, 128.0f, 16.0f)
                close()
                moveTo(128.0f, 224.0f)
                curveToRelative(-29.83f, 0.0f, -56.0f, -13.08f, -56.0f, -28.0f)
                lineTo(72.0f, 77.43f)
                curveTo(82.92f, 88.5f, 103.9f, 96.0f, 128.0f, 96.0f)
                reflectiveCurveToRelative(45.08f, -7.5f, 56.0f, -18.57f)
                lineTo(184.0f, 196.0f)
                curveTo(184.0f, 210.92f, 157.83f, 224.0f, 128.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_cylinder-fill`!!
    }

private var `_cylinder-fill`: ImageVector? = null
