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

public val BoldGroup.`Map-pin-line-bold`: ImageVector
    get() {
        if (`_map-pin-line-bold` != null) {
            return `_map-pin-line-bold`!!
        }
        `_map-pin-line-bold` = Builder(name = "Map-pin-line-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 220.0f)
                lineTo(160.73f, 220.0f)
                curveToRelative(5.18f, -5.0f, 10.75f, -10.71f, 16.33f, -17.13f)
                curveTo(205.15f, 170.57f, 220.0f, 136.37f, 220.0f, 104.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -184.0f, 0.0f)
                curveToRelative(0.0f, 50.0f, 34.12f, 91.94f, 59.18f, 116.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(200.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(60.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveToRelative(0.0f, 33.31f, -20.0f, 63.37f, -36.7f, 82.71f)
                arcTo(249.35f, 249.35f, 0.0f, false, true, 128.0f, 216.89f)
                arcToRelative(249.35f, 249.35f, 0.0f, false, true, -31.3f, -30.18f)
                curveTo(80.0f, 167.37f, 60.0f, 137.31f, 60.0f, 104.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 84.0f)
                close()
            }
        }
        .build()
        return `_map-pin-line-bold`!!
    }

private var `_map-pin-line-bold`: ImageVector? = null
