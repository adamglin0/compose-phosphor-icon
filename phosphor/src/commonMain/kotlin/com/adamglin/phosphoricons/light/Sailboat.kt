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

public val LightGroup.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.41f, 173.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 170.0f)
                lineTo(142.0f, 170.0f)
                lineTo(142.0f, 142.0f)
                horizontalLineToRelative(74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.44f, -10.0f)
                lineTo(142.0f, 45.68f)
                lineTo(142.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.66f, -3.78f)
                lineToRelative(-104.0f, 128.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 142.0f)
                horizontalLineToRelative(98.0f)
                verticalLineToRelative(28.0f)
                lineTo(16.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.69f, 9.75f)
                lineToRelative(29.6f, 37.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 51.84f, 222.0f)
                lineTo(204.16f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.93f, -5.25f)
                lineToRelative(29.6f, -37.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 245.41f, 173.4f)
                close()
                moveTo(202.41f, 130.0f)
                lineTo(142.0f, 130.0f)
                lineTo(142.0f, 63.52f)
                close()
                moveTo(44.61f, 130.0f)
                lineTo(130.0f, 24.9f)
                lineTo(130.0f, 130.0f)
                close()
                moveTo(205.72f, 209.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.56f, 0.75f)
                lineTo(51.84f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.56f, -0.75f)
                lineTo(28.48f, 182.0f)
                horizontalLineToRelative(199.0f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
