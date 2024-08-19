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

public val BoldGroup.`List-heart-bold`: ImageVector
    get() {
        if (`_list-heart-bold` != null) {
            return `_list-heart-bold`!!
        }
        `_list-heart-bold` = Builder(name = "List-heart-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 192.0f)
                close()
                moveTo(40.0f, 76.0f)
                lineTo(216.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(40.0f, 140.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(252.0f, 144.0f)
                curveToRelative(0.0f, 17.0f, -9.53f, 33.56f, -28.32f, 49.22f)
                arcToRelative(151.47f, 151.47f, 0.0f, false, true, -26.31f, 17.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.74f, 0.0f)
                arcToRelative(151.47f, 151.47f, 0.0f, false, true, -26.31f, -17.51f)
                curveTo(141.53f, 177.56f, 132.0f, 161.0f, 132.0f, 144.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 60.0f, -26.81f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 252.0f, 144.0f)
                close()
                moveTo(228.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                curveToRelative(0.0f, 17.23f, 22.85f, 34.43f, 36.0f, 42.29f)
                curveTo(205.14f, 178.44f, 228.0f, 161.23f, 228.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_list-heart-bold`!!
    }

private var `_list-heart-bold`: ImageVector? = null
