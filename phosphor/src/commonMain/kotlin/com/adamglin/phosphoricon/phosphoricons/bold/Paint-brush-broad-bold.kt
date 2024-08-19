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

public val BoldGroup.`Paint-brush-broad-bold`: ImageVector
    get() {
        if (`_paint-brush-broad-bold` != null) {
            return `_paint-brush-broad-bold`!!
        }
        `_paint-brush-broad-bold` = Builder(name = "Paint-brush-broad-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 28.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(95.64f, 164.0f)
                lineTo(92.0f, 207.0f)
                curveToRelative(0.0f, 0.33f, 0.0f, 0.67f, 0.0f, 1.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                curveToRelative(0.0f, -0.33f, 0.0f, -0.67f, 0.0f, -1.0f)
                lineToRelative(-3.6f, -43.0f)
                lineTo(200.0f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(228.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 20.0f)
                close()
                moveTo(72.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                lineTo(160.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(184.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                lineTo(204.0f, 96.0f)
                lineTo(52.0f, 96.0f)
                lineTo(52.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 72.0f, 44.0f)
                close()
                moveTo(200.0f, 140.0f)
                lineTo(156.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.85f, 22.4f)
                lineToRelative(3.84f, 46.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineToRelative(3.84f, -46.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.0f, 140.0f)
                lineTo(56.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 120.0f)
                lineTo(204.0f, 120.0f)
                verticalLineToRelative(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 140.0f)
                close()
            }
        }
        .build()
        return `_paint-brush-broad-bold`!!
    }

private var `_paint-brush-broad-bold`: ImageVector? = null
