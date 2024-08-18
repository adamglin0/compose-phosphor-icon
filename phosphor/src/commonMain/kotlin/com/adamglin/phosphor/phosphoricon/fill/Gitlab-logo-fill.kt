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

public val FillGroup.`Gitlab-logo-fill`: ImageVector
    get() {
        if (`_gitlab-logo-fill` != null) {
            return `_gitlab-logo-fill`!!
        }
        `_gitlab-logo-fill` = Builder(name = "Gitlab-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.15f, 117.1f)
                lineTo(210.25f, 41.0f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, -22.79f, -1.11f)
                lineTo(169.78f, 88.0f)
                lineTo(86.22f, 88.0f)
                lineTo(68.54f, 39.87f)
                arcTo(11.94f, 11.94f, 0.0f, false, false, 45.75f, 41.0f)
                lineTo(25.85f, 117.1f)
                arcToRelative(57.19f, 57.19f, 0.0f, false, false, 22.0f, 61.0f)
                lineToRelative(73.27f, 51.76f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 13.74f, 0.0f)
                lineToRelative(73.27f, -51.76f)
                arcTo(57.19f, 57.19f, 0.0f, false, false, 230.15f, 117.1f)
                close()
                moveTo(40.68f, 124.1f)
                lineTo(114.13f, 176.0f)
                lineTo(93.41f, 190.65f)
                lineTo(57.09f, 165.0f)
                arcTo(41.06f, 41.06f, 0.0f, false, true, 40.68f, 124.11f)
                close()
                moveTo(128.0f, 215.1f)
                lineTo(107.27f, 200.45f)
                lineTo(128.0f, 185.8f)
                lineToRelative(20.73f, 14.64f)
                close()
                moveTo(198.91f, 165.0f)
                lineToRelative(-36.32f, 25.66f)
                lineTo(141.87f, 176.0f)
                lineToRelative(73.45f, -51.9f)
                arcTo(41.06f, 41.06f, 0.0f, false, true, 198.91f, 165.0f)
                close()
            }
        }
        .build()
        return `_gitlab-logo-fill`!!
    }

private var `_gitlab-logo-fill`: ImageVector? = null
