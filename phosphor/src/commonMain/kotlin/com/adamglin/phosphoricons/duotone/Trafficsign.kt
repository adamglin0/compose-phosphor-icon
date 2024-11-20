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

public val DuotoneGroup.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) {
            return _trafficSign!!
        }
        _trafficSign = Builder(name = "TrafficSign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(237.49f, 134.05f)
                lineTo(134.05f, 237.49f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, -12.1f, 0.0f)
                lineTo(18.51f, 134.05f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, 0.0f, -12.1f)
                lineTo(122.0f, 18.51f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, 12.1f, 0.0f)
                lineTo(237.49f, 122.0f)
                arcTo(8.54f, 8.54f, 0.0f, false, true, 237.49f, 134.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.15f, 116.29f)
                lineTo(139.71f, 12.85f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, -23.42f, 0.0f)
                lineTo(12.85f, 116.29f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, 23.42f)
                lineTo(116.29f, 243.15f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, 23.42f, 0.0f)
                lineTo(243.15f, 139.71f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, -23.42f)
                close()
                moveTo(231.84f, 128.39f)
                lineTo(128.39f, 231.84f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.78f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(24.16f, 128.39f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.0f, -0.78f)
                lineTo(127.61f, 24.16f)
                arcTo(0.52f, 0.52f, 0.0f, false, true, 128.0f, 24.0f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.4f, 0.16f)
                lineTo(231.84f, 127.61f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.0f, 0.78f)
                close()
                moveTo(173.66f, 114.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(148.69f, 128.0f)
                lineTo(112.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(36.69f)
                lineToRelative(-10.35f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
