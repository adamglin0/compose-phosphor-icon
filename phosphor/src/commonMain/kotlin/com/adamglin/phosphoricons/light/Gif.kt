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

public val LightGroup.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif = Builder(name = "Gif", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 72.0f)
                lineTo(142.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(130.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(232.0f, 66.0f)
                lineTo(176.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(170.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(182.0f, 134.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(182.0f, 122.0f)
                lineTo(182.0f, 78.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(96.0f, 122.0f)
                lineTo(72.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(90.0f, 134.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                lineTo(38.0f, 104.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 64.0f, 78.0f)
                curveToRelative(12.07f, 0.0f, 23.33f, 8.38f, 26.19f, 19.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.62f, -3.0f)
                curveTo(97.56f, 78.0f, 81.66f, 66.0f, 64.0f, 66.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 76.0f, 0.0f)
                lineTo(102.0f, 128.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 122.0f)
                close()
            }
        }
        .build()
        return _gif!!
    }

private var _gif: ImageVector? = null
