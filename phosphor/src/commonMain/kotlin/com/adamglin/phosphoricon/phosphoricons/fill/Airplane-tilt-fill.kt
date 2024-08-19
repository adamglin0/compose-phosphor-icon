package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Airplane-tilt-fill`: ImageVector
    get() {
        if (`_airplane-tilt-fill` != null) {
            return `_airplane-tilt-fill`!!
        }
        `_airplane-tilt-fill` = Builder(name = "Airplane-tilt-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.52f, 197.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.86f, 8.39f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 232.0f)
                arcToRelative(7.09f, 7.09f, 0.0f, false, true, -0.79f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.87f, -3.52f)
                lineToRelative(-44.07f, -66.12f)
                lineTo(112.0f, 183.59f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.34f, 5.65f)
                reflectiveCurveToRelative(-14.0f, 14.06f, -15.88f, 15.88f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 91.0f, 231.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.41f, -4.35f)
                lineToRelative(-0.06f, -0.15f)
                lineToRelative(-14.7f, -36.76f)
                lineTo(29.0f, 175.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.69f, -13.08f)
                lineToRelative(16.0f, -16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 144.0f)
                horizontalLineTo(72.4f)
                lineToRelative(21.27f, -21.27f)
                lineTo(27.56f, 78.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.22f, -12.32f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.39f, -1.86f)
                lineToRelative(85.94f, 31.25f)
                lineTo(176.2f, 40.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.6f, 39.6f)
                lineToRelative(-31.53f, 31.53f)
                close()
            }
        }
        .build()
        return `_airplane-tilt-fill`!!
    }

private var `_airplane-tilt-fill`: ImageVector? = null
