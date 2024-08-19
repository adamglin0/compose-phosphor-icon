package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Lightning-a-bold`: ImageVector
    get() {
        if (`_lightning-a-bold` != null) {
            return `_lightning-a-bold`!!
        }
        `_lightning-a-bold` = Builder(name = "Lightning-a-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.76f, 110.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.85f, -8.56f)
                lineTo(126.0f, 81.12f)
                lineToRelative(12.9f, -54.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.48f, -10.92f)
                lineTo(23.19f, 118.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.89f, 19.1f)
                lineToRelative(47.0f, 21.08f)
                lineTo(61.12f, 213.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.49f, 10.93f)
                lineTo(176.8f, 121.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 179.76f, 110.75f)
                close()
                moveTo(95.0f, 174.31f)
                lineToRelative(4.64f, -19.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.76f, -13.72f)
                lineToRelative(-40.76f, -18.3f)
                lineTo(105.0f, 65.69f)
                lineToRelative(-4.64f, 19.54f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 107.08f, 99.0f)
                lineToRelative(40.77f, 18.3f)
                close()
                moveTo(242.7f, 210.63f)
                lineTo(206.7f, 138.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.47f, 0.0f)
                lineToRelative(-36.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.46f, 10.73f)
                lineToRelative(4.68f, -9.36f)
                horizontalLineToRelative(41.17f)
                lineToRelative(4.68f, 9.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.47f, -10.73f)
                close()
                moveTo(187.41f, 188.0f)
                lineTo(196.0f, 170.83f)
                lineTo(204.58f, 188.0f)
                close()
            }
        }
        .build()
        return `_lightning-a-bold`!!
    }

private var `_lightning-a-bold`: ImageVector? = null
