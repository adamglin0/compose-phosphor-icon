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

public val DuotoneGroup.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) {
            return _trafficSignal!!
        }
        _trafficSignal = Builder(name = "TrafficSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 32.0f)
                lineTo(72.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(64.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(184.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(192.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 32.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 56.0f)
                close()
                moveTo(128.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 104.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 136.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
                moveTo(216.0f, 144.0f)
                lineTo(200.0f, 144.0f)
                lineTo(200.0f, 80.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(200.0f, 64.0f)
                lineTo(200.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 80.0f)
                verticalLineToRelative(64.0f)
                lineTo(40.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 160.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(200.0f, 160.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(184.0f, 216.0f)
                lineTo(72.0f, 216.0f)
                lineTo(72.0f, 40.0f)
                lineTo(184.0f, 40.0f)
                lineTo(184.0f, 216.0f)
                close()
            }
        }
        .build()
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
