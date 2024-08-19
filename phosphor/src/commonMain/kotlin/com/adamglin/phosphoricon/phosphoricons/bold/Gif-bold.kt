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

public val BoldGroup.`Gif-bold`: ImageVector
    get() {
        if (`_gif-bold` != null) {
            return `_gif-bold`!!
        }
        `_gif-bold` = Builder(name = "Gif-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 72.0f)
                lineTo(148.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(124.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(232.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(176.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(164.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(188.0f, 140.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(188.0f, 116.0f)
                lineTo(188.0f, 84.0f)
                close()
                moveTo(96.0f, 116.0f)
                lineTo(72.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(84.0f, 140.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(44.0f, 104.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 84.0f)
                curveToRelative(9.42f, 0.0f, 18.18f, 6.45f, 20.38f, 15.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.24f, -6.0f)
                curveTo(102.7f, 73.88f, 84.35f, 60.0f, 64.0f, 60.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, 44.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(108.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 116.0f)
                close()
            }
        }
        .build()
        return `_gif-bold`!!
    }

private var `_gif-bold`: ImageVector? = null
