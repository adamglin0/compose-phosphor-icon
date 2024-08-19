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

public val LightGroup.Pencilslash: ImageVector
    get() {
        if (_pencilslash != null) {
            return _pencilslash!!
        }
        _pencilslash = Builder(name = "Pencilslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(93.05f, 98.47f)
                lineTo(38.1f, 153.42f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -4.1f, 9.89f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(92.69f, 222.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineTo(154.46f, 166.0f)
                lineToRelative(49.11f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(119.72f, 127.84f)
                lineTo(68.0f, 179.52f)
                lineTo(48.48f, 160.0f)
                lineToRelative(52.65f, -52.64f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 174.48f)
                lineTo(81.52f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(96.0f, 207.51f)
                lineTo(76.49f, 188.0f)
                lineToRelative(51.31f, -51.31f)
                lineToRelative(18.58f, 20.45f)
                close()
                moveTo(225.91f, 74.79f)
                lineTo(181.22f, 30.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(119.75f, 71.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.49f)
                lineTo(136.0f, 72.48f)
                lineTo(155.52f, 92.0f)
                lineToRelative(-9.11f, 9.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.49f)
                lineToRelative(9.1f, -9.11f)
                lineTo(183.52f, 120.0f)
                lineToRelative(-10.44f, 10.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.48f)
                lineToRelative(44.34f, -44.33f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 225.91f, 74.79f)
                close()
                moveTo(217.42f, 86.1f)
                lineTo(192.0f, 111.52f)
                lineTo(168.25f, 87.76f)
                horizontalLineToRelative(0.0f)
                lineTo(144.49f, 64.0f)
                lineToRelative(25.42f, -25.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f)
                lineToRelative(44.69f, 44.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.42f, 86.1f)
                close()
            }
        }
        .build()
        return _pencilslash!!
    }

private var _pencilslash: ImageVector? = null
