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

public val DuotoneGroup.`Number-square-zero-duotone`: ImageVector
    get() {
        if (`_number-square-zero-duotone` != null) {
            return `_number-square-zero-duotone`!!
        }
        `_number-square-zero-duotone` = Builder(name = "Number-square-zero-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 72.0f)
                curveToRelative(-14.23f, 0.0f, -26.0f, 6.44f, -34.0f, 18.61f)
                curveToRelative(-6.47f, 9.86f, -10.0f, 23.14f, -10.0f, 37.39f)
                reflectiveCurveToRelative(3.56f, 27.53f, 10.0f, 37.39f)
                curveToRelative(8.0f, 12.17f, 19.74f, 18.61f, 34.0f, 18.61f)
                reflectiveCurveToRelative(26.0f, -6.44f, 34.0f, -18.61f)
                curveToRelative(6.47f, -9.86f, 10.0f, -23.14f, 10.0f, -37.39f)
                reflectiveCurveToRelative(-3.56f, -27.53f, -10.0f, -37.39f)
                curveTo(154.0f, 78.44f, 142.23f, 72.0f, 128.0f, 72.0f)
                close()
                moveTo(128.0f, 168.0f)
                curveToRelative(-22.1f, 0.0f, -28.0f, -25.14f, -28.0f, -40.0f)
                reflectiveCurveToRelative(5.9f, -40.0f, 28.0f, -40.0f)
                reflectiveCurveToRelative(28.0f, 25.14f, 28.0f, 40.0f)
                reflectiveCurveTo(150.1f, 168.0f, 128.0f, 168.0f)
                close()
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_number-square-zero-duotone`!!
    }

private var `_number-square-zero-duotone`: ImageVector? = null
