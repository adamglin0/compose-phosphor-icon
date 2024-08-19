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

public val DuotoneGroup.`Clock-clockwise-duotone`: ImageVector
    get() {
        if (`_clock-clockwise-duotone` != null) {
            return `_clock-clockwise-duotone`!!
        }
        `_clock-clockwise-duotone` = Builder(name = "Clock-clockwise-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -88.0f, -88.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 80.0f)
                verticalLineToRelative(43.47f)
                lineToRelative(36.12f, 21.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, 13.72f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(224.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(216.0f, 82.0f)
                curveToRelative(-6.35f, -7.36f, -12.83f, -14.45f, -20.12f, -21.83f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -2.0f, 137.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, -11.64f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 184.54f, 71.4f)
                curveTo(192.68f, 79.64f, 199.81f, 87.58f, 207.0f, 96.0f)
                lineTo(184.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_clock-clockwise-duotone`!!
    }

private var `_clock-clockwise-duotone`: ImageVector? = null
