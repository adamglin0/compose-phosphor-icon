package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.34f, 190.09f)
                lineTo(145.88f, 38.22f)
                arcToRelative(20.75f, 20.75f, 0.0f, false, false, -35.76f, 0.0f)
                lineTo(22.66f, 190.09f)
                arcToRelative(19.52f, 19.52f, 0.0f, false, false, 0.0f, 19.71f)
                arcTo(20.36f, 20.36f, 0.0f, false, false, 40.54f, 220.0f)
                horizontalLineTo(215.46f)
                arcToRelative(20.36f, 20.36f, 0.0f, false, false, 17.86f, -10.2f)
                arcTo(19.52f, 19.52f, 0.0f, false, false, 233.34f, 190.09f)
                close()
                moveTo(226.4f, 205.8f)
                arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, 6.2f)
                horizontalLineTo(40.54f)
                arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, -6.2f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, 0.0f, -11.72f)
                lineTo(117.05f, 42.21f)
                arcToRelative(12.76f, 12.76f, 0.0f, false, true, 21.9f, 0.0f)
                lineTo(226.4f, 194.08f)
                arcTo(11.45f, 11.45f, 0.0f, false, true, 226.4f, 205.8f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
