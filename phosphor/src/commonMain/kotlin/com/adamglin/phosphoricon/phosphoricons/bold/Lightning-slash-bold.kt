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

public val BoldGroup.`Lightning-slash-bold`: ImageVector
    get() {
        if (`_lightning-slash-bold` != null) {
            return `_lightning-slash-bold`!!
        }
        `_lightning-slash-bold` = Builder(name = "Lightning-slash-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(75.9f, 88.52f)
                lineTo(39.23f, 127.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.31f, 19.33f)
                lineToRelative(51.18f, 20.47f)
                lineTo(84.13f, 238.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.64f, 10.0f)
                lineToRelative(58.9f, -63.11f)
                lineToRelative(35.45f, 39.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(113.6f, 203.55f)
                lineToRelative(6.27f, -41.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.41f, -12.92f)
                lineTo(68.74f, 131.37f)
                lineToRelative(23.35f, -25.0f)
                lineToRelative(55.38f, 60.92f)
                close()
                moveTo(111.41f, 68.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.59f, -17.0f)
                lineTo(151.23f, 7.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.64f, 10.0f)
                lineTo(161.28f, 88.39f)
                lineToRelative(51.18f, 20.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.31f, 19.33f)
                lineToRelative(-16.82f, 18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.55f, -16.38f)
                lineToRelative(4.86f, -5.21f)
                lineToRelative(-43.72f, -17.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.41f, -12.92f)
                lineToRelative(6.27f, -41.77f)
                lineToRelative(-14.0f, 15.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 111.41f, 68.06f)
                close()
            }
        }
        .build()
        return `_lightning-slash-bold`!!
    }

private var `_lightning-slash-bold`: ImageVector? = null
