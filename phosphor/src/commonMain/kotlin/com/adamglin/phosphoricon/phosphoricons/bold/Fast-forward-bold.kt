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

public val BoldGroup.`Fast-forward-bold`: ImageVector
    get() {
        if (`_fast-forward-bold` != null) {
            return `_fast-forward-bold`!!
        }
        `_fast-forward-bold` = Builder(name = "Fast-forward-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.81f, 111.29f)
                lineTo(158.63f, 55.12f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 128.0f, 71.84f)
                verticalLineToRelative(30.0f)
                lineTo(54.63f, 55.12f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 24.0f, 71.84f)
                lineTo(24.0f, 184.16f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, 30.63f, 16.72f)
                lineTo(128.0f, 154.15f)
                verticalLineToRelative(30.0f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, 30.63f, 16.72f)
                lineToRelative(88.18f, -56.17f)
                arcToRelative(19.79f, 19.79f, 0.0f, false, false, 0.0f, -33.42f)
                close()
                moveTo(48.0f, 176.64f)
                lineTo(48.0f, 79.36f)
                lineTo(124.38f, 128.0f)
                close()
                moveTo(152.0f, 176.64f)
                lineTo(152.0f, 79.36f)
                lineTo(228.38f, 128.0f)
                close()
            }
        }
        .build()
        return `_fast-forward-bold`!!
    }

private var `_fast-forward-bold`: ImageVector? = null
