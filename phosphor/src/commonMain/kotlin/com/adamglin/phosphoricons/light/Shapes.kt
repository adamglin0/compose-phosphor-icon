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

public val LightGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(69.69f, 62.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.38f, 0.0f)
                lineToRelative(-40.0f, 120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 190.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.69f, -7.9f)
                close()
                moveTo(32.32f, 178.0f)
                lineTo(64.0f, 83.0f)
                lineToRelative(31.68f, 95.0f)
                close()
                moveTo(206.0f, 76.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, false, -50.0f, 50.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, false, 206.0f, 76.0f)
                close()
                moveTo(118.0f, 76.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 118.0f, 76.0f)
                close()
                moveTo(224.0f, 146.0f)
                lineTo(136.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 146.0f)
                close()
                moveTo(218.0f, 202.0f)
                lineTo(142.0f, 202.0f)
                lineTo(142.0f, 158.0f)
                horizontalLineToRelative(76.0f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
