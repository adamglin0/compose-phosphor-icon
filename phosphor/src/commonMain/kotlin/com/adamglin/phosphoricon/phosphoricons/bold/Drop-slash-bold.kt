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

public val BoldGroup.`Drop-slash-bold`: ImageVector
    get() {
        if (`_drop-slash-bold` != null) {
            return `_drop-slash-bold`!!
        }
        `_drop-slash-bold` = Builder(name = "Drop-slash-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(59.68f, 70.69f)
                curveTo(44.0f, 95.22f, 36.0f, 119.84f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 153.0f, 68.9f)
                lineToRelative(10.16f, 11.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                curveToRelative(0.0f, -17.74f, 5.54f, -36.12f, 16.49f, -54.82f)
                lineToRelative(96.32f, 106.0f)
                arcTo(67.84f, 67.84f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(92.61f, 47.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.12f, -17.0f)
                arcToRelative(243.72f, 243.72f, 0.0f, false, true, 28.39f, -24.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.76f, 0.0f)
                curveTo(138.36f, 8.6f, 220.0f, 66.64f, 220.0f, 144.0f)
                arcToRelative(92.8f, 92.8f, 0.0f, false, true, -1.0f, 13.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.86f, 10.28f)
                arcToRelative(12.74f, 12.74f, 0.0f, false, true, -1.74f, -0.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.15f, -13.6f)
                arcTo(69.36f, 69.36f, 0.0f, false, false, 196.0f, 144.0f)
                curveToRelative(0.0f, -52.93f, -49.49f, -97.91f, -68.0f, -112.88f)
                curveToRelative(-4.64f, 3.73f, -11.2f, 9.33f, -18.41f, 16.44f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.61f, 47.44f)
                close()
            }
        }
        .build()
        return `_drop-slash-bold`!!
    }

private var `_drop-slash-bold`: ImageVector? = null
