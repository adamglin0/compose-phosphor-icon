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

public val DuotoneGroup.`Drop-half-duotone`: ImageVector
    get() {
        if (`_drop-half-duotone` != null) {
            return `_drop-half-duotone`!!
        }
        `_drop-half-duotone` = Builder(name = "Drop-half-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 144.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f)
                verticalLineTo(16.0f)
                reflectiveCurveTo(208.0f, 72.0f, 208.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.75f)
                arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f)
                arcTo(254.19f, 254.19f, 0.0f, false, false, 82.0f, 47.75f)
                curveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f)
                close()
                moveTo(56.0f, 144.0f)
                curveToRelative(0.0f, -50.0f, 42.26f, -92.71f, 64.0f, -111.4f)
                lineTo(120.0f, 215.54f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 56.0f, 144.0f)
                close()
                moveTo(136.0f, 215.54f)
                lineTo(136.0f, 32.6f)
                curveTo(157.74f, 51.29f, 200.0f, 94.0f, 200.0f, 144.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 136.0f, 215.54f)
                close()
            }
        }
        .build()
        return `_drop-half-duotone`!!
    }

private var `_drop-half-duotone`: ImageVector? = null
