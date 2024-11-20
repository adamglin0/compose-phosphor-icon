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

public val DuotoneGroup.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(245.66f, 129.0f)
                lineTo(217.0f, 157.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, 0.0f)
                lineTo(168.1f, 120.0f)
                lineToRelative(-28.0f, 28.0f)
                lineToRelative(-32.0f, -32.0f)
                lineToRelative(28.0f, -28.0f)
                lineTo(80.0f, 31.78f)
                arcToRelative(87.81f, 87.81f, 0.0f, false, true, 98.31f, 18.0f)
                lineToRelative(67.35f, 67.89f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 245.66f, 129.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.34f, 112.0f)
                lineTo(183.88f, 44.08f)
                arcToRelative(96.1f, 96.1f, 0.0f, false, false, -135.77f, 0.0f)
                lineToRelative(-0.09f, 0.09f)
                lineTo(34.25f, 58.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 45.74f, 69.53f)
                lineTo(59.47f, 55.35f)
                arcToRelative(79.92f, 79.92f, 0.0f, false, true, 18.71f, -13.9f)
                lineTo(124.68f, 88.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(20.69f, 20.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                lineToRelative(14.34f, 14.34f)
                horizontalLineToRelative(0.0f)
                lineTo(200.0f, 163.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(28.69f, -28.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 251.34f, 112.0f)
                close()
                moveTo(60.68f, 216.0f)
                lineTo(40.0f, 195.31f)
                lineToRelative(68.0f, -68.0f)
                lineTo(128.68f, 148.0f)
                close()
                moveTo(162.34f, 114.32f)
                lineTo(140.0f, 136.67f)
                lineTo(119.31f, 116.0f)
                lineToRelative(22.35f, -22.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineTo(94.32f, 35.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 78.23f, 20.41f)
                lineToRelative(44.22f, 44.51f)
                lineTo(188.0f, 128.66f)
                lineToRelative(-14.34f, -14.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 162.34f, 114.32f)
                close()
                moveTo(211.34f, 151.98f)
                lineTo(199.34f, 139.98f)
                lineTo(228.0f, 111.25f)
                lineToRelative(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
