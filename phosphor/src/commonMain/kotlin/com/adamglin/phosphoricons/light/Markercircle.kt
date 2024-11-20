package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) {
            return _markerCircle!!
        }
        _markerCircle = Builder(name = "MarkerCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.12f, 55.87f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 55.88f, 200.12f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.87f)
                close()
                moveTo(86.0f, 207.64f)
                lineTo(86.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(31.64f)
                arcToRelative(90.32f, 90.32f, 0.0f, false, true, -84.0f, 0.0f)
                close()
                moveTo(104.0f, 142.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineTo(102.0f, 162.0f)
                lineTo(102.0f, 144.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 104.0f, 142.0f)
                close()
                moveTo(115.54f, 130.0f)
                lineTo(126.0f, 79.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.92f, 0.0f)
                lineTo(140.46f, 130.0f)
                close()
                moveTo(191.64f, 191.64f)
                arcTo(92.76f, 92.76f, 0.0f, false, true, 182.0f, 200.0f)
                lineTo(182.0f, 176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(166.0f, 144.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.27f, -14.0f)
                lineToRelative(-11.0f, -52.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -27.42f, 0.0f)
                lineToRelative(-11.0f, 52.9f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 90.0f, 144.0f)
                verticalLineToRelative(18.0f)
                lineTo(88.0f, 162.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(92.76f, 92.76f, 0.0f, false, true, -9.64f, -8.37f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 127.28f, 0.0f)
                close()
            }
        }
        .build()
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
