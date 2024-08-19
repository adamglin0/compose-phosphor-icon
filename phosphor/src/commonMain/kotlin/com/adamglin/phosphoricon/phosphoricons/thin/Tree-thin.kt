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

public val ThinGroup.`Tree-thin`: ImageVector
    get() {
        if (`_tree-thin` != null) {
            return `_tree-thin`!!
        }
        `_tree-thin` = Builder(name = "Tree-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.0f, 65.59f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -134.0f, 0.0f)
                arcToRelative(67.72f, 67.72f, 0.0f, false, false, -41.0f, 62.22f)
                curveToRelative(-0.1f, 36.0f, 30.24f, 67.26f, 66.25f, 68.17f)
                arcTo(68.24f, 68.24f, 0.0f, false, false, 124.0f, 185.66f)
                verticalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(185.67f)
                arcTo(68.09f, 68.09f, 0.0f, false, false, 168.0f, 196.0f)
                lineToRelative(1.72f, 0.0f)
                curveToRelative(36.0f, -0.91f, 66.34f, -32.13f, 66.24f, -68.17f)
                arcTo(67.73f, 67.73f, 0.0f, false, false, 195.0f, 65.59f)
                close()
                moveTo(169.55f, 188.0f)
                arcTo(60.15f, 60.15f, 0.0f, false, true, 132.0f, 176.0f)
                verticalLineToRelative(-45.5f)
                lineToRelative(45.79f, -22.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, -7.16f)
                lineTo(132.0f, 121.53f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(57.53f)
                lineTo(81.79f, 124.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, 7.16f)
                lineTo(124.0f, 154.47f)
                verticalLineTo(176.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -37.55f, 12.0f)
                curveToRelative(-31.77f, -0.8f, -58.54f, -28.35f, -58.45f, -60.15f)
                arcToRelative(59.77f, 59.77f, 0.0f, false, true, 37.62f, -55.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 67.88f, 70.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 120.24f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.26f, 2.33f)
                arcTo(59.79f, 59.79f, 0.0f, false, true, 228.0f, 127.83f)
                curveTo(228.09f, 159.63f, 201.32f, 187.18f, 169.55f, 188.0f)
                close()
            }
        }
        .build()
        return `_tree-thin`!!
    }

private var `_tree-thin`: ImageVector? = null
