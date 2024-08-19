package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Number-circle-zero-bold`: ImageVector
    get() {
        if (`_number-circle-zero-bold` != null) {
            return `_number-circle-zero-bold`!!
        }
        `_number-circle-zero-bold` = Builder(name = "Number-circle-zero-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(128.0f, 68.0f)
                curveToRelative(-28.26f, 0.0f, -48.0f, 24.67f, -48.0f, 60.0f)
                reflectiveCurveToRelative(19.74f, 60.0f, 48.0f, 60.0f)
                reflectiveCurveToRelative(48.0f, -24.67f, 48.0f, -60.0f)
                reflectiveCurveTo(156.26f, 68.0f, 128.0f, 68.0f)
                close()
                moveTo(128.0f, 164.0f)
                curveToRelative(-23.33f, 0.0f, -24.0f, -32.32f, -24.0f, -36.0f)
                reflectiveCurveToRelative(0.67f, -36.0f, 24.0f, -36.0f)
                reflectiveCurveToRelative(24.0f, 32.32f, 24.0f, 36.0f)
                reflectiveCurveTo(151.33f, 164.0f, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_number-circle-zero-bold`!!
    }

private var `_number-circle-zero-bold`: ImageVector? = null
