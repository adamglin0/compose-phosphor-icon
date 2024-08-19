package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Airplanetaxiing: ImageVector
    get() {
        if (_airplanetaxiing != null) {
            return _airplanetaxiing!!
        }
        _airplanetaxiing = Builder(name = "Airplanetaxiing", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                lineTo(147.32f, 96.0f)
                lineTo(101.66f, 50.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 48.0f)
                lineTo(88.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.83f, 69.06f)
                lineToRelative(9.0f, 26.94f)
                lineTo(59.32f, 96.0f)
                lineTo(37.66f, 74.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 72.0f)
                lineTo(24.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.69f, 92.6f)
                lineToRelative(14.07f, 46.89f)
                arcTo(39.75f, 39.75f, 0.0f, false, false, 61.07f, 168.0f)
                lineTo(240.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 136.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 208.0f, 96.0f)
                close()
                moveTo(232.0f, 152.0f)
                lineTo(61.07f, 152.0f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, true, -23.0f, -17.1f)
                lineTo(24.0f, 88.0f)
                horizontalLineToRelative(4.68f)
                lineToRelative(21.66f, 21.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 112.0f)
                horizontalLineToRelative(36.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -10.53f)
                lineTo(88.0f, 64.0f)
                horizontalLineToRelative(4.68f)
                lineToRelative(45.66f, 45.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 112.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                close()
                moveTo(224.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 200.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return _airplanetaxiing!!
    }

private var _airplanetaxiing: ImageVector? = null
