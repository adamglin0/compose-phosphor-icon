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

public val LightGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 106.0f)
                lineTo(227.9f, 106.0f)
                lineTo(199.59f, 42.31f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 186.8f, 34.0f)
                lineTo(69.2f, 34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.79f, 8.31f)
                lineTo(28.1f, 106.0f)
                lineTo(16.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(26.0f, 118.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(64.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(78.0f, 182.0f)
                lineTo(178.0f, 182.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 118.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(67.37f, 47.19f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 69.2f, 46.0f)
                lineTo(186.8f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.83f, 1.19f)
                lineTo(214.77f, 106.0f)
                lineTo(41.23f, 106.0f)
                close()
                moveTo(66.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 182.0f)
                lineTo(66.0f, 182.0f)
                close()
                moveTo(216.0f, 202.0f)
                lineTo(192.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(190.0f, 182.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f)
                close()
                moveTo(218.0f, 170.0f)
                lineTo(38.0f, 170.0f)
                lineTo(38.0f, 118.0f)
                lineTo(218.0f, 118.0f)
                close()
                moveTo(58.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(80.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(64.0f, 150.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 58.0f, 144.0f)
                close()
                moveTo(170.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(176.0f, 150.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 144.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
