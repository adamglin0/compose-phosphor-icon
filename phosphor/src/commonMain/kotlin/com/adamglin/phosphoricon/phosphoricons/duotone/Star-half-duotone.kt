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

public val DuotoneGroup.`Star-half-duotone`: ImageVector
    get() {
        if (`_star-half-duotone` != null) {
            return `_star-half-duotone`!!
        }
        `_star-half-duotone` = Builder(name = "Star-half-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                verticalLineTo(189.09f)
                lineTo(73.28f, 222.74f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -12.52f, -9.17f)
                lineToRelative(14.88f, -62.79f)
                lineToRelative(-48.7f, -42.0f)
                arcTo(8.46f, 8.46f, 0.0f, false, true, 31.73f, 94.0f)
                lineTo(95.64f, 88.8f)
                lineToRelative(24.62f, -59.6f)
                arcTo(8.26f, 8.26f, 0.0f, false, true, 128.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.18f, 97.26f)
                arcTo(16.38f, 16.38f, 0.0f, false, false, 224.92f, 86.0f)
                lineToRelative(-59.0f, -4.76f)
                lineTo(143.14f, 26.15f)
                arcToRelative(16.36f, 16.36f, 0.0f, false, false, -30.27f, 0.0f)
                lineTo(90.11f, 81.23f)
                lineTo(31.08f, 86.0f)
                arcToRelative(16.46f, 16.46f, 0.0f, false, false, -9.37f, 28.86f)
                lineToRelative(45.0f, 38.83f)
                lineTo(53.0f, 211.75f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 24.5f, 17.82f)
                lineTo(128.0f, 198.49f)
                lineToRelative(50.53f, 31.08f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 203.0f, 211.75f)
                lineToRelative(-13.76f, -58.07f)
                lineToRelative(45.0f, -38.83f)
                arcTo(16.43f, 16.43f, 0.0f, false, false, 239.18f, 97.26f)
                close()
                moveTo(69.09f, 215.94f)
                curveToRelative(-0.15f, 0.09f, -0.2f, 0.12f, -0.38f, 0.0f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.17f, -0.48f)
                lineToRelative(14.88f, -62.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.56f, -7.91f)
                lineToRelative(-48.7f, -42.0f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, -0.13f, -0.51f)
                curveToRelative(0.09f, -0.27f, 0.18f, -0.27f, 0.33f, -0.29f)
                lineToRelative(63.92f, -5.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 103.0f, 91.86f)
                lineToRelative(17.0f, -41.08f)
                verticalLineTo(184.63f)
                close()
                moveTo(223.84f, 102.73f)
                lineToRelative(-48.7f, 42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.56f, 7.91f)
                lineToRelative(14.88f, 62.8f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.17f, 0.48f)
                curveToRelative(-0.18f, 0.14f, -0.23f, 0.11f, -0.38f, 0.0f)
                lineTo(136.0f, 184.63f)
                verticalLineTo(50.78f)
                lineToRelative(17.0f, 41.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.75f, 4.92f)
                lineToRelative(63.91f, 5.16f)
                curveToRelative(0.16f, 0.0f, 0.25f, 0.0f, 0.34f, 0.29f)
                reflectiveCurveTo(224.0f, 102.63f, 223.84f, 102.73f)
                close()
            }
        }
        .build()
        return `_star-half-duotone`!!
    }

private var `_star-half-duotone`: ImageVector? = null
