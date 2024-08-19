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

public val ThinGroup.`Basketball-thin`: ImageVector
    get() {
        if (`_basketball-thin` != null) {
            return `_basketball-thin`!!
        }
        `_basketball-thin` = Builder(name = "Basketball-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(60.0f, 66.07f)
                arcTo(91.22f, 91.22f, 0.0f, false, true, 83.9f, 124.0f)
                lineTo(36.09f, 124.0f)
                arcTo(91.7f, 91.7f, 0.0f, false, true, 60.0f, 66.07f)
                close()
                moveTo(132.0f, 124.0f)
                lineTo(132.0f, 36.09f)
                arcToRelative(91.63f, 91.63f, 0.0f, false, true, 58.32f, 24.3f)
                arcTo(99.24f, 99.24f, 0.0f, false, false, 164.09f, 124.0f)
                close()
                moveTo(124.0f, 124.0f)
                lineTo(91.91f, 124.0f)
                arcTo(99.24f, 99.24f, 0.0f, false, false, 65.68f, 60.39f)
                arcTo(91.63f, 91.63f, 0.0f, false, true, 124.0f, 36.09f)
                close()
                moveTo(83.9f, 132.0f)
                arcTo(91.22f, 91.22f, 0.0f, false, true, 60.0f, 189.93f)
                arcTo(91.7f, 91.7f, 0.0f, false, true, 36.09f, 132.0f)
                close()
                moveTo(91.9f, 132.0f)
                lineTo(124.0f, 132.0f)
                verticalLineToRelative(87.91f)
                arcToRelative(91.63f, 91.63f, 0.0f, false, true, -58.32f, -24.3f)
                arcTo(99.24f, 99.24f, 0.0f, false, false, 91.91f, 132.0f)
                close()
                moveTo(132.0f, 132.0f)
                horizontalLineToRelative(32.09f)
                arcToRelative(99.24f, 99.24f, 0.0f, false, false, 26.23f, 63.61f)
                arcTo(91.63f, 91.63f, 0.0f, false, true, 132.0f, 219.91f)
                close()
                moveTo(172.1f, 132.0f)
                horizontalLineToRelative(47.81f)
                arcTo(91.7f, 91.7f, 0.0f, false, true, 196.0f, 189.93f)
                arcTo(91.22f, 91.22f, 0.0f, false, true, 172.1f, 132.0f)
                close()
                moveTo(172.1f, 124.0f)
                arcTo(91.22f, 91.22f, 0.0f, false, true, 196.0f, 66.07f)
                arcTo(91.7f, 91.7f, 0.0f, false, true, 219.91f, 124.0f)
                close()
            }
        }
        .build()
        return `_basketball-thin`!!
    }

private var `_basketball-thin`: ImageVector? = null
