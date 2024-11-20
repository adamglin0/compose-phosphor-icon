package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.15f, 70.54f)
                lineTo(185.46f, 17.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f)
                lineTo(17.85f, 157.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                lineToRelative(52.69f, 52.68f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineTo(238.15f, 98.83f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 238.15f, 70.54f)
                close()
                moveTo(84.68f, 218.34f)
                lineToRelative(-47.0f, -47.0f)
                lineTo(64.0f, 145.0f)
                lineToRelative(23.52f, 23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(81.0f, 128.0f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(23.51f, 23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(113.0f, 96.0f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(23.52f, 23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(145.0f, 64.0f)
                lineToRelative(26.35f, -26.34f)
                lineToRelative(47.0f, 47.0f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
