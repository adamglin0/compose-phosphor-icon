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

public val ThinGroup.`Lightning-slash-thin`: ImageVector
    get() {
        if (`_lightning-slash-thin` != null) {
            return `_lightning-slash-thin`!!
        }
        `_lightning-slash-thin` = Builder(name = "Lightning-slash-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(86.77f, 88.6f)
                lineTo(45.08f, 133.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.52f, 6.47f)
                lineToRelative(60.81f, 22.81f)
                lineTo(92.08f, 239.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.84f, 3.51f)
                lineToRelative(64.83f, -69.46f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(102.68f, 227.0f)
                lineToRelative(13.24f, -66.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.52f, -4.53f)
                lineTo(55.0f, 134.36f)
                lineTo(92.17f, 94.54f)
                lineToRelative(66.18f, 72.79f)
                close()
                moveTo(111.39f, 68.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.2f, -5.65f)
                lineToRelative(45.89f, -49.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.84f, 3.51f)
                lineTo(148.59f, 93.45f)
                lineToRelative(60.81f, 22.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.49f, 2.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 3.64f)
                lineToRelative(-22.3f, 23.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.85f, -5.45f)
                lineTo(201.0f, 121.64f)
                lineTo(142.6f, 99.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.52f, -4.52f)
                lineTo(153.32f, 29.0f)
                lineTo(117.0f, 67.89f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 111.39f, 68.08f)
                close()
            }
        }
        .build()
        return `_lightning-slash-thin`!!
    }

private var `_lightning-slash-thin`: ImageVector? = null
