package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Vignette-duotone`: ImageVector
    get() {
        if (`_vignette-duotone` != null) {
            return `_vignette-duotone`!!
        }
        `_vignette-duotone` = Builder(name = "Vignette-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(128.0f, 176.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, -21.49f, -64.0f, -48.0f)
                reflectiveCurveToRelative(28.65f, -48.0f, 64.0f, -48.0f)
                reflectiveCurveToRelative(64.0f, 21.49f, 64.0f, 48.0f)
                reflectiveCurveTo(163.35f, 176.0f, 128.0f, 176.0f)
                close()
            }
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
                moveTo(216.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                lineTo(216.0f, 200.0f)
                close()
                moveTo(178.05f, 87.66f)
                curveTo(164.59f, 77.56f, 146.81f, 72.0f, 128.0f, 72.0f)
                reflectiveCurveTo(91.41f, 77.56f, 78.0f, 87.66f)
                curveTo(63.79f, 98.27f, 56.0f, 112.6f, 56.0f, 128.0f)
                reflectiveCurveToRelative(7.79f, 29.73f, 22.0f, 40.34f)
                curveTo(91.41f, 178.44f, 109.19f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(36.59f, -5.56f, 50.05f, -15.66f)
                curveTo(192.21f, 157.73f, 200.0f, 143.4f, 200.0f, 128.0f)
                reflectiveCurveTo(192.21f, 98.27f, 178.05f, 87.66f)
                close()
                moveTo(128.0f, 168.0f)
                curveToRelative(-30.88f, 0.0f, -56.0f, -17.94f, -56.0f, -40.0f)
                reflectiveCurveToRelative(25.12f, -40.0f, 56.0f, -40.0f)
                reflectiveCurveToRelative(56.0f, 17.94f, 56.0f, 40.0f)
                reflectiveCurveTo(158.88f, 168.0f, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_vignette-duotone`!!
    }

private var `_vignette-duotone`: ImageVector? = null
