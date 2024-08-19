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

public val LightGroup.Pipe: ImageVector
    get() {
        if (_pipe != null) {
            return _pipe!!
        }
        _pipe = Builder(name = "Pipe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 106.0f)
                lineTo(206.0f, 106.0f)
                lineTo(206.0f, 54.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(204.63f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 34.0f)
                lineTo(176.0f, 34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.63f, 8.0f)
                lineTo(144.0f, 42.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 42.0f, 144.0f)
                verticalLineToRelative(19.37f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 176.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.0f, 12.63f)
                lineTo(42.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 206.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(118.0f, 204.63f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 126.0f, 192.0f)
                lineTo(126.0f, 176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.0f, -12.63f)
                lineTo(118.0f, 144.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(19.37f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 176.0f, 126.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.63f, -8.0f)
                lineTo(232.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(112.0f, 174.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(106.0f, 144.0f)
                verticalLineToRelative(18.0f)
                lineTo(54.0f, 162.0f)
                lineTo(54.0f, 144.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 90.0f, -90.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(52.0f)
                lineTo(144.0f, 106.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 106.0f, 144.0f)
                close()
                moveTo(192.0f, 114.0f)
                lineTo(176.0f, 114.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(174.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 192.0f, 114.0f)
                close()
            }
        }
        .build()
        return _pipe!!
    }

private var _pipe: ImageVector? = null
