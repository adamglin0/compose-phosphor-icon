package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Drop-half-bottom`: ImageVector
    get() {
        if (`_drop-half-bottom` != null) {
            return `_drop-half-bottom`!!
        }
        `_drop-half-bottom` = Builder(name = "Drop-half-bottom", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(187.83f, 184.0f)
                horizontalLineTo(68.17f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -8.0f, -16.0f)
                horizontalLineTo(195.87f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 187.83f, 184.0f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(70.57f, 70.57f, 0.0f, false, true, -0.46f, 8.0f)
                horizontalLineTo(56.46f)
                arcToRelative(70.57f, 70.57f, 0.0f, false, true, -0.46f, -8.0f)
                quadToRelative(0.0f, -4.0f, 0.36f, -8.0f)
                horizontalLineTo(199.64f)
                quadTo(200.0f, 140.0f, 200.0f, 144.0f)
                close()
                moveTo(128.0f, 26.0f)
                curveToRelative(14.16f, 11.1f, 56.86f, 47.74f, 68.84f, 94.0f)
                horizontalLineTo(59.16f)
                curveTo(71.14f, 73.76f, 113.84f, 37.12f, 128.0f, 26.0f)
                close()
                moveTo(82.81f, 200.0f)
                horizontalLineToRelative(90.38f)
                arcToRelative(71.82f, 71.82f, 0.0f, false, true, -90.38f, 0.0f)
                close()
            }
        }
        .build()
        return `_drop-half-bottom`!!
    }

private var `_drop-half-bottom`: ImageVector? = null
