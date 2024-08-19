package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Virus-fill`: ImageVector
    get() {
        if (`_virus-fill` != null) {
            return `_virus-fill`!!
        }
        `_virus-fill` = Builder(name = "Virus-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 120.0f)
                lineTo(223.66f, 120.0f)
                arcToRelative(95.52f, 95.52f, 0.0f, false, false, -22.39f, -53.95f)
                lineToRelative(12.39f, -12.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(190.0f, 54.73f)
                arcTo(95.52f, 95.52f, 0.0f, false, false, 136.0f, 32.34f)
                lineTo(136.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 32.34f)
                arcTo(95.52f, 95.52f, 0.0f, false, false, 66.05f, 54.73f)
                lineTo(53.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 53.66f)
                lineTo(54.73f, 66.05f)
                arcToRelative(95.52f, 95.52f, 0.0f, false, false, -22.39f, 54.0f)
                lineTo(16.0f, 120.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(32.34f, 136.05f)
                arcTo(95.52f, 95.52f, 0.0f, false, false, 54.73f, 190.0f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(12.39f, -12.39f)
                arcToRelative(95.52f, 95.52f, 0.0f, false, false, 54.0f, 22.39f)
                lineTo(120.05f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.05f, 223.66f)
                arcTo(95.52f, 95.52f, 0.0f, false, false, 190.0f, 201.27f)
                lineToRelative(12.39f, 12.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(201.27f, 190.0f)
                arcTo(95.52f, 95.52f, 0.0f, false, false, 223.66f, 136.0f)
                lineTo(240.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(80.0f, 108.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 80.0f, 108.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(176.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_virus-fill`!!
    }

private var `_virus-fill`: ImageVector? = null
