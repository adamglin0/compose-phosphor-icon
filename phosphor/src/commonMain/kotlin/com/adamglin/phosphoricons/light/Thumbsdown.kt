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

public val LightGroup.Thumbsdown: ImageVector
    get() {
        if (_thumbsdown != null) {
            return _thumbsdown!!
        }
        _thumbsdown = Builder(name = "Thumbsdown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.83f, 157.27f)
                lineToRelative(-12.0f, -96.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 204.0f, 42.0f)
                lineTo(32.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(76.29f, 158.0f)
                lineToRelative(38.34f, 76.68f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 238.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(158.0f, 182.0f)
                horizontalLineToRelative(58.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 21.83f, -24.73f)
                close()
                moveTo(74.0f, 146.0f)
                lineTo(32.0f, 146.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 54.0f)
                close()
                moveTo(223.5f, 166.62f)
                arcTo(9.89f, 9.89f, 0.0f, false, true, 216.0f, 170.0f)
                lineTo(152.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -22.42f, 25.75f)
                lineTo(86.0f, 150.58f)
                lineTo(86.0f, 54.0f)
                lineTo(204.0f, 54.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.92f, 8.76f)
                lineToRelative(12.0f, 96.0f)
                arcTo(9.89f, 9.89f, 0.0f, false, true, 223.5f, 166.62f)
                close()
            }
        }
        .build()
        return _thumbsdown!!
    }

private var _thumbsdown: ImageVector? = null
