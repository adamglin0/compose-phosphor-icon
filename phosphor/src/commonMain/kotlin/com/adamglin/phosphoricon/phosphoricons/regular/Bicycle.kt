package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 112.0f)
                arcToRelative(47.81f, 47.81f, 0.0f, false, false, -16.93f, 3.09f)
                lineTo(165.93f, 72.0f)
                lineTo(192.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(152.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.91f, 12.0f)
                lineToRelative(11.65f, 20.0f)
                lineTo(99.26f, 88.0f)
                lineTo(82.91f, 60.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 76.0f, 56.0f)
                lineTo(48.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(71.41f, 72.0f)
                lineTo(85.12f, 95.51f)
                lineTo(69.41f, 117.06f)
                arcToRelative(48.13f, 48.13f, 0.0f, true, false, 12.92f, 9.44f)
                lineToRelative(11.59f, -15.9f)
                lineTo(125.09f, 164.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 138.91f, 156.0f)
                lineToRelative(-30.32f, -52.0f)
                horizontalLineToRelative(57.48f)
                lineToRelative(11.19f, 19.17f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 208.0f, 112.0f)
                close()
                moveTo(80.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -20.21f, -29.74f)
                lineToRelative(-18.25f, 25.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.92f, 9.42f)
                lineToRelative(18.25f, -25.0f)
                arcTo(31.88f, 31.88f, 0.0f, false, true, 80.0f, 160.0f)
                close()
                moveTo(208.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -22.51f, -54.72f)
                lineTo(201.09f, 164.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 214.91f, 156.0f)
                lineTo(199.3f, 129.21f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 208.0f, 192.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
