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

public val BoldGroup.`Medium-logo-bold`: ImageVector
    get() {
        if (`_medium-logo-bold` != null) {
            return `_medium-logo-bold`!!
        }
        `_medium-logo-bold` = Builder(name = "Medium-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 60.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, 68.0f, 68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 68.0f, 60.0f)
                close()
                moveTo(68.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 68.0f, 172.0f)
                close()
                moveTo(184.0f, 60.0f)
                curveToRelative(-23.63f, 0.0f, -36.0f, 34.21f, -36.0f, 68.0f)
                reflectiveCurveToRelative(12.37f, 68.0f, 36.0f, 68.0f)
                reflectiveCurveToRelative(36.0f, -34.21f, 36.0f, -68.0f)
                reflectiveCurveTo(207.63f, 60.0f, 184.0f, 60.0f)
                close()
                moveTo(184.0f, 171.87f)
                curveToRelative(-3.74f, -2.16f, -12.0f, -17.09f, -12.0f, -43.87f)
                reflectiveCurveToRelative(8.26f, -41.71f, 12.0f, -43.87f)
                curveToRelative(3.74f, 2.16f, 12.0f, 17.09f, 12.0f, 43.87f)
                reflectiveCurveTo(187.74f, 169.71f, 184.0f, 171.87f)
                close()
                moveTo(256.0f, 72.0f)
                lineTo(256.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(232.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_medium-logo-bold`!!
    }

private var `_medium-logo-bold`: ImageVector? = null
