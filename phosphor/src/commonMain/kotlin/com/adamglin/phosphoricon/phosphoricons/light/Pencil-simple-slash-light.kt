package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Pencil-simple-slash-light`: ImageVector
    get() {
        if (`_pencil-simple-slash-light` != null) {
            return `_pencil-simple-slash-light`!!
        }
        `_pencil-simple-slash-light` = Builder(name = "Pencil-simple-slash-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(93.05f, 98.47f)
                lineTo(38.1f, 153.42f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -4.1f, 9.89f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(92.69f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineTo(154.46f, 166.0f)
                lineToRelative(49.11f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(94.1f, 209.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.58f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(163.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.41f)
                lineToRelative(54.54f, -54.54f)
                lineToRelative(45.25f, 49.78f)
                close()
                moveTo(225.91f, 74.79f)
                lineTo(181.22f, 30.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(119.75f, 71.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.49f)
                lineTo(136.0f, 72.48f)
                lineTo(183.52f, 120.0f)
                lineToRelative(-10.44f, 10.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.48f)
                lineToRelative(44.34f, -44.33f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 225.91f, 74.79f)
                close()
                moveTo(217.42f, 86.1f)
                lineTo(192.0f, 111.52f)
                lineTo(144.49f, 64.0f)
                lineToRelative(25.42f, -25.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f)
                lineToRelative(44.69f, 44.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.42f, 86.1f)
                close()
            }
        }
        .build()
        return `_pencil-simple-slash-light`!!
    }

private var `_pencil-simple-slash-light`: ImageVector? = null
