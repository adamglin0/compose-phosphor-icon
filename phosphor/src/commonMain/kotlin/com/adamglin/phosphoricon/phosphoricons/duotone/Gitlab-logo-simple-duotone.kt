package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Gitlab-logo-simple-duotone`: ImageVector
    get() {
        if (`_gitlab-logo-simple-duotone` != null) {
            return `_gitlab-logo-simple-duotone`!!
        }
        `_gitlab-logo-simple-duotone` = Builder(name = "Gitlab-logo-simple-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(203.52f, 171.52f)
                lineToRelative(-73.26f, 51.76f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -4.52f, 0.0f)
                lineTo(52.48f, 171.52f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, true, -18.87f, -52.4f)
                lineTo(53.5f, 43.0f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 61.0f, 42.62f)
                lineTo(80.65f, 96.0f)
                horizontalLineToRelative(94.7f)
                lineTo(195.0f, 42.62f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 7.53f, 0.38f)
                lineToRelative(19.89f, 76.12f)
                arcTo(49.0f, 49.0f, 0.0f, false, true, 203.52f, 171.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.15f, 117.1f)
                lineTo(210.25f, 41.0f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, -22.79f, -1.11f)
                lineTo(169.78f, 88.0f)
                horizontalLineTo(86.22f)
                lineTo(68.54f, 39.87f)
                arcTo(11.94f, 11.94f, 0.0f, false, false, 45.75f, 41.0f)
                lineTo(25.85f, 117.1f)
                arcToRelative(57.19f, 57.19f, 0.0f, false, false, 22.0f, 61.0f)
                lineToRelative(73.27f, 51.76f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 13.74f, 0.0f)
                lineToRelative(73.27f, -51.76f)
                arcTo(57.19f, 57.19f, 0.0f, false, false, 230.15f, 117.1f)
                close()
                moveTo(198.91f, 165.0f)
                lineTo(128.0f, 215.09f)
                lineTo(57.09f, 165.0f)
                arcToRelative(41.1f, 41.1f, 0.0f, false, true, -15.75f, -43.84f)
                lineTo(58.0f, 57.5f)
                lineTo(73.13f, 98.76f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.64f, 104.0f)
                horizontalLineToRelative(94.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.51f, -5.24f)
                lineTo(198.0f, 57.5f)
                lineToRelative(16.63f, 63.65f)
                arcTo(41.1f, 41.1f, 0.0f, false, true, 198.91f, 165.0f)
                close()
            }
        }
        .build()
        return `_gitlab-logo-simple-duotone`!!
    }

private var `_gitlab-logo-simple-duotone`: ImageVector? = null
