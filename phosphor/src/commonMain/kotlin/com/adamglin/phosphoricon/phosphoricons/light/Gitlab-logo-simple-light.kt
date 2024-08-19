package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Gitlab-logo-simple-light`: ImageVector
    get() {
        if (`_gitlab-logo-simple-light` != null) {
            return `_gitlab-logo-simple-light`!!
        }
        `_gitlab-logo-simple-light` = Builder(name = "Gitlab-logo-simple-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.21f, 117.61f)
                lineTo(208.32f, 41.49f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, -19.0f, -0.93f)
                lineTo(171.17f, 90.0f)
                lineTo(84.83f, 90.0f)
                lineTo(66.66f, 40.56f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, -19.0f, 0.93f)
                lineTo(27.79f, 117.61f)
                arcTo(55.18f, 55.18f, 0.0f, false, false, 49.0f, 176.42f)
                lineToRelative(73.27f, 51.77f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, 11.44f, 0.0f)
                lineTo(207.0f, 176.42f)
                arcTo(55.18f, 55.18f, 0.0f, false, false, 228.21f, 117.61f)
                close()
                moveTo(200.06f, 166.61f)
                lineTo(128.0f, 217.53f)
                lineTo(55.94f, 166.62f)
                arcToRelative(43.12f, 43.12f, 0.0f, false, true, -16.54f, -46.0f)
                lineTo(57.65f, 50.82f)
                lineTo(75.0f, 98.07f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.64f, 102.0f)
                horizontalLineToRelative(94.72f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 181.0f, 98.07f)
                lineToRelative(17.36f, -47.25f)
                lineToRelative(18.25f, 69.82f)
                arcTo(43.12f, 43.12f, 0.0f, false, true, 200.06f, 166.62f)
                close()
            }
        }
        .build()
        return `_gitlab-logo-simple-light`!!
    }

private var `_gitlab-logo-simple-light`: ImageVector? = null
