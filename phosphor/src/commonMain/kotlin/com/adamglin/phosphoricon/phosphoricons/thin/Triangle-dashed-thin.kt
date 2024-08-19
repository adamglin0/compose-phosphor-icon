package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Triangle-dashed-thin`: ImageVector
    get() {
        if (`_triangle-dashed-thin` != null) {
            return `_triangle-dashed-thin`!!
        }
        `_triangle-dashed-thin` = Builder(name = "Triangle-dashed-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(104.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 216.0f)
                close()
                moveTo(233.34f, 190.09f)
                lineTo(228.68f, 182.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.93f, 4.0f)
                lineToRelative(4.65f, 8.08f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, 0.0f, 11.72f)
                arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, 6.2f)
                lineTo(192.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(23.46f)
                arcToRelative(20.36f, 20.36f, 0.0f, false, false, 17.86f, -10.2f)
                arcTo(19.52f, 19.52f, 0.0f, false, false, 233.34f, 190.09f)
                close()
                moveTo(64.0f, 212.0f)
                lineTo(40.54f, 212.0f)
                arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, -6.2f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, 0.0f, -11.72f)
                lineTo(34.25f, 186.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.93f, -4.0f)
                lineToRelative(-4.66f, 8.09f)
                arcToRelative(19.52f, 19.52f, 0.0f, false, false, 0.0f, 19.71f)
                arcTo(20.36f, 20.36f, 0.0f, false, false, 40.54f, 220.0f)
                lineTo(64.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(202.18f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.47f, -6.0f)
                lineToRelative(-23.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.93f, 4.0f)
                lineToRelative(23.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 202.18f, 148.0f)
                close()
                moveTo(145.88f, 38.22f)
                arcToRelative(20.75f, 20.75f, 0.0f, false, false, -35.76f, 0.0f)
                lineTo(96.42f, 62.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.94f, 4.0f)
                lineToRelative(13.69f, -23.79f)
                arcToRelative(12.76f, 12.76f, 0.0f, false, true, 21.9f, 0.0f)
                lineTo(152.64f, 66.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, -4.0f)
                close()
                moveTo(78.88f, 100.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 73.39f, 102.0f)
                lineToRelative(-23.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, 4.0f)
                lineToRelative(23.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 78.85f, 100.53f)
                close()
            }
        }
        .build()
        return `_triangle-dashed-thin`!!
    }

private var `_triangle-dashed-thin`: ImageVector? = null
