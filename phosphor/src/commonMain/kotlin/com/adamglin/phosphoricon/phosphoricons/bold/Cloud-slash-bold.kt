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

public val BoldGroup.`Cloud-slash-bold`: ImageVector
    get() {
        if (`_cloud-slash-bold` != null) {
            return `_cloud-slash-bold`!!
        }
        `_cloud-slash-bold` = Builder(name = "Cloud-slash-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(71.79f, 84.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 72.0f, 220.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(91.26f, 91.26f, 0.0f, false, false, 30.66f, -5.24f)
                lineToRelative(8.46f, 9.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(160.0f, 196.0f)
                lineTo(72.0f, 196.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -1.8f, -87.95f)
                arcTo(91.91f, 91.91f, 0.0f, false, false, 68.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(68.22f, 68.22f, 0.0f, false, true, 2.66f, -18.84f)
                lineToRelative(77.88f, 85.67f)
                arcTo(68.67f, 68.67f, 0.0f, false, true, 160.0f, 196.0f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, -17.53f, 54.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, -14.11f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -89.57f, -98.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.2f, -20.66f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_cloud-slash-bold`!!
    }

private var `_cloud-slash-bold`: ImageVector? = null
