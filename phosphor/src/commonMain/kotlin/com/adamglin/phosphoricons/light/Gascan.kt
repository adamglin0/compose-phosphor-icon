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

public val LightGroup.GasCan: ImageVector
    get() {
        if (_gasCan != null) {
            return _gasCan!!
        }
        _gasCan = Builder(name = "GasCan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 26.0f)
                lineTo(123.31f, 26.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, 4.1f)
                lineTo(101.66f, 41.86f)
                lineTo(89.9f, 30.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f)
                lineTo(57.86f, 85.66f)
                lineTo(46.1f, 97.41f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f)
                lineTo(42.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 26.0f)
                close()
                moveTo(54.59f, 65.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f)
                lineTo(93.17f, 50.34f)
                lineTo(66.34f, 77.17f)
                close()
                moveTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 107.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.41f)
                lineToRelative(16.0f, -16.0f)
                horizontalLineToRelative(0.0f)
                lineTo(105.9f, 54.59f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, -0.59f)
                lineTo(200.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(182.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(136.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 64.0f)
                close()
                moveTo(179.6f, 124.8f)
                lineTo(138.0f, 156.0f)
                lineToRelative(41.6f, 31.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.2f, 9.6f)
                lineTo(128.0f, 163.5f)
                lineTo(83.6f, 196.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.2f, -9.6f)
                lineTo(118.0f, 156.0f)
                lineTo(76.4f, 124.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.2f, -9.6f)
                lineTo(128.0f, 148.5f)
                lineToRelative(44.4f, -33.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.2f, 9.6f)
                close()
            }
        }
        .build()
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
