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

public val BoldGroup.`Ice-cream-bold`: ImageVector
    get() {
        if (`_ice-cream-bold` != null) {
            return `_ice-cream-bold`!!
        }
        `_ice-cream-bold` = Builder(name = "Ice-cream-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 116.0f)
                arcToRelative(32.14f, 32.14f, 0.0f, false, false, -16.37f, -27.92f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -167.26f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 12.51f, 59.77f)
                lineToRelative(53.75f, 94.07f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.74f, 0.0f)
                lineToRelative(53.75f, -94.07f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 228.0f, 116.0f)
                close()
                moveTo(58.39f, 108.16f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 96.4f)
                lineTo(68.0f, 96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f)
                verticalLineToRelative(0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.61f, 11.76f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 124.0f)
                lineTo(60.0f, 124.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.61f, -15.84f)
                close()
                moveTo(171.39f, 148.0f)
                lineTo(154.89f, 176.88f)
                lineTo(138.39f, 148.0f)
                close()
                moveTo(84.61f, 148.0f)
                horizontalLineToRelative(26.14f)
                lineToRelative(30.32f, 53.06f)
                lineTo(128.0f, 223.94f)
                close()
            }
        }
        .build()
        return `_ice-cream-bold`!!
    }

private var `_ice-cream-bold`: ImageVector? = null
