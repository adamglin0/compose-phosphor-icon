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

public val LightGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.91f, 74.79f)
                lineTo(181.22f, 30.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(38.1f, 153.41f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(92.69f, 222.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(86.16f, -86.16f)
                lineToRelative(4.61f, 18.42f)
                lineToRelative(-37.6f, 37.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.48f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.58f, -5.7f)
                lineToRelative(-7.18f, -28.7f)
                lineToRelative(27.26f, -27.25f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 225.91f, 74.79f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 174.49f)
                lineTo(81.52f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(96.0f, 207.51f)
                lineTo(48.48f, 160.0f)
                lineTo(136.0f, 72.49f)
                lineTo(183.52f, 120.0f)
                close()
                moveTo(217.42f, 86.1f)
                lineTo(192.0f, 111.52f)
                lineTo(144.49f, 64.0f)
                lineTo(169.9f, 38.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(44.69f, 44.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.42f, 86.1f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
