package com.adamglin.phosphoricons.duotone

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
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 136.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(61.06f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -30.65f, -22.8f)
                lineTo(16.34f, 90.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(24.0f, 24.0f)
                horizontalLineTo(92.91f)
                lineTo(80.42f, 66.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(48.0f, 48.0f)
                horizontalLineToRelative(64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 240.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(72.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                lineTo(216.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
                moveTo(248.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(61.07f, 168.0f)
                arcToRelative(39.75f, 39.75f, 0.0f, false, true, -38.31f, -28.51f)
                lineTo(8.69f, 92.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 24.0f, 72.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f)
                lineTo(59.32f, 96.0f)
                lineTo(81.81f, 96.0f)
                lineToRelative(-9.0f, -26.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 48.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineTo(147.32f, 96.0f)
                lineTo(208.0f, 96.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 136.0f)
                close()
                moveTo(232.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(144.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, -2.34f)
                lineTo(92.69f, 64.0f)
                lineTo(88.0f, 64.0f)
                lineToRelative(12.49f, 37.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.91f, 112.0f)
                lineTo(56.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -2.34f)
                lineTo(28.69f, 88.0f)
                lineTo(24.0f, 88.0f)
                lineToRelative(14.07f, 46.9f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, false, 23.0f, 17.1f)
                lineTo(232.0f, 152.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
