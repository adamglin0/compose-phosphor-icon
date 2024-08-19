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

public val ThinGroup.`Skip-back-circle-thin`: ImageVector
    get() {
        if (`_skip-back-circle-thin` != null) {
            return `_skip-back-circle-thin`!!
        }
        `_skip-back-circle-thin` = Builder(name = "Skip-back-circle-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(161.94f, 84.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.06f, 0.11f)
                lineTo(100.0f, 120.78f)
                lineTo(100.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(100.0f, 135.22f)
                lineToRelative(57.88f, 36.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 172.0f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, 1.94f, -0.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 168.0f)
                lineTo(164.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 161.94f, 84.5f)
                close()
                moveTo(156.0f, 160.78f)
                lineTo(103.55f, 128.0f)
                lineTo(156.0f, 95.22f)
                close()
            }
        }
        .build()
        return `_skip-back-circle-thin`!!
    }

private var `_skip-back-circle-thin`: ImageVector? = null
