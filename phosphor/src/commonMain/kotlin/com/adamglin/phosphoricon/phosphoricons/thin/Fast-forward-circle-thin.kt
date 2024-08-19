package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Fast-forward-circle-thin`: ImageVector
    get() {
        if (`_fast-forward-circle-thin` != null) {
            return `_fast-forward-circle-thin`!!
        }
        `_fast-forward-circle-thin` = Builder(name = "Fast-forward-circle-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(190.4f, 124.8f)
                lineTo(142.4f, 88.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 136.0f, 92.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 140.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, -0.8f)
                lineToRelative(48.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                close()
                moveTo(144.0f, 156.0f)
                lineTo(144.0f, 100.0f)
                lineToRelative(37.33f, 28.0f)
                close()
                moveTo(134.4f, 124.8f)
                lineTo(86.4f, 88.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 80.0f, 92.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 84.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, -0.8f)
                lineToRelative(48.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                close()
                moveTo(88.0f, 156.0f)
                lineTo(88.0f, 100.0f)
                lineToRelative(37.33f, 28.0f)
                close()
            }
        }
        .build()
        return `_fast-forward-circle-thin`!!
    }

private var `_fast-forward-circle-thin`: ImageVector? = null
