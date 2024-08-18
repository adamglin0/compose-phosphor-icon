package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Megaphone-simple-fill`: ImageVector
    get() {
        if (`_megaphone-simple-fill` != null) {
            return `_megaphone-simple-fill`!!
        }
        `_megaphone-simple-fill` = Builder(name = "Megaphone-simple-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.54f, 86.66f)
                lineToRelative(-176.06f, -54.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 4.52f, -0.65f)
                lineTo(136.0f, 181.73f)
                lineTo(136.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-29.9f)
                lineToRelative(28.54f, -8.75f)
                arcTo(16.09f, 16.09f, 0.0f, false, false, 240.0f, 138.0f)
                lineTo(240.0f, 102.0f)
                arcTo(16.09f, 16.09f, 0.0f, false, false, 228.54f, 86.66f)
                close()
                moveTo(184.0f, 192.0f)
                lineTo(152.0f, 192.0f)
                lineTo(152.0f, 176.82f)
                lineTo(184.0f, 167.0f)
                close()
                moveTo(224.0f, 138.0f)
                lineTo(223.89f, 138.0f)
                lineTo(152.0f, 160.08f)
                lineTo(152.0f, 79.91f)
                lineTo(223.89f, 102.0f)
                lineToRelative(0.11f, 0.0f)
                verticalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return `_megaphone-simple-fill`!!
    }

private var `_megaphone-simple-fill`: ImageVector? = null
