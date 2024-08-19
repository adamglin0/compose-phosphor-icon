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

public val RegularGroup.Handcoins: ImageVector
    get() {
        if (_handcoins != null) {
            return _handcoins!!
        }
        _handcoins = Builder(name = "Handcoins", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.33f, 141.06f)
                arcToRelative(24.43f, 24.43f, 0.0f, false, false, -21.24f, -4.23f)
                lineToRelative(-41.84f, 9.62f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 140.0f, 112.0f)
                lineTo(89.94f, 112.0f)
                arcToRelative(31.82f, 31.82f, 0.0f, false, false, -22.63f, 9.37f)
                lineTo(44.69f, 144.0f)
                lineTo(16.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(120.0f, 216.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 1.94f, -0.24f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(6.94f, 6.94f, 0.0f, false, false, 1.19f, -0.4f)
                lineTo(226.0f, 182.82f)
                lineToRelative(0.44f, -0.2f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, 3.93f, -41.56f)
                close()
                moveTo(16.0f, 160.0f)
                lineTo(40.0f, 160.0f)
                verticalLineToRelative(40.0f)
                lineTo(16.0f, 200.0f)
                close()
                moveTo(219.43f, 168.21f)
                lineTo(181.43f, 184.39f)
                lineTo(119.0f, 200.0f)
                lineTo(56.0f, 200.0f)
                lineTo(56.0f, 155.31f)
                lineToRelative(22.63f, -22.62f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 89.94f, 128.0f)
                lineTo(140.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, false, 1.79f, -0.2f)
                lineToRelative(67.0f, -15.41f)
                lineToRelative(0.31f, -0.08f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, 6.3f, 15.9f)
                close()
                moveTo(164.0f, 96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 5.9f, -0.48f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 28.22f, -47.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 164.0f, 96.0f)
                close()
                moveTo(224.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 224.0f, 84.0f)
                close()
                moveTo(164.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 19.25f, 14.61f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -15.0f, 24.93f)
                arcTo(20.42f, 20.42f, 0.0f, false, true, 164.0f, 80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                close()
            }
        }
        .build()
        return _handcoins!!
    }

private var _handcoins: ImageVector? = null
