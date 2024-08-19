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

public val BoldGroup.`Pentagram-bold`: ImageVector
    get() {
        if (`_pentagram-bold` != null) {
            return `_pentagram-bold`!!
        }
        `_pentagram-bold` = Builder(name = "Pentagram-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 89.83f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 224.0f, 76.0f)
                lineTo(165.85f, 76.0f)
                lineToRelative(-18.8f, -57.95f)
                arcTo(19.93f, 19.93f, 0.0f, false, false, 109.0f, 18.0f)
                lineTo(90.15f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.3f, 112.22f)
                lineToRelative(47.1f, 33.89f)
                lineToRelative(-18.07f, 55.7f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.07f, 224.2f)
                lineTo(128.0f, 189.71f)
                lineToRelative(47.89f, 34.45f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 30.78f, -22.35f)
                lineToRelative(-18.07f, -55.7f)
                lineToRelative(47.15f, -33.92f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 243.0f, 89.83f)
                close()
                moveTo(128.0f, 37.11f)
                lineTo(140.62f, 76.0f)
                lineTo(115.38f, 76.0f)
                close()
                moveTo(44.42f, 100.0f)
                lineTo(82.36f, 100.0f)
                lineToRelative(-7.18f, 22.13f)
                close()
                moveTo(75.93f, 197.6f)
                lineTo(87.86f, 160.82f)
                lineTo(107.45f, 174.92f)
                close()
                moveTo(95.64f, 136.85f)
                lineTo(107.64f, 100.0f)
                horizontalLineToRelative(40.82f)
                lineToRelative(12.0f, 36.85f)
                lineTo(128.0f, 160.14f)
                close()
                moveTo(148.55f, 174.92f)
                lineTo(168.14f, 160.82f)
                lineTo(180.07f, 197.6f)
                close()
                moveTo(180.82f, 122.13f)
                lineTo(173.64f, 100.0f)
                horizontalLineToRelative(37.94f)
                close()
            }
        }
        .build()
        return `_pentagram-bold`!!
    }

private var `_pentagram-bold`: ImageVector? = null
