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

public val LightGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.89f, 130.94f)
                lineTo(144.4f, 111.6f)
                lineTo(125.06f, 59.11f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -26.12f, 0.0f)
                lineTo(79.6f, 111.6f)
                lineTo(27.11f, 130.94f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 0.0f, 26.12f)
                lineTo(79.6f, 176.4f)
                lineToRelative(19.34f, 52.49f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 26.12f, 0.0f)
                lineTo(144.4f, 176.4f)
                lineToRelative(52.49f, -19.34f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 0.0f, -26.12f)
                close()
                moveTo(192.74f, 145.8f)
                lineTo(137.66f, 166.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.56f, 3.56f)
                lineToRelative(-20.3f, 55.08f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -3.6f, 0.0f)
                lineTo(89.9f, 169.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.56f, -3.56f)
                lineTo(31.26f, 145.8f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 0.0f, -3.6f)
                lineToRelative(55.08f, -20.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.56f, -3.56f)
                lineToRelative(20.3f, -55.08f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 3.6f, 0.0f)
                lineToRelative(20.3f, 55.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.56f, 3.56f)
                lineToRelative(55.08f, 20.3f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 0.0f, 3.6f)
                close()
                moveTo(146.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(18.0f)
                lineTo(170.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(182.0f, 34.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(182.0f, 46.0f)
                lineTo(182.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(170.0f, 46.0f)
                lineTo(152.0f, 46.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 146.0f, 40.0f)
                close()
                moveTo(246.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(230.0f, 94.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 94.0f)
                lineTo(208.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(10.0f)
                lineTo(218.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(230.0f, 82.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 88.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
