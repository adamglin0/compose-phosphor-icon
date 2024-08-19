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

public val BoldGroup.`Drop-half-bottom-bold`: ImageVector
    get() {
        if (`_drop-half-bottom-bold` != null) {
            return `_drop-half-bottom-bold`!!
        }
        `_drop-half-bottom-bold` = Builder(name = "Drop-half-bottom-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.88f, 6.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.76f, 0.0f)
                arcToRelative(259.0f, 259.0f, 0.0f, false, false, -42.18f, 39.0f)
                curveTo(50.85f, 77.43f, 36.0f, 111.63f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f)
                close()
                moveTo(191.61f, 168.0f)
                horizontalLineTo(64.39f)
                arcToRelative(67.1f, 67.1f, 0.0f, false, true, -3.9f, -16.0f)
                horizontalLineToRelative(135.0f)
                arcTo(67.1f, 67.1f, 0.0f, false, true, 191.61f, 168.0f)
                close()
                moveTo(96.7f, 61.29f)
                arcTo(249.35f, 249.35f, 0.0f, false, true, 128.0f, 31.11f)
                arcToRelative(249.35f, 249.35f, 0.0f, false, true, 31.3f, 30.18f)
                curveToRelative(14.0f, 16.19f, 30.27f, 39.89f, 35.2f, 66.71f)
                horizontalLineTo(61.5f)
                curveTo(66.43f, 101.18f, 82.69f, 77.48f, 96.7f, 61.29f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(67.78f, 67.78f, 0.0f, false, true, -48.12f, -20.0f)
                horizontalLineToRelative(96.24f)
                arcTo(67.78f, 67.78f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_drop-half-bottom-bold`!!
    }

private var `_drop-half-bottom-bold`: ImageVector? = null
