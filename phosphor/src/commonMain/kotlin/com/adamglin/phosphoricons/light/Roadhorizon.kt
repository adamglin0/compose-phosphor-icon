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

public val LightGroup.Roadhorizon: ImageVector
    get() {
        if (_roadhorizon != null) {
            return _roadhorizon!!
        }
        _roadhorizon = Builder(name = "Roadhorizon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.94f, 197.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.17f, -2.29f)
                lineTo(156.49f, 70.0f)
                lineTo(134.0f, 70.0f)
                lineTo(134.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 70.0f)
                lineTo(99.51f, 70.0f)
                lineTo(29.23f, 194.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.46f, -5.88f)
                lineTo(85.74f, 70.0f)
                lineTo(24.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(232.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(170.26f, 70.0f)
                lineToRelative(67.0f, 119.06f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 234.94f, 197.23f)
                close()
                moveTo(128.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 114.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 170.0f)
                close()
            }
        }
        .build()
        return _roadhorizon!!
    }

private var _roadhorizon: ImageVector? = null
