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

public val ThinGroup.`List-heart-thin`: ImageVector
    get() {
        if (`_list-heart-thin` != null) {
            return `_list-heart-thin`!!
        }
        `_list-heart-thin` = Builder(name = "List-heart-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(40.0f, 68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 64.0f)
                close()
                moveTo(40.0f, 132.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(120.0f, 188.0f)
                lineTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(244.0f, 144.0f)
                curveToRelative(0.0f, 14.51f, -8.56f, 29.0f, -25.44f, 43.07f)
                arcToRelative(143.52f, 143.52f, 0.0f, false, true, -24.77f, 16.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, 0.0f)
                arcToRelative(143.52f, 143.52f, 0.0f, false, true, -24.77f, -16.51f)
                curveTo(148.56f, 173.0f, 140.0f, 158.51f, 140.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 52.0f, -14.41f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 244.0f, 144.0f)
                close()
                moveTo(236.0f, 144.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                curveToRelative(0.0f, 25.8f, 35.54f, 46.83f, 44.0f, 51.47f)
                curveTo(200.46f, 190.83f, 236.0f, 169.8f, 236.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_list-heart-thin`!!
    }

private var `_list-heart-thin`: ImageVector? = null
