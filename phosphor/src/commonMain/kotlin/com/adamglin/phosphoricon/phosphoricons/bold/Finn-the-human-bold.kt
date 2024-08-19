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

public val BoldGroup.`Finn-the-human-bold`: ImageVector
    get() {
        if (`_finn-the-human-bold` != null) {
            return `_finn-the-human-bold`!!
        }
        `_finn-the-human-bold` = Builder(name = "Finn-the-human-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 96.0f)
                lineTo(96.0f, 96.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                close()
                moveTo(160.0f, 176.0f)
                lineTo(96.0f, 176.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
                moveTo(112.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 148.0f)
                close()
                moveTo(176.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 148.0f)
                close()
                moveTo(212.0f, 36.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -33.94f, 24.0f)
                lineTo(77.94f, 60.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 8.0f, 72.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, 88.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f)
                lineTo(248.0f, 72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 212.0f, 36.0f)
                close()
                moveTo(224.0f, 148.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, -64.0f)
                lineTo(32.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 84.0f)
                lineTo(188.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_finn-the-human-bold`!!
    }

private var `_finn-the-human-bold`: ImageVector? = null
