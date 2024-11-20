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

public val DuotoneGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 168.0f)
                close()
                moveTo(48.23f, 128.0f)
                horizontalLineTo(207.77f)
                curveToRelative(7.16f, 0.0f, 10.89f, -8.27f, 6.0f, -13.37f)
                lineToRelative(-73.74f, -77.5f)
                arcToRelative(16.76f, 16.76f, 0.0f, false, false, -24.14f, 0.0f)
                lineToRelative(-73.74f, 77.5f)
                curveTo(37.34f, 119.73f, 41.07f, 128.0f, 48.23f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 152.0f)
                lineTo(48.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 168.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 152.0f)
                close()
                moveTo(208.0f, 192.0f)
                lineTo(48.0f, 192.0f)
                lineTo(48.0f, 168.0f)
                lineTo(208.0f, 168.0f)
                close()
                moveTo(48.24f, 136.0f)
                lineTo(207.76f, 136.0f)
                arcToRelative(16.18f, 16.18f, 0.0f, false, false, 14.93f, -9.76f)
                arcToRelative(15.59f, 15.59f, 0.0f, false, false, -3.1f, -17.12f)
                lineTo(145.86f, 31.61f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, false, -35.72f, 0.0f)
                lineTo(36.41f, 109.12f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.59f, 15.59f, 0.0f, false, false, -3.1f, 17.12f)
                arcTo(16.18f, 16.18f, 0.0f, false, false, 48.24f, 136.0f)
                close()
                moveTo(121.73f, 42.64f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, 12.54f, 0.0f)
                lineTo(207.85f, 120.0f)
                lineTo(48.14f, 120.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
