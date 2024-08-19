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

public val LightGroup.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.24f, 51.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.49f)
                lineToRelative(56.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 204.24f, 51.74f)
                close()
                moveTo(246.0f, 58.41f)
                arcToRelative(48.12f, 48.12f, 0.0f, false, true, -14.18f, 34.24f)
                lineToRelative(-53.24f, 53.24f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -9.89f, 4.1f)
                lineTo(152.0f, 149.99f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.83f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, true, -2.84f, 8.45f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, -0.54f, 0.62f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, 0.0f)
                lineTo(98.7f, 165.77f)
                lineTo(20.24f, 244.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(78.46f, -78.47f)
                lineTo(70.1f, 137.17f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -19.8f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, true, 0.62f, -0.54f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 87.17f, 106.0f)
                lineTo(104.0f, 106.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(106.0f, 87.3f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, true, 4.1f, -9.9f)
                lineToRelative(53.23f, -53.24f)
                arcTo(48.43f, 48.43f, 0.0f, false, true, 246.0f, 58.41f)
                close()
                moveTo(234.0f, 58.41f)
                arcToRelative(36.43f, 36.43f, 0.0f, false, false, -62.18f, -25.76f)
                lineTo(118.58f, 85.88f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 118.0f, 87.3f)
                lineTo(118.0f, 104.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(87.17f, 118.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.0f, 0.25f)
                lineToRelative(-7.61f, 7.61f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.83f)
                horizontalLineToRelative(0.0f)
                lineToRelative(48.73f, 48.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.82f, 0.0f)
                lineToRelative(7.62f, -7.61f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.25f, -1.0f)
                lineTo(137.98f, 152.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                horizontalLineToRelative(16.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.41f, -0.59f)
                lineToRelative(53.23f, -53.23f)
                arcTo(36.19f, 36.19f, 0.0f, false, false, 234.0f, 58.41f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
