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

public val BoldGroup.`Lego-smiley-bold`: ImageVector
    get() {
        if (`_lego-smiley-bold` != null) {
            return `_lego-smiley-bold`!!
        }
        `_lego-smiley-bold` = Builder(name = "Lego-smiley-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 84.0f, 112.0f)
                close()
                moveTo(156.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 156.0f, 96.0f)
                close()
                moveTo(149.6f, 141.85f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, true, -43.2f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, 20.3f)
                arcToRelative(65.0f, 65.0f, 0.0f, false, false, 68.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, -20.3f)
                close()
                moveTo(220.0f, 84.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, true, -24.0f, 33.94f)
                lineTo(196.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(80.0f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(60.0f, 205.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, true, 36.0f, 172.0f)
                lineTo(36.0f, 84.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 72.0f, 48.0f)
                lineTo(84.0f, 48.0f)
                lineTo(84.0f, 32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                lineTo(172.0f, 48.0f)
                horizontalLineToRelative(12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 220.0f, 84.0f)
                close()
                moveTo(108.0f, 48.0f)
                horizontalLineToRelative(40.0f)
                lineTo(148.0f, 36.0f)
                lineTo(108.0f, 36.0f)
                close()
                moveTo(172.0f, 220.0f)
                lineTo(172.0f, 208.0f)
                lineTo(84.0f, 208.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(196.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(72.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 84.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(184.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return `_lego-smiley-bold`!!
    }

private var `_lego-smiley-bold`: ImageVector? = null
